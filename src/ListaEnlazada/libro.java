package ListaEnlazada;

public class libro {
    private String titulo;
    private String Autor;
    private double ISBN;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public libro(String Titulo, String Autor, double Isbn) {
        this.Autor = Autor;
        this.titulo = Titulo;
        this.ISBN = Isbn;
    }

    public double getISBN() {
        return ISBN;
    }

    public void setISBN(double ISBN) {
        this.ISBN = ISBN;
    }
}
