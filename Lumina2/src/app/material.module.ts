import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { BlogComponent } from './blog/blog.component';
import { ParceirosComponent } from './parceiros/parceiros.component';




@NgModule({
    imports: [ FormsModule, RouterLink,
            ReactiveFormsModule, HomeComponent,
            HeaderComponent, FooterComponent, BlogComponent, ParceirosComponent
            ],
    exports: [ FormsModule, RouterLink, HeaderComponent, HomeComponent, FooterComponent,
                BlogComponent, ParceirosComponent
            ], 
})

export class MaterialModule {
  
 }