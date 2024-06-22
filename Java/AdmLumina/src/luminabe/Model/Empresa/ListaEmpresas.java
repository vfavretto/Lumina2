package luminabe.Model.Empresa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListaEmpresas implements Serializable {

    private List<Empresa> empresas;

    public ListaEmpresas() {
        empresas = new ArrayList<>();
    }

    // Métodos da classe ListaEmpresas
    public void adicionarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public void removerEmpresa(Empresa empresa) {
        empresas.remove(empresa);
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    // Método para gravar a lista de empresas em um arquivo
    public static void gravar(String endereco, Object obj) throws FileNotFoundException, IOException {
        try (FileOutputStream outFile = new FileOutputStream(endereco); ObjectOutputStream s = new ObjectOutputStream(outFile)) {
            s.writeObject(obj);
        }
    }

    // Método para ler a lista de empresas de um arquivo
    public static Object ler(String endereco) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (FileInputStream inFile = new FileInputStream(endereco); ObjectInputStream s = new ObjectInputStream(inFile)) {
            return s.readObject();
        }
    }
}
