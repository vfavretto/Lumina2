import { Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { HomeComponent } from './pages/home/home.component';
import { BlogComponent } from './pages/blog/blog.component';
import { AboutComponent } from './pages/about/about.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { PartnersComponent } from './pages/partners/partners.component';
import { AutenticarGuard } from './autenticar.guard';
import { AppComponent } from './app.component';
import { HeaderComponent } from './pages/header/header.component';

export const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'login', component: LoginComponent },
    { path: 'home', component: HomeComponent },
    { path: 'blog', component: BlogComponent },
    { path: 'about', component: AboutComponent },
    { path: 'profile', component: ProfileComponent, canActivate: [AutenticarGuard] },
    { path: 'partners', component: PartnersComponent },
    { path: '#', component: HeaderComponent },
];
