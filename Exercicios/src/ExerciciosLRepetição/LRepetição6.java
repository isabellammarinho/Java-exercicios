package ExerciciosLRepeti��o;

import java.util.Scanner;

public class LRepeti��o6 {
	
	    public static void main(String[] args){
	        Scanner ent = new Scanner(System.in);
	        
	        double num, soma = 0;
	        int cont = 0;
	        
	        do{
	            System.out.println("Digite um n�mero");
	            num = ent.nextDouble(); // usuario digita um n�mero
	            
	            if(num >= 0){ // se o n�mero digitado for MAIOR que zero, executa a conta
	                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
	                cont++; // conta quantas vezes o usu�rio digitou um n�mero
	            }
	        } while(num >= 0); // se o n�mero digitado for MAIOR que zero, faz o LOOP novamente
	        
	        System.out.println("A soma � " + soma); // soma
	        System.out.println("A quantidade de n�meros digitados foi " + cont); // quantidade
	        System.out.println("A m�dia � " + soma / cont); // m�dia
	    }
	}

