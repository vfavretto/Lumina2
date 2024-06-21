import { inject } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { AuthService } from '../service/auth.service';


  export const AuthGuard = () => {
    const autorizaService = inject(AuthService);
    const router = inject(Router);

  if (autorizaService.statusLogin()) {
    autorizaService.login();
      return true;
  }else{
     // autorizaService.deslogar();
      router.navigate(['login']);
      return false;
  }
}







