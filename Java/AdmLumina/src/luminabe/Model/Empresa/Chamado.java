package luminabe.Model.Empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Chamado {

    //Atributos
    public void setMsgEmpresa(String msgEmpresa) {
        this.msgEmpresa = msgEmpresa;
    }

    private Empresa empresa;
    private String nomeResponsavel;
    private String dataInicio;
    private String msgSuporte, msgEmpresa;

    //Construtores
    Chamado(Empresa empresa) {
        this.empresa = empresa;
        this.nomeResponsavel = empresa.getNomeResp();
        this.dataInicio = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    Chamado(Empresa empresa, String dataInicio) {
        this(empresa);
        this.dataInicio = dataInicio;
    }

    //Getters Setters
    public Empresa getEmpresa() {
        return empresa;
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

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setMsgSuporte(String msgSuporte) {
        this.msgSuporte = msgSuporte;
    }

}
