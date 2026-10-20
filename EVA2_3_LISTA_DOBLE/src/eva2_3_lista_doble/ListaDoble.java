/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author aldop
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int longitud;
    public void ListaDoble(){
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
}