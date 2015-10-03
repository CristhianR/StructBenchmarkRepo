/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *Se crea el algoritmo de ordenamiento MergeSort.
 * @author cristhian
 * @version 02/10/15
 */
public class Ordenamientos {
    /**
     * Se crea el método de ordenamiento MergeSort.
     * @param arreglo, pues es lo que se necesita ordenar.
     * @return el arreglo  ordenado
     */
    public int [] MergeSort(int [] arreglo) {
        
        int i, j ,k;
        
        //Esta condición y los siguientes dos ciclos for, se encargan de partir el arreglo en sublistas.
        if(arreglo.length > 1) {
            int nElementosIzq = arreglo.length/2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int[nElementosIzq];
            int arregloDer[] = new int[nElementosDer];
            
            //Copiando los elementos de la primera parte al arreglo izq.
            for(i = 0; i < nElementosIzq; i++){
                
                arregloIzq[i] = arreglo[i];
            }
            
            //Copiando los elementos de la parte segunda al arreglo der.
            for(i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                arregloDer[i - nElementosIzq] = arreglo[i];
            }
            
            //Recurividad
            arregloIzq = MergeSort(arregloIzq);
            arregloDer = MergeSort(arregloDer);
            i = 0;
            j = 0;
            k = 0;
            
            //Este while se encarga de ordenar el arreglo
            while (arregloIzq.length != j && arregloDer.length != k) {
                
                if(arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            
            //Arreglo Final; son los encargados de unir las sublistas ordenadas.
            while (arregloIzq.length != j){
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            } //Fin del
        }
        return arreglo;
    }
    
    /**
     * Se crea el método de ordenamiento InsertionSort.
     * @param array, pues es lo que se necesita ordenar.
     */
    public void InsertionSort(int[] array) {
        int aux;
        int cont1;
        int cont2;
        for(cont1 = 1; cont1 < array.length; cont1 ++){
            
            aux = array[cont1];
            for(cont2 = cont1 - 1; cont2 >= 0 && array[cont2] > aux; cont2 --) {
                
                array[cont2 +1] = array[cont2];
                array[cont2] = aux;
            }
        }
    }
/**
 * Se crea el método de busqueda lineal.
 * @param arreglo, pues es la estructura de datos donde se buscar.
 * @param elemento, pues es el dato a buscar, que esta dentro de la estructura de datos.
 * @return 
 */
    public int LinearSearch( int arreglo[], int elemento) {
        int i;
        boolean encontrado = false;
        
        for ( i = 0; i < arreglo.length && encontrado == false; i++) {
            
            if (elemento == arreglo[i]) {
                
                encontrado = true;
                return i;
            }
            
        } return -1;
    }

}
     
    
    
    
 
 