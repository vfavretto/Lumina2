package luminabe.Model.Admnistrador;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Blog implements Serializable {

    private String dataPostagem;
    private String titulo;
    private String texto;
    private String urlImagem;

    public Blog() {
        this.dataPostagem = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Blog(String titulo, String texto, String urlImagem) {
        this();
        this.titulo = titulo;
        this.texto = texto;
        this.urlImagem = urlImagem;
    }

    public String getDataPostagem() {
        return dataPostagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
