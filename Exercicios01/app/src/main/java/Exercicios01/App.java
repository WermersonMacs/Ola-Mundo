/*
 * EXERCICIO01:
 * Fa�a um algoritmo que receba um n�mero e diga se este n�mero 
 * est� no intervalo entre 100 e 200;.
 */
package Exercicios01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int numero;

        Scanner leitorScanner = new Scanner(System.in);
        
        numero = leitorScanner.nextInt();
        
        if(numero >= 100 && numero <= 200){
           System.out.println("o n�mero est� estar no intervalo"); 
        } else{
          System.out.println("O n�mero n�o est� no intervalo"); 
        }
    }

}
