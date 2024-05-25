import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
import { MaterialModule } from './material.module';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MaterialModule, FontAwesomeModule, RouterLink, RouterLinkActive],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})

export class AppComponent {
  title = 'Lumina2';
  
}
