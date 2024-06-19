import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  public isLoggedIn: boolean = false;

  login(username: string, password: string): boolean {
    // Simule a autenticação com base em credenciais simples
    if (username === 'admin' && password === 'password') {
      this.isLoggedIn = true;
      return true;
    } else {
      return false;
    }
  }

  logout(): void {
    this.isLoggedIn = false;
  }

}

