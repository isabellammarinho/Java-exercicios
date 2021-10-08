package PraticaPOO;

import java.util.Scanner;

public class TesteCliente {
		public static void main(String [] args) {
			// TODO Auto-generated method stub

		 //instanciando um objeto da classe automovel
			
			Cliente cliente1 = new Cliente ( "Isabella Marinho");
			Scanner leitor = new Scanner(System.in);
		
			cliente1.getPrimeiroNome();
			System.out.println("\nO nome da minha cliente é Isabella");
			
			cliente1.getSegundoNome();
			System.out.println("\nMarcelo");
			
			cliente1.getUltimoNome();
			System.out.println("\nMarinho");
			
			cliente1.setIdade(27);
			System.out.println("\nEla tem 27 anos");
			
			cliente1.getNacionalidade();
			System.out.println("\nE sua nacionalidade é brasileira");
		
			
		}
		
	

}