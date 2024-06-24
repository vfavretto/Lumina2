package luminabe.Model.Empresa;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Chamado implements Serializable {

    //Atributos
    private Empresa empresa;
    private statusChamado statusChamado;
    private String nomeResponsavel;
    private String dataInicio;
    private String msgSuporte, msgEmpresa;

    //Construtores
    public Chamado(Empresa empresa) {
        this.empresa = empresa;
        this.statusChamado = statusChamado.ABERTO;
        this.nomeResponsavel = empresa.getNomeResp();
        this.dataInicio = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Chamado(Empresa empresa, String dataInicio) {
        this(empresa);
        this.dataInicio = dataInicio;
    }

    //Getters Setters
    public Empresa getEmpresa() {
        return empresa;
    }

    public statusChamado getStatusChamado() {
        return statusChamado;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getMsgSuporte() {
        return msgSuporte;
    }

    public String getMsgEmpresa() {
        return msgEmpresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setStatusChamado(statusChamado statusChamado) {
        this.statusChamado = statusChamado;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setMsgEmpresa(String msgEmpresa) {
        this.msgEmpresa = msgEmpresa;
    }

    public void setMsgSuporte(String msgSuporte) {
        this.msgSuporte = msgSuporte;
    }

}
