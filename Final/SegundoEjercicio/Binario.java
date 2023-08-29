package SegundoEjercicio;

public class Binario {
	//Creo una funcion recursiva que tiene como parametro un numero N
	public static int contadorUnos(int N) {
        //Si N es 0 significa que no hay "unos" en su representacion binaria y devolvemos 0
        if (N == 0) {
            return 0;
        }
        
        //Si el bit menos significativo de N es 1, se incrementa el contador en 1
        if (N % 2 == 1) { //Verifica si el resto de la division de N entre 2 es igual a 1
            return 1 + contadorUnos(N / 2); //Desplazamiento de bits hacia la derecha
        }
        
        //Si el bit menos significativo de N es 0, solo dividimos N por 2
        return contadorUnos(N / 2);
    }

	//Pruebo a la funcion creada llamandola e imprimo por consola los resultados
    public static void main(String[] args) {
        int prueba1 = 5;
        int prueba2 = 1024;
        System.out.println("La representación binaria de " + prueba1 + " contiene " + contadorUnos(prueba1) + " unos");
        System.out.println("La representación binaria de " + prueba2 + " contiene " + contadorUnos(prueba2) + " unos");
    }
}


