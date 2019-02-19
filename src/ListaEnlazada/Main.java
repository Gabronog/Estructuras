package ListaEnlazada;

public class Main {
    public static void main(String[] args) {
        libro libro = new libro("Historia de Espania", "J. Arostegui Sanchez", 843169037);
        Lista lista = new Lista();
        lista.insertarPrincipio(libro);
        System.out.println(lista.Obtener(0).getTitulo());
    }
}
