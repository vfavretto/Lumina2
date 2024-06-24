
package luminabe.Model.Servicos;

public class Servicos {
    
    //Atributos
    private String nomeServ;
    private String descServ;
    private int idServ;

    //Construtos
    public Servicos(String nomeServ, String descServ, int idServ) {
        this.nomeServ = nomeServ;
        this.descServ = descServ;
        this.idServ = idServ;
    }
    
    //Getters
    public String getNomeServ() {
        return nomeServ;
    }

    public String getDescServ() {
        return descServ;
    }

    public int getIdServ() {
        return idServ;
    }
    
    //Setters
    public void setNomeServ(String nomeServ) {
        this.nomeServ = nomeServ;
    }

    public void setDescServ(String descServ) {
        this.descServ = descServ;
    }

    public void setIdServ(int idServ) {
        this.idServ = idServ;
    }
    
    //Metodos
    
    
    
}
