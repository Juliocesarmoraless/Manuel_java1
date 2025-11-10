
import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[]args){
        /**
         * Crear un algoritmo que multiplique 2 números sin usar el operador de multiplicación. Por ejemplo:
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número de la mulptiplación: ");
        int a = sc.nextInt();
        System.out.println("Ingresa el primer número de la mulptiplación: ");
        int b = sc.nextInt();
        int multiplicacion = 0;
        for (int i = 0; i< b; i++){
            multiplicacion += a ;
        }
        System.out.println("la multplicacione sde "+a+" * "+b+" = "+multiplicacion );
    }
}
