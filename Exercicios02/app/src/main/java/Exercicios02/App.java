/*
 * Fa�a um algoritmo que receba �N� n�meros e mostre positivo, 
 * negativo ou zero para cada n�mero;
 */
package Exercicios02;

    import java.util.Scanner;

public class App {
    
public static void main(String[] args) {
        
    Scanner leitorScanner = new Scanner(System.in); 
        
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar =='s' ) {
    
                    System.out.println("digite um numero: ");
                
                int numero = leitorScanner.nextInt();
        
                if (numero == 0){
                    
                     System.out.println("o valor � zero");
                } 
                  else{
                    
                 if (numero > 0){
                    System.out.println("o valor � positivo");
                } 
                 else{
                    System.out.println("O valor � negativo");
       }
   }
                    System.out.println("Deseja Continuar: 'S' - Sim ou 'N' - N�o ");
                    desejaContinuar = leitorScanner.next().charAt(0);
    
}    
    }
}
