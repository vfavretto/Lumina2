function troca(botao) {
    // Remove a classe 'ativo' de todos os botões
    var botoes = document.querySelectorAll('.botoesPrincipais button');
    botoes.forEach(function (btn) {
      btn.classList.remove('ativo');
    });

    // Adiciona a classe 'ativo' apenas ao botão clicado
    botao.classList.add('ativo');
}