package lumina.Controller;

import javax.swing.*;
import luminabe.Model.Empresa.*;
import luminabe.Model.Admnistrador.*;

public class Controller {

    public int AdmID = 0;

    private ListaInformacoes listaInformacoes;
    private DefaultListModel<String> empresasModel;
    private DefaultListModel<String> chamadosModel;
    private JList<String> jListEmpresasCadastradas;
    private JList<String> jListChamadosAbertos;

    public Controller() {

    }

    public Controller(ListaInformacoes listaInformacoes, DefaultListModel<String> empresasModel, DefaultListModel<String> chamadosModel, JList<String> jListEmpresasCadastradas, JList<String> jListChamadosAbertos) {
        this.listaInformacoes = listaInformacoes;
        this.empresasModel = empresasModel;
        this.chamadosModel = chamadosModel;
        this.jListEmpresasCadastradas = jListEmpresasCadastradas;
        this.jListChamadosAbertos = jListChamadosAbertos;
    }

    public void configurarModelos(DefaultListModel<String> empresasModel, DefaultListModel<String> chamadosModel) {
        this.empresasModel = empresasModel;
        this.chamadosModel = chamadosModel;
    }

    public boolean login(String usuario, String senha) {
        Adm novoAdm = new Adm(AdmID, usuario, senha);
        if (novoAdm.login()) {
            AdmID++;
            return true;
        } else {
            return false;
        }
    }

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
                filtroLista(busca);
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

    public void atualizarLista(ListaInformacoes listaInformacoes) {
        this.listaInformacoes = listaInformacoes;
        this.empresasModel.clear();
        this.chamadosModel.clear();

        if (listaInformacoes != null) {
            for (Empresa empresa : listaInformacoes.getEmpresas()) {
                this.empresasModel.addElement(empresa.getNomeEmpresa());
            }
            this.jListEmpresasCadastradas.setModel(empresasModel);

            for (Chamado chamado : listaInformacoes.getChamados()) {
                String infoChamado = chamado.getDataInicio() + " - " + chamado.getNomeResponsavel();
                this.chamadosModel.addElement(infoChamado);
            }
            this.jListChamadosAbertos.setModel(chamadosModel);
        } else {
            System.out.println("Erro ao carregar a lista de empresas.");
        }
    }

    public void filtroLista(String busca) {
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
                atualizarLista(listaInformacoes);
            }
        } else {
            System.out.println("Lista de empresas vazia ou nula.");
        }
    }
}
