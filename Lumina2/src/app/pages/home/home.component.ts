import { isPlatformBrowser } from '@angular/common';
import { Component, ElementRef, Inject, OnInit, PLATFORM_ID, Renderer2 } from '@angular/core';
import { RouterLink, RouterLinkActive } from '@angular/router';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterLink, RouterLinkActive],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {

  constructor(
    @Inject(PLATFORM_ID) private platformId: Object,
    private renderer: Renderer2,
    private el: ElementRef
  ) {}

  ngOnInit(): void {
    if (isPlatformBrowser(this.platformId)) {
      let carouselBlog = this.el.nativeElement.querySelector(".carouselBlog") as HTMLElement;
      let proximoBlog = this.el.nativeElement.querySelector(".proximoBlog") as HTMLElement;
      let anteriorBlog = this.el.nativeElement.querySelector(".anteriorBlog") as HTMLElement;
      let tamanhoCarousel = carouselBlog.scrollWidth;
      let itemBlog = this.el.nativeElement.querySelector(".itemBlog") as HTMLElement | null;
      let tamanhoCard = itemBlog ? itemBlog.offsetWidth : 0;
      let posicao = 0;
      
      this.renderer.listen(proximoBlog, "click", () => {
        if (posicao < (tamanhoCarousel - tamanhoCard * 4)) {
          posicao += tamanhoCard;
          carouselBlog.scrollTo({
            left: posicao,
            behavior: "smooth"
          });
        }
      });
      
      this.renderer.listen(anteriorBlog, "click", () => {
        if (posicao > 0) {
          posicao -= tamanhoCard;
          carouselBlog.scrollTo({
            left: posicao,
            behavior: "smooth"
          });
        }
      });
    }
  }
  
  

}
