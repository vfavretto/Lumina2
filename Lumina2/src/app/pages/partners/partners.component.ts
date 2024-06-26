import { Component } from '@angular/core';

@Component({
  selector: 'app-partners',
  standalone: true,
  templateUrl: './partners.component.html',
  styleUrls: ['./partners.component.css']
})
export class PartnersComponent {

  troca(event: Event): void {
    const button = event.target as HTMLButtonElement;

    // Remove a classe 'ativo' de todos os botões
    const botoes = document.querySelectorAll('.botoesPrincipais button');
    botoes.forEach(btn => btn.classList.remove('ativo'));

    // Adiciona a classe 'ativo' apenas ao botão clicado
    button.classList.add('ativo');
  }
}
