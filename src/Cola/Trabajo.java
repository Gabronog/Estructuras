package Cola;

public class Trabajo {
    private String Titulo;
    private String Autor;
    private boolean impreso;

    public Trabajo(String Titulo, String autor) {
        this.Titulo = Titulo;
        this.Autor = autor;
        this.impreso = false;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public boolean isImpreso() {
        return impreso;
    }

    public void setImpreso(boolean impreso) {
        this.impreso = impreso;
    }
}
