
package luminabe.Model.Empresa;

import java.io.Serializable;

public class Empresa implements Serializable {

    // ATRIBUTOS
    private int idEmpresa;
    private String cpf, cnpj;
    private String nomeEmpresa, nomeResp;
    private String emailEmpresa, emailResp;
    private String telefoneEmpresa, telefoneResp;
    private String siteEmpresa;
    private String linkedin, facebook, instagram;
    private String endereco, uf, cidade, pais, cep;
    private String senha;
    private String descEmpresa;
    private String imgEmpresa;
    

    //CONSTRUTOR
   
    public Empresa(int idEmpresa, String cpf, String cnpj, String nomeEmpresa,
        String nomeResp, String emailEmpresa, String emailResp,
        String telefoneEmpresa, String telefoneResp, String siteEmpresa,
        String linkedin, String facebook, String instagram, String endereco,
        String uf, String cidade, String pais, String cep, String senha,
        String descEmpresa, String imgEmpresa) {
        this.idEmpresa = idEmpresa;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.nomeResp = nomeResp;
        this.emailEmpresa = emailEmpresa;
        this.emailResp = emailResp;
        this.telefoneEmpresa = telefoneEmpresa;
        this.telefoneResp = telefoneResp;
        this.siteEmpresa = siteEmpresa;
        this.linkedin = linkedin;
        this.facebook = facebook;
        this.instagram = instagram;
        this.endereco = endereco;
        this.uf = uf;
        this.cidade = cidade;
        this.pais = pais;
        this.cep = cep;
        this.senha = senha;
        this.descEmpresa = descEmpresa;
        this.imgEmpresa = imgEmpresa;
    }
    
    // GETTERS
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getNomeResp() {
        return nomeResp;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public String getEmailResp() {
        return emailResp;
    }

    public String getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public String getTelefoneResp() {
        return telefoneResp;
    }

    public String getSiteEmpresa() {
        return siteEmpresa;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getPais() {
        return pais;
    }

    public String getCep() {
        return cep;
    }

    private String getSenha() {
        return senha;
    }

    public String getDescEmpresa() {
        return descEmpresa;
    }

    public String getImgEmpresa() {
        return imgEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setNomeResp(String nomeResp) {
        this.nomeResp = nomeResp;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public void setEmailResp(String emailResp) {
        this.emailResp = emailResp;
    }

    public void setTelefoneEmpresa(String telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa;
    }

    public void setTelefoneResp(String telefoneResp) {
        this.telefoneResp = telefoneResp;
    }

    public void setSiteEmpresa(String siteEmpresa) {
        this.siteEmpresa = siteEmpresa;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDescEmpresa(String descEmpresa) {
        this.descEmpresa = descEmpresa;
    }

    public void setImgEmpresa(String imgEmpresa) {
        this.imgEmpresa = imgEmpresa;
    }
    
    
    // METODOS CONCRETOS
    
    
}
