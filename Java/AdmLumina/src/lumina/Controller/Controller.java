package lumina.Controller;

import javax.swing.*;
import luminabe.Model.Empresa.*;
import luminabe.Model.Admnistrador.*;

public class Controller {

    public int AdmID = 0;

    private ListaEmpresas listaEmpresas;
    private DefaultListModel<String> listModel;
    private JList<String> jListEmpresasCadastradas;

    public Controller() {

    }

    public Controller(ListaEmpresas listaEmpresas, DefaultListModel<String> listModel, JList<String> jListEmpresasCadastradas) {
        this.listaEmpresas = listaEmpresas;
        this.listModel = listModel;
        this.jListEmpresasCadastradas = jListEmpresasCadastradas;
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
        // Aqui você pode adicionar a lógica para salvar as alterações no banco de dados, por exemplo
    }

//    public void apagarEmpresa(int indiceEmpresa) {
//    if (indiceEmpresa >= 0 && indiceEmpresa < listaEmpresas.getEmpresas().size()) {
//        Empresa empresaApagar = listaEmpresas.getEmpresas().get(indiceEmpresa);
//        listaEmpresas.getEmpresas().remove(empresaApagar);
//        listModel.remove(indiceEmpresa);
//        System.out.println("Empresa apagada: " + empresaApagar.getNomeEmpresa());
//    } else {
//        System.out.println("Índice inválido para apagar empresa.");
//    }
//}
    public void apagarEmpresa(Empresa empresaSelecionada, String busca) {
        if (empresaSelecionada != null) {
            int indiceOriginal = listaEmpresas.getEmpresas().indexOf(empresaSelecionada); // Obtém o índice na lista original
            if (indiceOriginal != -1) {
                listaEmpresas.getEmpresas().remove(indiceOriginal); // Remove a empresa da lista original
                atualizarLista(listaEmpresas); // Atualiza a lista exibida
                filtroLista(busca);
                System.out.println("Empresa apagada: " + empresaSelecionada.getNomeEmpresa());
            } else {
                System.out.println("Erro: Índice original inválido.");
            }
        } else {
            System.out.println("Erro: Empresa não selecionada.");
        }
    }
    
    public void limparCampos(JTextField fieldNomeEmp, JTextField fieldEmailEmp, JTextField fieldTelEmp,JTextField fieldSenhaGer,JComboBox<String> boxTipos) {
                fieldNomeEmp.setText("");
                fieldEmailEmp.setText("");
                fieldTelEmp.setText("");
                fieldSenhaGer.setText("");
                boxTipos.setSelectedItem("");
    }

    public void atualizarLista(ListaEmpresas listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
        this.listModel.clear();
        if (listaEmpresas != null) {
            for (Empresa empresa : listaEmpresas.getEmpresas()) {
                this.listModel.addElement(empresa.getNomeEmpresa());
            }
            this.jListEmpresasCadastradas.setModel(listModel);
        } else {
            System.out.println("Erro ao carregar a lista de empresas.");
        }
    }

    public void filtroLista(String busca) {
        System.out.println(busca);
        if (listaEmpresas != null && !listaEmpresas.getEmpresas().isEmpty()) {
            DefaultListModel<String> nomeFiltrado = new DefaultListModel<>();
            for (Empresa empresa : listaEmpresas.getEmpresas()) {
                if (empresa.getNomeEmpresa().toLowerCase().contains(busca.toLowerCase())) {
                    nomeFiltrado.addElement(empresa.getNomeEmpresa());
                }
            }
            if (!nomeFiltrado.isEmpty()) {
                jListEmpresasCadastradas.setModel(nomeFiltrado);
            } else {
                atualizarLista(listaEmpresas);
            }
        } else {
            System.out.println("Lista de empresas vazia ou nula.");
        }
    }

}
