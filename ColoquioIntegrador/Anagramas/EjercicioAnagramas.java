package Anagramas;

import java.util.Arrays; //Importo la clase Arrays para trabajar con arreglos (arrays) en Java 
import java.io.BufferedReader; //Permite la lectura de caracteres y lineas completas de texto de un archivo 
import java.io.FileReader; //Permite leer caracteres de un archivo de texto existente
import java.io.IOException;

public class EjercicioAnagramas {
	//Metodo para definir el grupo mas grande de anagramas

	
	

	 
	 //Metodo para ordenar las palabras
	 public static String ordenar(String palabra) {
	        char[] caracteres = palabra.toCharArray(); //Convierte la cadena de caracteres (String) en un arreglo de caracteres (char[])
	        Arrays.sort(caracteres); //Ordena el arreglo de caracteres en orden ascendente
	        return new String(caracteres); //Devuelve el arreglo ordenado
	    }
	 
	//Metodo para verificar que las palabras sean anagramas o no-> para eso debemos ordenados
	 public static boolean sonAnagramas(String palabra1, String palabra2) { // 
	        return ordenar(palabra1).equals(ordenar(palabra2)); //Comparo si las dos palabras son anagramas: T o F
	 }
	 
	//Metodo para leer el archivo .txt
	public static String leerArchivo(String nombreArchivo) throws IOException { //Recibe el nombre de un archivo como parAmetro y devuelve el contenido del archivo como una cadena de texto
		StringBuilder contenido = new StringBuilder(); //Clase que permite la manipulaciOn eficiente de cadenas de texto
	    String linea; //Variable que lee cada linea del archivo

	    try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
	    	while ((linea = br.readLine()) != null) { //Bucle while que se ejecuta mientras haya lineas disponibles para leer en el archivo
	        	contenido.append(linea);
	            contenido.append("\n"); //Salto de linea
	            }
	        }
	        return contenido.toString(); //Devuelve el contenido del archivo como una cadena de texto 
	    }
	 
	 //Leo el archivo .txt e imprimo por consola
	 public static void main(String[] args) {
	 	String nombreArchivo = "EjemploAnagrama.txt"; //Nombre del archivo que se quiere leer

	    try {
	    	String contenido = leerArchivo(nombreArchivo);
	        System.out.println(contenido);
	    } catch (IOException e) { //	Excepción de tipo IOException -> si el archivo no se encuentra o no se puede leer se ejecuta el bloque catch
	            System.out.println("Error al leer el archivo: " + e.getMessage());
	    }
	 }

}


	

