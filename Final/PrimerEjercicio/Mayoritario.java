package PrimerEjercicio;

//Importo las librerias correspondientes -> conjunto de clases que facilitan operaciones y tareas
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Mayoritario {
	//Creo una funcion para encontrar el elemento mayoritario presente en un archivo .txt
    public static Integer numeroMayoritario(String archivo) throws FileNotFoundException { //Recibe como parametro el archivo .txt
        Map<Integer, Integer> conteo = new HashMap<>(); //Me permite almacenar el conteo de repeticiones de los numeros
        int repeticiones = 0;

        //Lee la secuencia de numeros desde el archivo
        Scanner scanner = new Scanner(new File(archivo)); //Scanner me ayuda a leer el archivo
        while (scanner.hasNextInt()) { //Bucle que me permite iterar sobre cada número en el archivo
            int numero = scanner.nextInt();
            conteo.put(numero, conteo.getOrDefault(numero, 0) + 1);
            repeticiones++;
        }

        //Se comprueba si hay un elemento mayoritario
        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) { //Verifica si hay algun numero con una frecuencia mayor
            int numero = entry.getKey();
            int frecuencia = entry.getValue();
            if (frecuencia > repeticiones / 2) {
                return numero; //En caso de que si haya un numero mayoritario
            }
        }
        return null; //En caso de que no haya ningun numero mayoritario
    }
	
    //Leo el archivo .txt e imprimo por consola
    public static void main (String[] args){
    	String nombreArchivo = "SecuenciaNumeros.txt"; ///Nombre del archivo que se quiere leer
        try { //Captura una posible excepción de tipo FileNotFoundException 
        	Integer mayoritario = numeroMayoritario(nombreArchivo);
            if (mayoritario != null) {
                System.out.println("El elemento mayoritario es: " + mayoritario);
            } else {
                System.out.println("No existe un elemento mayoritario");
            }
        } catch (FileNotFoundException e) { //->Se produce cuando el archivo especificado no se puede encontrar en la ubicacion proporcionada
            System.out.println("No se encontro el archivo");
        }
    }
	    	
}