import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { BlogComponent } from './blog/blog.component';
import { ParceirosComponent } from './parceiros/parceiros.component';
import { SobreComponent } from './sobre/sobre.component';

export const routes: Routes = [
     { path: '', component: HomeComponent },
     { path: 'home', component: HomeComponent },
     {path: 'login', component: LoginComponent},
     {path: 'blog', component: BlogComponent},
     {path: 'parceiros', component: ParceirosComponent},
     {path: 'sobre', component: SobreComponent},
     { path: '**', component: HomeComponent },
];
