import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class VerificaCredenciaisService {
  private userLogin: any = null;

  constructor() { }

  autenticarUsuario(userLogin: any): boolean {
    const isLocalData = localStorage.getItem("angular18Local");
    if (isLocalData != null) {
      const users = JSON.parse(isLocalData);
      const isUserFound = users.find((m: any) => m.userName === userLogin.userName && m.password === userLogin.password);
      if (isUserFound) {
        this.userLogin = userLogin;
        return true;
      }
    }
    return false;
  }

  isUserAuthenticated(): boolean {
    return this.userLogin !== null;
  }
}
