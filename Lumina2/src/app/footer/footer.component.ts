import { Component } from '@angular/core';
import { MaterialModule } from '../material.module';
import { faWhatsapp, fab } from '@fortawesome/free-brands-svg-icons';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

@Component({
  selector: 'app-footer',
  standalone: true,
  imports: [FontAwesomeModule],
  templateUrl: './footer.component.html',
  styleUrl: './footer.component.scss'
})
export class FooterComponent {
  fab = fab;
  faWhatsapp = faWhatsapp
}
