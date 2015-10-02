/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABB;

/**
 * Se declara la clase main PruebaAVLTree
 * @author cristhian
 * @version 01/10/15
 */
public class PruebaALVTree {
    
    public static void main(String[] args) {
        
        // Se instancia la clase AvlTree
        
        AvlTree arbol = new AvlTree();
        
        // Se asigna el tipo tiempo para tomar el tiempo de ejecucion
        long tiempo = System.nanoTime();
        System.out.println("Tiempo inicial: " + tiempo);
        
        arbol.Insertar(10);
        arbol.Insertar(5);
        arbol.Insertar(13);
        arbol.Insertar(1);
        arbol.Insertar(6);
        arbol.Insertar(17);
        arbol.preOrden(arbol.getRoot());
        
        arbol.Eliminar(10);
        arbol.preOrden(arbol.getRoot());
        
        
        
        long tiempo2 = System.nanoTime();
        System.out.println("TiempoFinal: " + tiempo2);
        System.out.print("Tiempo tardado: ");
        System.out.println(tiempo2-tiempo);
        
        
    }
    
}
