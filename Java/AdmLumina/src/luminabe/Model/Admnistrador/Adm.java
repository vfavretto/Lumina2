package luminabe.Model.Admnistrador;

public class Adm {

    //Atributos
    private int idAdm;
    private String usuario;
    private String senha;

    //Construtor
    public Adm(int idAdm, String usuario, String senha) {
        this.idAdm = idAdm;
        this.usuario = usuario;
        this.senha = senha;
    }

    //Getters
    public int getIdAdm() {
        return idAdm;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    //Setters
    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Metodos
    public boolean login() {
        if (credenciais(this.usuario, this.senha)) {
            System.out.println("Login Efetuado com Sucesso");
            return true;
        } else {
            System.out.println("Credenciais invalidas");
            return false;
        }
    }

    private boolean credenciais(String usuario, String senha) {
        if (this.usuario.equals("adm") && this.senha.equals("senha123")) {
            return true;
        } else {
            return false;
        }
    }

}
