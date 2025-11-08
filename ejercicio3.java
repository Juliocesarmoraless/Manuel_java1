
import java.util.Scanner;


/**
 *
 * @author julio
 */
public class ejercicio3 {
    public static void main(String[]args){
    /**
     * Realizar un algoritmo que, dado un texto, lo devuelve en nomenclatura pascal case, es decir, que empiecen con mayúscula, 
     * que por cada espacio, su siguiente letra debería ser un mayúscula y todas las demás en minúsculas. 
        Considerar solo letras del alfabeto A-Z y espacios (no ñ, ni tildes, etc).
        Por ejemplo:  company rEpository
        * Texto en Pascal Case: CompanyRepositor

     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa texto para convetir a pascual🐇: ");
        String texto = sc.nextLine();
        String textoPascal = "";
        boolean mayuscula = true;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (caracter == ' ') {
                mayuscula = true;
            } else {
                if (mayuscula) {
                    textoPascal += Character.toString(caracter).toUpperCase();
                    mayuscula = false;
                } else {
                    textoPascal += Character.toString(caracter).toLowerCase();
                }
            }
        }

        System.out.println("Texto en Pascal Case: " + textoPascal);
    }
}
