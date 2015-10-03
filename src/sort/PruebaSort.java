
package sort;

/**
 *Se crea la clase main para probar los algoritmos de ordenamiento.
 * @author cristhian
 * @version 02/10/15
 */
public class PruebaSort {
    
    public static void main(String[] args){
        
        //Definiendo arreglo de prueba
        int []arreglo = {5,11,7,15,2,12,23,3,4,2,1,45,13};
        
         // Se asigna el tipo tiempo para tomar el tiempo de ejecucion
        long tiempo = System.nanoTime();
        System.out.println("Tiempo inicial: " + tiempo);
        
        
        Ordenamientos ordenar = new Ordenamientos();
        //ordenar.MergeSort(arreglo);
        
        //ordenar.InsertionSort(arreglo);
        
        //Esto se utiliza para la prueba de la busqueda
        int indice = ordenar.LinearSearch(arreglo, 12);
        
        if (indice != -1) {
            System.out.println(indice);
        }
                
       
        
        //Recorriendo el arreglo
        //Este se utiliza para la prueba de ordenamientos
        /*for(int i = 0; i < arreglo.length; i ++) {
            
            System.out.println(arreglo[i]);
        }*/
        
         long tiempo2 = System.nanoTime();
        System.out.println("TiempoFinal: " + tiempo2);
        System.out.print("Tiempo tardado: ");
        System.out.println(tiempo2-tiempo);
        
    }
    
}
