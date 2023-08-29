// 1.15)Escriba un metodo estatico que tome un año como parametro y devuelva false si el año es bisiesto y true en caso contrario
public class AñoBisiesto{ 
    public static void main(String args[]){

       System.out.println("Ingrese un año pasa saber si es bisiesto o no:");
       año=objeto.nextInt( );

       if (año % 4 == 0 && año % 400 == 0){
            return false;

       }else{
            return true;
       }
   }
}
