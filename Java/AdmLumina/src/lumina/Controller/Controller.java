
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
        Adm novoAdm = new Adm(AdmID,usuario, senha);
       if (novoAdm.login()) {
            AdmID++;
            return true;
        }
       else {
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
    
    public void apagarEmpresa(int indiceEmpresa) {
    if (indiceEmpresa >= 0 && indiceEmpresa < listaEmpresas.getEmpresas().size()) {
        Empresa empresaApagar = listaEmpresas.getEmpresas().get(indiceEmpresa);
        listaEmpresas.getEmpresas().remove(empresaApagar);
        listModel.remove(indiceEmpresa);
        System.out.println("Empresa apagada: " + empresaApagar.getNomeEmpresa());
    } else {
        System.out.println("Índice inválido para apagar empresa.");
    }
}
    
    
    public void atualizarLista(ListaEmpresas listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
        // Limpa o listModel
        this.listModel.clear();

        // Adicionar os nomes das empresas atualizados ao listModel
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
        if (listaEmpresas != null) {
            if (listaEmpresas != null && !listaEmpresas.getEmpresas().isEmpty()) {
                DefaultListModel<String> nomeFiltrado = new DefaultListModel<>();
                for (Empresa empresa : listaEmpresas.getEmpresas()) {
                    if (empresa.getNomeEmpresa().toLowerCase().contains(busca.toLowerCase())) {
                        nomeFiltrado.addElement(empresa.getNomeEmpresa());
                    }
                }
                if (!nomeFiltrado.isEmpty()) {
                    // mostra o nome filtrado na lista
                    jListEmpresasCadastradas.setModel(nomeFiltrado);
                } else {
                    //se nao tem nada no campo mostra tudo
                    atualizarLista(listaEmpresas);
                }
            } else {
                System.out.println("Lista de empresas vazia ou nula.");
    }

    }


}
}