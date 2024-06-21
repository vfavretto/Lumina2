import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

//  autorizado = false;

  constructor() { }


  login() {
    // Simulação de autenticação 
    localStorage.setItem("login","SIM");
    }

  deslogar(){
    localStorage.clear();
  }

  statusLogin(){
    return !!localStorage.getItem("login");
  }
  
  

}
