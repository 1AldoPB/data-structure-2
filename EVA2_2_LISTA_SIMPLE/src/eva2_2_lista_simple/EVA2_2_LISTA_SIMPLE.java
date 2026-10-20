/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author aldop
 */
public class EVA2_2_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ListaSimple lista = new ListaSimple();

        // Agregar valores
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        // Imprimir la lista
        System.out.println("LISTA:");
        lista.imprimir();

        // Mostrar longitud
        System.out.println("Longitud de la lista: " + lista.longitud());

        // Verificar si esta vacia
        System.out.println("Lista vacia: " + lista.listaVacia());

        // Obtener valor de una posicion
        System.out.println("Valor en posicion 0: " + lista.valorEn(0));
        System.out.println("Valor en posicion 1: " + lista.valorEn(1));
        System.out.println("Valor en posicion 2: " + lista.valorEn(2));
        System.out.println("Valor en posicion 3: " + lista.valorEn(3));

        // Vaciar la lista
        lista.vaciarLista();

        // Comprobar que se vacio
        System.out.println("Lista vacia despues de vaciarla: "
                + lista.listaVacia());

        System.out.println("Longitud despues de vaciarla: "
                + lista.longitud());
        //System.out.println("valor en la posicion 5" + lista.valorEn(4));
        
    }
}