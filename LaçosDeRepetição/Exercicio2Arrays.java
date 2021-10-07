package Arrays;


	import java.util.ArrayList;

	import java.util.List;

	import java.util.Scanner;
	public class Exercicio2Arrays {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			List<Integer> numerosImpares = new ArrayList<>(); //fun��o para listar os vetores e exibir os numeros depois
			List<Integer> numerosPares = new ArrayList<>();

		       int numero, somaPar = 0;
		       
		       for (int i = 0; i < 6; i++) {
		    	   System.out.printf("Entre com os valores: ");
		           numero = scan.nextInt();  

		           

		           if (numero % 2 == 0){

		               numerosPares.add(numero);

		               somaPar += numero;

		           }else{

		               numerosImpares.add(numero);

		           }

		       }

		       System.out.println("N�meros pares digitados: " + numerosPares);

		       System.out.println("Soma dos n�meros pares: " + somaPar);

		       System.out.println("N�meros �mpares digitados: " + numerosImpares);

		       System.out.println("Quantidade de �mpares digitados: " + numerosImpares.size());        

		}

	}

