import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { VerificaCredenciaisService } from '../../verifica-credenciais.service';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  isLoginView: boolean = true;

  userRegisterObj: any = {
    userName: '',
    password: '',
    emailId: ''
  }

  userLogin: any = {
    userName: '',
    password: '',
  }


  constructor(private verificaCredenciaisService: VerificaCredenciaisService, private router: Router) { }

  onRegister() {
    debugger;
    const isLocalData = localStorage.getItem("angular18Local");
    if (isLocalData != null) {
      const localArray = JSON.parse(isLocalData);
      localArray.push(this.userRegisterObj);
      localStorage.setItem("angular18Local", JSON.stringify(localArray))
    } else {
      const localArray = [];
      localArray.push(this.userRegisterObj);
      localStorage.setItem("angular18Local", JSON.stringify(localArray))
    }
    alert("Registration Success");
  }

  onLogin() {
    const isUserAuthenticated = this.verificaCredenciaisService.autenticarUsuario(this.userLogin);
    if (isUserAuthenticated) {
      this.router.navigate(['/profile']);
    } else {
      alert("User name or password is Wrong")
    }
  }
  
}
