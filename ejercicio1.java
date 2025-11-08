
import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[]args){
      /**
       * Realizar una función que te devuelva la 
       * cantidad de vocales de un texto pasado 
       * como argumento. Por ejemplo:
       */
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa texto aleatorio xd: ");
      String texto = sc.nextLine();
      System.out.println("Cantidad de vocales del texto es : "+ contadorVocales(texto));
    }
    
    public static int contadorVocales(String texto){
      int contador = 0;
      texto = texto.toLowerCase();
      
      for (int i = 0 ; i < texto.length(); i++){
          char c = texto.charAt(i);
          if ("aeiou".indexOf(c) != -1){
              contador ++;
          }
          /*
          if (caracter == 'a' || caracter == 'e' ||caracter == 'i'|| caracter == 'o' || caracter == 'u' ){
              contador ++;
          }*/
      }
      return contador;
      }
}
