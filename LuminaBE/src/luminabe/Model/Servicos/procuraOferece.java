/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luminabe.Model.Servicos;

import luminabe.Model.Empresa;

/**
 *
 * @author victor
 */
public class procuraOferece {
    
    //Atributos
    private int idProc;
    private Servicos idServ;
    private Empresa cnpj;
    
    
    //Construtor

    public procuraOferece(int idProc, Servicos idServ, Empresa cnpj) {
        this.idProc = idProc;
        this.idServ = idServ;
        this.cnpj = cnpj;
    }
    
    //Getters

    public int getIdProc() {
        return idProc;
    }

    public Servicos getIdServ() {
        return idServ;
    }

    public Empresa getCnpj() {
        return cnpj;
    }
    
    //Setters

    public void setIdProc(int idProc) {
        this.idProc = idProc;
    }

    public void setIdServ(Servicos idServ) {
        this.idServ = idServ;
    }

    public void setCnpj(Empresa cnpj) {
        this.cnpj = cnpj;
    }
    
    
    //Metodos
    
    
}
