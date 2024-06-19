import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../header/header.component';
import { RouterOutlet, Routes } from '@angular/router';
import { FooterComponent } from '../footer/footer.component';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [HeaderComponent, RouterOutlet, FooterComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent implements OnInit {

  username: string = '';
  password: string = '';

  constructor(private LoginService: LoginService, private router: Router) {}

  ngOnInit(): void { }

  login(): void {
    if (this.LoginService.login(this.username, this.password)) {
      this.router.navigate(['/perfil']);
    } else {
      // Exibir mensagem de erro de login
    }
  }
}
