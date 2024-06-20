import { Injectable, OnInit, inject } from '@angular/core';
import { LoginService } from './login.service';
import { Router } from '@angular/router';

Injectable({
  providedIn: 'root'
})
export const authGuard = () => {
  const loginService = inject(LoginService);
  const router = inject(Router);

  if (loginService.statusLogin()){
      loginService.autorizar();
      return true;
  }else{
    loginService.deslogar();
    router.navigate(['/perfil']);
    return false;
  }
  
  
};

export class AuthGuard {

  constructor(private authService: LoginService, private router: Router) { }

  canActivate(): boolean {
    localStorage.clear();
    console.log('localStorage has been cleared by AuthGuard.');

    if (this.authService.statusLogin()){
      return true;
    }else{
      this.router.navigate(['/perfil']);
      return false;
    }
  }
}
