package ListaEnlazada;


public class Lista {

    private Nodo cabeza = null;
    private int longitud = 0;

    public void eliminarLibro(int n) {
        if (cabeza != null) {
            if (n == 0) {
                this.eliminarPrincipio();
            } else if (n < longitud) {
                Nodo Puntero = contar(n - 1, true);
                if (Puntero.siguiente.siguiente != null) {
                    Nodo temp = Puntero.siguiente;
                    Puntero.siguiente = temp.siguiente;
                    temp.siguiente = null;
                    longitud--;
                } else {
                    Puntero.siguiente = null;
                    longitud--;
                }
            } else {
                System.out.println("No se pudo encontrar el libro");
            }
        }
    }

    public void insertarPrincipio(libro libro) {
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    private Nodo contar(int n, boolean inserto) {
        Nodo puntero = cabeza;
        int contador = 0;
        while (null != puntero.siguiente && contador < n) {
            puntero = puntero.siguiente;
            contador++;
        }
        if (n != contador && !inserto) {
            System.out.println("Se alcanzo el final de la lista");
            return null;
        }
        return puntero;
    }

    public void insertarFinal(libro libro) {
        //Insertar al final de la lista
        Nodo nodo = new Nodo(libro);
        Nodo puntero = cabeza;
        while (null != puntero.siguiente) {
            puntero = puntero.siguiente;
        }
        puntero.siguiente = nodo;
        nodo.siguiente = null;
        longitud++;
    }

    public void insertarDespues(int n, libro libro) {
        Nodo nodo = new Nodo(libro);
        if (null == cabeza) {
            cabeza = nodo;
        } else {
            Nodo puntero = contar(n, true);
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        longitud++;

    }

    public libro Obtener(int n) {
        if (null == cabeza) {
            return null;
        } else {
            Nodo puntero = contar(n, false);
            if (puntero != null) {
                return puntero.Libro;
            } else {
                return null;
            }
        }

    }

    public int contar() {
        return longitud;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void eliminarPrincipio() {
        if (cabeza != null) {
            Nodo Primero = cabeza;
            cabeza = cabeza.siguiente;
            Primero.siguiente = null;
            longitud--;
        }
    }

    public void eliminarUltimo() {
        if (cabeza != null) {
            if (cabeza.siguiente == null) {
                cabeza = null;
            } else {
                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
            }
            longitud--;
        }
    }

    private class Nodo {
        libro Libro;
        Nodo siguiente = null;

        Nodo(libro libro) {
            this.Libro = libro;
        }
    }
}
