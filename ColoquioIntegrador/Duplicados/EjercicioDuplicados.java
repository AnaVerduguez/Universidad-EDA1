package Duplicados;

import java.util.Arrays; //Importo la clase Arrays para trabajar con arreglos (arrays) en Java -> como ordenar, buscar elementos, comparar arreglos, entre otros

public class EjercicioDuplicados {
	//Metodo que elimina los duplicados ->  recibe como parametros la matriz y su respectiva longitud
	public static int eliminarDuplicados(int[] A, int N) { 
		int cont = N; //Contador para contar los elementos de la matriz
		Arrays.sort(A);	//Me permite ordenar la matriz en orden ascendente gracias a la clase Arrays importada anteriormente
		for(int i = 1; i < N; i++){ //Bucle con complejidad de O(N) : ya que recorre todos los elementos de la matriz una vez
			if(A[i] == A[i-1]) { //En casos que el elemento sea igual al anterior no se agrega al contador
				cont--;
			}			
		}
	return cont; //Devuelve el contador final
	
	}
	
	//Metodo recursivo para ordenar los elementos de la matriz
	public static void metodoQuicksort(int[] A, int primero, int ultimo) { 
		if (primero < ultimo) { //Condicion que verifica si el arreglo esta ordenado o no
	    	int indicePivote = corte(A, primero, ultimo); //Reorganizar el arreglo de manera que los elementos menores al pivote se encuentren antes y los mayores despues
	        metodoQuicksort(A, primero, indicePivote - 1); //Ordena los elementos menores al pivote 
	        metodoQuicksort(A, indicePivote + 1, ultimo); //Ordena los elementos mayores al pivote
	        //La recursion se repetira hasta que se ordene todo el arreglo, dividiendolo en subarreglos mas pequeños y resolviendolos de forma recursiva
	    }
	}

    //Metodo que realiza el corte de la matriz y elige el pivote(ultimo elemento de la matriz) 
    public static int corte(int[] A, int primero, int ultimo) { 
        int pivote = A[ultimo]; //Se toma el ultimo elemento de la matriz como pivote 
        int i = primero - 1; //Esta variable i representa el elemento mas pequeño del corte
        for (int j = primero; j < ultimo; j++) { // Bucle que recorre desde el primer elemento hasta el ultimo -1
            if (A[j] <= pivote) { //Verifica que el elemento sea menor al pivote
                i++; //Incrementar el valor de la variable i en 1 en cada iteracion del bucle for

            }
        }
        return i + 1; //Devuelve el indice del pivote en el arreglo despues del recorte
    }

 
	//Imprimo por consola el resultado final utilizando una matriz de prueba
	public static void main (String[] args) {
		int [] prueba = {10,11,12,13,14,15,16,15,14,15} ; //Creo una matriz con numeros repetidos
		int pruebaFinal = eliminarDuplicados(prueba, prueba.length); //Llamo al metodo que cree anteriormente y le paso los parametros correspondientes(matriz y longitud)
		System.out.println("Esta matriz posee " + pruebaFinal + " elementos");
	}
	

}
