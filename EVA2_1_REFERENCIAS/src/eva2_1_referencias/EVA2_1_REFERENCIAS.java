/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_referencias;

/**
 *
 * @author bisonte
 */
public class EVA2_1_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejemplo inicio=new Ejemplo();
        inicio.valor=100;
        System.out.println("INICIO= " + inicio);
        System.out.println("INICIO.VALOR= " + inicio.valor);
        System.out.println("INICIO.VALOR= " + inicio.otro);
        //crear lista
        inicio.otro=new Ejemplo();
        inicio.otro.valor=200;// SEGUNDO OBJETO
        inicio.otro.otro=new Ejemplo();
        inicio.otro.otro.valor=300;
        inicio.otro.otro.otro=new Ejemplo();
        inicio.otro.otro.otro.valor=400;
        
        Ejemplo sig=inicio; //     !
        while(sig !=null){
            System.out.println("["+ sig.valor + "]");
            sig=sig.otro;
        }
        
        
    }
    
}
class Ejemplo{
int valor;
Ejemplo otro;
}
