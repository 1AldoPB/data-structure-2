/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author aldop
 */
public class Nodo {
    //DOS ATRIBUTOS
    private int valor;
    private Nodo siguiente;
    //CONSTRUCTORES:

  
public Nodo() {
    this.siguiente = null;
}

public Nodo(int valor, Nodo siguiente) {
    this.valor = valor;
    this.siguiente = siguiente;
}
    //GET Y SET

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
