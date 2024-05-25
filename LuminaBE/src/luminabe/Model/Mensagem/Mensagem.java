/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luminabe.Model.Mensagem;

import luminabe.Model.Empresa;

/**
 *
 * @author victor
 */
public class Mensagem {
    
    //Atributos
    private int idMensagem;
    private String mensagem;
    private Empresa empresaEnvia;
    private Empresa empresaRecebe;
    
    //Construtor

    public Mensagem(int idMensagem, String mensagem, Empresa empresaEnvia, Empresa empresaRecebe) {
        this.idMensagem = idMensagem;
        this.mensagem = mensagem;
        this.empresaEnvia = empresaEnvia;
        this.empresaRecebe = empresaRecebe;
    }
    
    //Getters

    public int getIdMensagem() {
        return idMensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Empresa getEmpresaEnvia() {
        return empresaEnvia;
    }

    public Empresa getEmpresaRecebe() {
        return empresaRecebe;
    }
    
    
    //Setters

    public void setIdMensagem(int idMensagem) {
        this.idMensagem = idMensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setEmpresaEnvia(Empresa empresaEnvia) {
        this.empresaEnvia = empresaEnvia;
    }

    public void setEmpresaRecebe(Empresa empresaRecebe) {
        this.empresaRecebe = empresaRecebe;
    }
    
    
    //Metodos
    
}
