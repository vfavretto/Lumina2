import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../header/header.component';
import { RouterOutlet, Routes } from '@angular/router';
import { FooterComponent } from '../footer/footer.component';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';
import { Injectable, inject } from '@angular/core';
import {GlobalService} from '../global.service'; 

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [HeaderComponent, RouterOutlet, FooterComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})

@Injectable({  providedIn: 'root' })

export class LoginComponent implements OnInit {

  constructor(private authService:LoginService,
   private globalService: GlobalService,
    
  ) {  }

  public descricaoLogin !: string

  ngOnInit(): void {
    if (this.authService.statusLogin()) {
     
      this.descricaoLogin = "Estou Autorizado" ;
    } else {
    
      this.descricaoLogin = "Não Autorizado";
    }

    console.log(this.descricaoLogin);
}
clickLogin(){
  if (this.authService.statusLogin()) {
    this.authService.deslogar();
    this.descricaoLogin = "Não Autorizado";
    this.globalService.setLoginRead(false); // Atualizando o valor de loginread
  }else{
    this.authService.autorizar();
    this.descricaoLogin = "Autorizado";
    this.globalService.setLoginRead(true); // Atualizando o valor de loginread
  }
};
  
}
