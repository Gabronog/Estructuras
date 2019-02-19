package Cola;

public class MiCola implements Cola {
    private int longitud;
    private NodoProceso cabeza, ultimo;

    @Override
    public void encolar(Trabajo t) {
        NodoProceso nodoProceso = new NodoProceso(t);
        if (null == cabeza) {
            cabeza = nodoProceso;
        } else {
            ultimo.siguiente = nodoProceso;
        }
        ultimo = nodoProceso;
        longitud++;
    }

    @Override
    public void eliminar() {
        if (null != cabeza) {
            NodoProceso nodoaEliminar = cabeza;
            cabeza = cabeza.siguiente;
            nodoaEliminar.siguiente = null;
            longitud--;
        } else {
            ultimo = null;
        }
    }

    @Override
    public Trabajo Obtener() {
        if (null == cabeza) {
            return null;
        } else {
            return cabeza.trabajo;
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int longitudCola() {
        return longitud;
    }

    public void eliminarposicionN(int n) {
        if (n <= longitud - 1) {
            if (0 == n) {
                eliminar();
            } else {
                NodoProceso Nodo = cabeza;
                int contador = 0;
                while (n < contador - 1) {
                    Nodo = Nodo.siguiente;
                    contador++;
                }
                if (null == Nodo.siguiente.siguiente) {
                    Nodo.siguiente = null;
                    longitud--;
                } else {
                    NodoProceso temp = Nodo.siguiente;
                    Nodo.siguiente = temp.siguiente;
                    temp.siguiente = null;
                    longitud--;
                }
            }
        }
    }

    private class NodoProceso {
        private Trabajo trabajo;
        private NodoProceso siguiente;

        public NodoProceso(Trabajo trabajo) {
            this.trabajo = trabajo;
        }
    }
}
