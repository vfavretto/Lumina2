package lumina.Controller;

import javax.swing.*;
import luminabe.Model.Empresa.*;
import luminabe.Model.Admnistrador.Adm;
import luminabe.Model.Admnistrador.Blog;

public class Controller {

    //Atributos
    public int AdmID = 0;
    private ListaInformacoes listaInformacoes;
    private DefaultListModel<String> empresasModel;
    private DefaultListModel<String> chamadosModel;
    private JList<String> jListEmpresasCadastradas;
    private JList<String> jListChamadosAbertos;
    private DefaultComboBoxModel<String> chamadosFinalizadosModel;
    private JComboBox<String> boxChamadosFinalizados;
    private DefaultComboBoxModel<String> noticiasModel;
    private JComboBox<String> boxListaDeNoticias;

    //Construtor
    public Controller() {

    }

    public Controller(ListaInformacoes listaInformacoes, DefaultListModel<String> empresasModel, DefaultListModel<String> chamadosModel, JList<String> jListEmpresasCadastradas, JList<String> jListChamadosAbertos, JComboBox<String> boxChamadosFinalizados, JComboBox<String> boxListaDeNoticias) {
        this.listaInformacoes = listaInformacoes;
        this.empresasModel = empresasModel;
        this.chamadosModel = chamadosModel;
        this.jListEmpresasCadastradas = jListEmpresasCadastradas;
        this.jListChamadosAbertos = jListChamadosAbertos;
        this.boxChamadosFinalizados = boxChamadosFinalizados;
        this.boxListaDeNoticias = boxListaDeNoticias;
        this.chamadosFinalizadosModel = new DefaultComboBoxModel<>();
        this.noticiasModel = new DefaultComboBoxModel<>();
    }

    //Metodos
    //Login
    public boolean login(String usuario, String senha) {
        Adm novoAdm = new Adm(AdmID, usuario, senha);
        if (novoAdm.login()) {
            AdmID++;
            return true;
        } else {
            return false;
        }
    }

    //Metodos Gerenciar Empresas
    public void editarEmpresa(Empresa empresa, String novoNome, String novoEmail, String novoTelefone, String novaSenha, tipoEmpresa novoTipo) {
        empresa.setNomeEmpresa(novoNome);
        empresa.setEmailEmpresa(novoEmail);
        empresa.setTelefoneEmpresa(novoTelefone);
        empresa.setSenha(novaSenha);
        empresa.setTipoEmpresa(novoTipo);
    }

    public void apagarEmpresa(Empresa empresaSelecionada, String busca) {
        if (empresaSelecionada != null) {
            int indiceOriginal = listaInformacoes.getEmpresas().indexOf(empresaSelecionada);
            if (indiceOriginal != -1) {
                listaInformacoes.getEmpresas().remove(indiceOriginal);
                atualizarLista(listaInformacoes);
                buscarEmpresa(busca);
                System.out.println("Empresa apagada: " + empresaSelecionada.getNomeEmpresa());
            } else {
                System.out.println("Erro: Índice original inválido.");
            }
        } else {
            System.out.println("Erro: Empresa não selecionada.");
        }
    }

    public void limparCampos(JTextField fieldNomeEmp, JTextField fieldEmailEmp, JTextField fieldTelEmp, JTextField fieldSenhaGer, JComboBox<String> boxTipos) {
        fieldNomeEmp.setText("");
        fieldEmailEmp.setText("");
        fieldTelEmp.setText("");
        fieldSenhaGer.setText("");
        boxTipos.setSelectedItem("");
    }

    public void desabilitaEdicaoEmpresa(JTextField fieldNomeEmp, JTextField fieldEmailEmp, JTextField fieldTelEmp, JTextField fieldSenhaGer, JComboBox<String> boxTipos, JButton btnEditarCadastro) {
        fieldNomeEmp.setEditable(false);
        fieldEmailEmp.setEditable(false);
        fieldTelEmp.setEditable(false);
        fieldSenhaGer.setEditable(false);
        boxTipos.setEnabled(false);
        btnEditarCadastro.setText("Editar");
    }

    public void habilitaEdicaoEmpresa(JTextField fieldNomeEmp, JTextField fieldEmailEmp, JTextField fieldTelEmp, JTextField fieldSenhaGer, JComboBox<String> boxTipos, JButton btnEditarCadastro) {
        fieldNomeEmp.setEditable(true);
        fieldEmailEmp.setEditable(true);
        fieldTelEmp.setEditable(true);
        fieldSenhaGer.setEditable(true);
        boxTipos.setEnabled(true);
        btnEditarCadastro.setText("Salvar");
    }

    public void salvaAlteracaoEmpresa(JList<String> jListEmpresasCadastradas, ListaInformacoes listaInformacoes, JTextField fieldNomeEmp, JTextField fieldEmailEmp, JTextField fieldTelEmp, JTextField fieldSenhaGer, JComboBox<String> boxTipos, DefaultListModel<String> empresasModel) {
        int index = jListEmpresasCadastradas.getSelectedIndex();
        if (index != -1 && listaInformacoes != null && index < listaInformacoes.getEmpresas().size()) {
            Empresa empresaSelecionada = listaInformacoes.getEmpresas().get(index);
            editarEmpresa(empresaSelecionada, fieldNomeEmp.getText(), fieldEmailEmp.getText(), fieldTelEmp.getText(), fieldSenhaGer.getText(), tipoEmpresa.valueOf(boxTipos.getSelectedItem().toString()));
            atualizarLista(listaInformacoes);
            empresasModel.set(index, empresaSelecionada.getNomeEmpresa());
        } else {
            System.out.println("Erro ao salvar alterações.");
        }
    }

    public Empresa selecionaEmpresa(int indice, ListaInformacoes listaInformacoes, JList<String> listaEmpresas) {
        if (indice != -1 && listaInformacoes != null) {
            String nomeEmpresaSelecionada = listaEmpresas.getModel().getElementAt(indice);
            for (Empresa empresa : listaInformacoes.getEmpresas()) {
                if (empresa.getNomeEmpresa().equals(nomeEmpresaSelecionada)) {
                    listaEmpresas.setSelectedIndex(indice);
                    return empresa;
                }
            }
        }
        return null;
    }

    public void carregaEmpresa(Empresa empresaSelecionada, JTextField fieldNomeEmp, JTextField fieldEmailEmp, JTextField fieldTelEmp, JTextField fieldSenhaGer, JComboBox<String> boxTipos, JList<String> jListEmpresasCadastradas) {
        if (empresaSelecionada != null) {
            fieldNomeEmp.setText(empresaSelecionada.getNomeEmpresa());
            fieldEmailEmp.setText(empresaSelecionada.getEmailEmpresa());
            fieldTelEmp.setText(empresaSelecionada.getTelefoneEmpresa());
            fieldSenhaGer.setText(empresaSelecionada.getSenha());
            boxTipos.setSelectedItem(empresaSelecionada.getTipoEmpresa().toString());
        } else {
            System.out.println("Erro ao obter a empresa selecionada.");
        }
    }
    
    
    public void buscarEmpresa(String busca) {
        if (listaInformacoes != null && !listaInformacoes.getEmpresas().isEmpty()) {
            DefaultListModel<String> nomeFiltrado = new DefaultListModel<>();
            for (Empresa empresa : listaInformacoes.getEmpresas()) {
                if (empresa.getNomeEmpresa().toLowerCase().contains(busca.toLowerCase())) {
                    nomeFiltrado.addElement(empresa.getNomeEmpresa());
                }
            }
            if (!nomeFiltrado.isEmpty()) {
                jListEmpresasCadastradas.setModel(nomeFiltrado);
            } else {
                jListEmpresasCadastradas.setModel(new DefaultListModel<>());
            }
        } else {
            System.out.println("Lista de empresas vazia ou nula.");
        }
    }

    //Metodos Suporte
    public Chamado selecionaChamado(int indice, ListaInformacoes listaInformacoes, JList<String> listaChamados) {
        if (indice != -1 && listaInformacoes != null) {
            String selectedValue = listaChamados.getModel().getElementAt(indice);
            for (Chamado chamado : listaInformacoes.getChamados()) {
                String infoChamado = chamado.getDataInicio() + " - " + chamado.getNomeResponsavel();
                if (infoChamado.equals(selectedValue)) {
                    listaChamados.setSelectedIndex(indice);
                    return chamado;
                }
            }
        }
        return null;
    }

    public void finalizarChamado(int indiceSelecionado) {
        if (indiceSelecionado >= 0 && indiceSelecionado < listaInformacoes.getChamados().size()) {
            Chamado chamado = listaInformacoes.getChamados().get(indiceSelecionado);
            chamado.setStatusChamado(statusChamado.FINALIZADO);
            atualizarLista(listaInformacoes);
        } else {
            System.out.println("Erro: índice do chamado inválido.");
        }
    }

    public void reabrirChamado(String nomeResponsavel) {
        if (listaInformacoes != null && !listaInformacoes.getChamados().isEmpty()) {
            for (Chamado chamado : listaInformacoes.getChamados()) {
                String nomeChamado = chamado.getNomeResponsavel();
                int indiceSeparador = nomeResponsavel.indexOf(" - ");
                if (indiceSeparador != -1) {
                    String nomeSemData = nomeResponsavel.substring(indiceSeparador + 3); // +3 para ignorar " - "
                    if (nomeChamado.equalsIgnoreCase(nomeSemData)) {
                        chamado.setStatusChamado(statusChamado.ABERTO);
                        atualizarLista(listaInformacoes);
                        System.out.println("Chamado reaberto para: " + nomeResponsavel);
                        return; // Encerra o método após encontrar o chamado correspondente
                    }
                } else {
                    System.out.println("Formato de chamado inválido: " + nomeResponsavel);
                }
            }
            System.out.println("Chamado não encontrado para: " + nomeResponsavel);
        } else {
            System.out.println("Lista de chamados vazia ou nula.");
        }
    }

    public void buscarChamado(String busca) {
        if (busca != null && !busca.trim().isEmpty()) {
            DefaultListModel<String> chamadosFiltrados = new DefaultListModel<>();
            for (Chamado chamado : listaInformacoes.getChamados()) {
                if (chamado.getStatusChamado() == statusChamado.ABERTO
                        && chamado.getNomeResponsavel().toLowerCase().contains(busca.toLowerCase())) {
                    String infoChamado = chamado.getDataInicio() + " - " + chamado.getNomeResponsavel();
                    chamadosFiltrados.addElement(infoChamado);
                }
            }
            jListChamadosAbertos.setModel(chamadosFiltrados);
        } else {
            atualizarLista(listaInformacoes);
        }
    }

    //Metodos Gerenciar Blog
    public void postarNoticia(String tituloNoticia, String conteudoNoticia, String urlPostagem) {
        Blog novaNoticia = new Blog();
        novaNoticia.setTitulo(tituloNoticia);
        novaNoticia.setTexto(conteudoNoticia);
        novaNoticia.setUrlImagem(urlPostagem);

        listaInformacoes.adicionarPostagem(novaNoticia);
        atualizarLista(listaInformacoes);

        System.out.println("Nova notícia criada:\nTítulo: " + novaNoticia.getTitulo() + "\nConteúdo: " + novaNoticia.getTexto() + "\nImagem: " + novaNoticia.getUrlImagem());
    }

    public Blog encontraNoticia(String tituloBuscado) {
        for (Blog noticia : listaInformacoes.getPostagens()) {
            if (noticia.getTitulo().equals(tituloBuscado)) {
                return noticia;
            }
        }
        return null;
    }

    //Metodos Gerais
    public void atualizarLista(ListaInformacoes listaInformacoes) {
        this.atualizarLista(listaInformacoes, chamadosFinalizadosModel, noticiasModel);
    }

    public void atualizarLista(ListaInformacoes listaInformacoes, DefaultComboBoxModel<String> chamadosFinalizadosModel, DefaultComboBoxModel<String> noticiasModel) {
        this.listaInformacoes = listaInformacoes;
        this.empresasModel.clear();
        this.chamadosModel.clear();
        this.chamadosFinalizadosModel.removeAllElements();
        this.noticiasModel.removeAllElements();

        if (listaInformacoes != null) {
            for (Empresa empresa : listaInformacoes.getEmpresas()) {
                this.empresasModel.addElement(empresa.getNomeEmpresa());
            }
            this.jListEmpresasCadastradas.setModel(empresasModel);

            for (Chamado chamado : listaInformacoes.getChamados()) {
                if (chamado.getStatusChamado() == statusChamado.ABERTO) {
                    String infoChamado = chamado.getDataInicio() + " - " + chamado.getNomeResponsavel();
                    this.chamadosModel.addElement(infoChamado);
                } else if (chamado.getStatusChamado() == statusChamado.FINALIZADO) {
                    String infoChamado = chamado.getDataInicio() + " - " + chamado.getNomeResponsavel();
                    this.chamadosFinalizadosModel.addElement(infoChamado); // Adiciona ao modelo dos chamados finalizados
                }
            }
            this.jListChamadosAbertos.setModel(chamadosModel);
            this.boxChamadosFinalizados.setModel(chamadosFinalizadosModel); // Define o modelo do JComboBox

            for (Blog blog : listaInformacoes.getPostagens()) {
                this.noticiasModel.addElement(blog.getTitulo());
            }
            this.boxListaDeNoticias.setModel(noticiasModel); // Define o modelo do JComboBox
        } else {
            System.out.println("Erro ao carregar a lista de empresas.");
        }
    }


}
