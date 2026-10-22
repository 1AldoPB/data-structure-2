/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author aldop
 */
public class MyQueue {
    private Nodo inicio;
    private Nodo fin;
    private int longitud;
    public void MyQueue(){
    inicio = null;
        fin = null;
        longitud = 0;
        
    }public int longitud() {
        return longitud;
    }
    public void vaciarLista() {
        inicio = null;
        fin = null;
        longitud = 0;    
    }
    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }
    public boolean listaVacia() {
        return inicio == null;
    }
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor, null);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            //conectar previo
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        longitud++;
    }
    public void imprimirInverso() {
        Nodo temp=fin;
        while (temp != null) {
        System.out.println("[" + temp.getValor() + "]");
        temp = temp.getPrevio();
        }
    }
    public void insetarEn(int valor, int posicion){
   if (posicion < 0 || posicion > longitud) {
        throw new IndexOutOfBoundsException(
            "Posicion invalida"
        );
    }
    Nodo nuevo = new Nodo(valor, null);
    if (posicion == 0) {
        nuevo.setSiguiente(inicio);
        nuevo.setPrevio(null);
        if (inicio != null) {
            inicio.setPrevio(nuevo);
        }
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
        nuevo.setPrevio(temp);
        if (nuevo.getSiguiente() != null) {
            nuevo.getSiguiente().setPrevio(nuevo);
        }
        if (temp == fin) {
            fin = nuevo;
        }
    }
    longitud++;
}
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
    //QUEUE--FIFO
    //AGREGA EL VALOR AL FINAL DE LA LISTA 
    public void push(int valor){
    agregar(valor);
    }
    //LEE EL VALOR DIRECTAMENTE SIN BORRARLO 
    public int peek(){
        return valorEn(0);
    
    }
    //LEE EL VALOR DIRECTAMENTE ACCESIBLE Y DESPUES LO BORRA
    public int pop(){
        int valor = valorEn(0);
        borrarEn(0);
        return valor;
    }
}
