import { Injectable, OnInit } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService implements OnInit {

  private storageKey = 'userState';

  constructor() {}

  statusLogin(): boolean {
    console.log('statusLogin');

    return this.getUserState() != null;
  }

  autorizar(){
    const userState = { login: 'SIM' };
    this.setUserState(userState);
    }

    deslogar(){
    
      if (typeof sessionStorage === 'undefined') {
        console.warn('localStorage is not available');
       // return null;
      }else
        sessionStorage?.clear();
    }
  
     getUserState(): any {
      if (typeof sessionStorage === 'undefined') {
        console.warn('localStorage is not available');
        return null;
      }
    
      console.log("getUserState");
      const state = sessionStorage.getItem(this.storageKey);
      return state ? JSON.parse(state) : null;
      
    }
  
    setUserState(state: any): void {
      console.log("setUserState");
      sessionStorage.setItem(this.storageKey,  JSON.stringify(state));
    }
  
  
    ngOnInit(): void {
      
    }
}

