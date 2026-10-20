
package eva2_2_lista_simple;

public class ListaSimple {

    private Nodo inicio;
    public Nodo fin;
    private int longitud = 0;

    // CONSTRUCTOR
    public ListaSimple() {
        inicio = null;
        fin = null;
        longitud = 0;
    }

    // AGREGAR UN NODO
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor, null);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }

        longitud++;
    }

    // IMPRIMIR LA LISTA
    public void imprimir() {
        Nodo temp = inicio;

        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }

    // REGRESA LA LONGITUD EN O(1)
    public int longitud() {
        return longitud;
    }

    // SABER SI LA LISTA ESTA VACIA
    public boolean listaVacia() {
        return inicio == null;
    }
    // VACIAR LA LISTA
    public void vaciarLista() {
        inicio = null;
        fin = null;
        longitud = 0;
    }
    // OBTENER EL VALOR DE UNA POSICION
    public int valorEn(int posicion) {

        if (posicion < 0 || posicion >= longitud) {
            throw new RuntimeException(
                "La posicion " + posicion + " no es valida"
            );
        }

        Nodo temp = inicio;

        for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
        }

        return temp.getValor();
    }

    // ENCONTRAR UN VALOR
    public int encontrar(int valor) {
        Nodo temp = inicio;
        int posicion = 0;

        while (temp != null) {
            if (valor == temp.getValor()) {
                return posicion;
            }

            temp = temp.getSiguiente();
            posicion++;
        }

        return -1;
    }

    // INSERTAR UN NODO EN UNA POSICION
    public void insertarEn(int valor, int posicion) {

        if (posicion < 0 || posicion > longitud) {
            throw new IndexOutOfBoundsException(
                "Posicion invalida"
            );
        }

        Nodo nuevo = new Nodo(valor, null);

        if (posicion == 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

            if (fin == null) {
                fin = nuevo;
            }

        } else {
            Nodo temp = inicio;

            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }

            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);

            if (temp == fin) {
                fin = nuevo;
            }
        }

        longitud++;
    }

    // BORRAR UN NODO EN UNA POSICION
    public void borrarEn(int posicion) {

        if (posicion < 0 || posicion >= longitud) {
            throw new IndexOutOfBoundsException(
                "Posicion invalida"
            );
        }

        if (posicion == 0) {
            inicio = inicio.getSiguiente();

            if (inicio == null) {
                fin = null;
            }

        } else {
            Nodo temp = inicio;

            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }

            Nodo borrar = temp.getSiguiente();

            temp.setSiguiente(borrar.getSiguiente());

            if (borrar == fin) {
                fin = temp;
            }
        }

        longitud--;
    }

    // IMPRIMIR EN ORDEN INVERSO
    public void imprimirInverso() {

        for (int i = longitud - 1; i >= 0; i--) {
            System.out.println("[" + valorEn(i) + "]");
        }
    }
}



