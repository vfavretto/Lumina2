import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { VerificaCredenciaisService } from './verifica-credenciais.service';

@Injectable({
  providedIn: 'root'
})
export class AutenticarGuard implements CanActivate {

  constructor(private verificaCredenciaisService: VerificaCredenciaisService, private router: Router) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
    if (this.verificaCredenciaisService.isUserAuthenticated()) {
      return true;
    } else {
      this.router.navigate(['/login']);
      return false;
    }
  }
}
