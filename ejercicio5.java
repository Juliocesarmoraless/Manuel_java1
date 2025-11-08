
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class ejercicio5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número n: ");
        int n = sc.nextInt();

        int suma = sumarHastaN(n);

        System.out.println("La suma de los números naturales de 1 a " + n + " es: " + suma);
    
    }
     public static int sumarHastaN(int n) {
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        return suma;
    }
}
