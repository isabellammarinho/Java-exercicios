package ExerciciosLRepeti��o;

import java.util.Scanner;
public class Exercicio1 {
	
	    public static void main(String args[]) {
	        Scanner teclado = new Scanner(System.in);
	        System.out.printf("Determinar o maior de 3 numeros %n");
	        System.out.printf("Qual o primeiro numero? %n");
	        double x1 = teclado.nextDouble();
	        System.out.printf("Qual o segundo numero? %n");
	        double x2 = teclado.nextDouble();
	        System.out.printf("Qual o terceiro numero? %n");
	        double x3 = teclado.nextDouble();
	        double max;
	        max = x1;
	        if (max > x2) {
	            if (max > x3) {
	                System.out.printf("O maior � max %n", x1);
	        } else{
	                System.out.printf("o maior � %g",x3);
	            }  
	        }else{
	            System.out.printf("o maior � %g",x2);  
	        }
	     }

}
