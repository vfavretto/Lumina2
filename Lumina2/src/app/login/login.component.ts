import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../header/header.component';
import { RouterOutlet } from '@angular/router';
import { FooterComponent } from '../footer/footer.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [HeaderComponent, RouterOutlet, FooterComponent, FormsModule],
  templateUrl:'./login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent implements OnInit {

  username: string = '';
  password: string = '';

  constructor() { }

  ngOnInit(): void { }

  login() : boolean  {
    // Simulação de autenticação
    if (this.username == 'admin' && this.password == 'senha123') {
      // Login bem-sucedido! Redirecionar para página protegida
      console.log('Login bem-sucedido!');
      return true
      

      // ... Navegue para a rota protegida (ex: '/dashboard')
    } else {
      alert('Credenciais inválidas!');
      return false
    }
  }
}
