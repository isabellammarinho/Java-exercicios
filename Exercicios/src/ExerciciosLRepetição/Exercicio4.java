package ExerciciosLRepeti��o;

	import java.util.Scanner;

	public class Exercicio4 {

	  public static void main(String[] args) {
	  
	    Scanner entrada = new Scanner(System.in);
	    int Numero=0,QuantPar=0,QuantImpar=0;
		
		while(Numero>=0){
		
			System.out.print("Digite um n�mero (numeros negativos finalizam): ");
			Numero = entrada.nextInt();
			if(Numero>=0){
				if(Numero%2==0){
					QuantPar++;
				}else{
					QuantImpar++;
				}
			}
		}
	    
		System.out.println("\n\nQuantidade de N�meros Pares: "+QuantPar+"\nQuantidade de N�meros Impares: "+QuantImpar);
		
	  }
	}

