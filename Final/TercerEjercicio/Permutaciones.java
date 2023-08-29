package TercerEjercicio;

public class Permutaciones {
	//Creo una funcion recursiva para generar todas las permutaciones de un String
	public static void permutaciones(String actual, String pendiente){ //Toma como parametros el prefijo y sufijo
		
	    //Si el sufijo es null quiere decir que no hay mas caracteres disponibles para permutar y returna sin hacer nada
		if (pendiente == null) {
	            return;
	    }
		//Si el sufijo es 0 se genero la permutacion completa y se imprime el prefijo-> permutacion actual
	    if (pendiente.length() == 0) {
	            System.out.println(actual);
	    }
	    
	    //Creo un bucle que itera sobre los caracteres del sufijo, se selecciona un caracter y se guarda en nuevoSufijo concatenandolo en el prefijo
	    for (int i = 0; i < pendiente.length(); i++){
            String nuevoSufijo = actual + pendiente.charAt(i); //charAt(i) me ayuda a saber el caracter en la posicion i de la cadena sufijo
 
            String nuevoPrefijo = pendiente.substring(0, i) + pendiente.substring(i + 1); //Me ayuda a construir el nuevo sufijo en cada iteracion del bucle
 
            permutaciones(nuevoSufijo, nuevoPrefijo); //Se generan todas las permutaciones posibles a partir de la combinacion actual de prefijo y sufijo
	     }
	 }
	 
	  //Pruebo a la funcion creada llamandola e imprimo por consola los resultados
	    public static void main(String[] args){
	    	String ejemplo1 = "xyz";
			String ejemplo2 = "ana";
			
			permutaciones("", ejemplo1);
			permutaciones("", ejemplo2);
	    }
}
	


