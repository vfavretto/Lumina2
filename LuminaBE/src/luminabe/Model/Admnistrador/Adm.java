/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luminabe.Model.Admnistrador;

/**
 *
 * @author victor
 */
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
    
    
}
