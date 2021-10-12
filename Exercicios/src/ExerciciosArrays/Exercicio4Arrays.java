package ExerciciosArrays;
	import java.util.Scanner;

	public class Exercicio4Arrays {
		public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int[][] matriz1 = new int[2][2];
	        int[][] matriz2 = new int[2][2];
	        int opcao;

	        //contato com o usu�rio
	        System.out.println("______________________________________________________________________");
	        System.out.println(" Ol�! vamos primeiramente construir as matrizes que iremos trabalhar..");
	        System.out.println(" *Obs: Cada matriz ter� 4 valores.");
	        System.out.println("______________________________________________________________________");

	        //construindo as matrizes
	        for (int i = 0; i < matriz1.length; i++) {
	            for (int j = 0; j < matriz1[i].length; j++) {
	                System.out.println("______________________________________________________");
	                System.out.println("******************************************************");
	                System.out.println("\nEntre com um n�mero inteiro para a primeira matriz: ");
	                matriz1[i][j] = scan.nextInt();
	                System.out.println("\nEntre com um n�mero inteiro para a segunda matriz: ");
	                matriz2[i][j] = scan.nextInt();
	            }
	        }
	        System.out.println("******************************************************");
	        System.out.println("__________Bom, j� construimos nossas matrizes_________");
	        System.out.println("       Agora escolha uma op��o que deseja executar:    ");
	        System.out.println("\n1 - para somar as duas matrizes.");
	        System.out.println("\n2 - para subtrair a primeira matrix da segunda.");
	        System.out.println("\n3 - Adicionar uma constante as duas matrizes.");
	        System.out.println("\n4 (ou outro valor)- para imprimir os valores das matrizes.");
	        System.out.println("******************************************************");
	        System.out.print("digite o valor: ");
	        opcao = scan.nextInt();

	        switch (opcao){
	            case 1 -> {
	                int[][] matriz3 = new int[2][2];

	                for (int i = 0; i < matriz1.length; i++){
	                    for (int j = 0; j < matriz1[i].length; j++) {
	                        matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
	                        System.out.printf("\nVeja, a soma dos valores das matrizes �: %d + %d = %d"
	                                ,matriz1[i][j],matriz2[i][j],matriz3[i][j]);
	                    }
	                }
	            }
	            case 2 -> {
	                int[][] matriz3 = new int[2][2];
	                for (int i = 0; i < matriz1.length; i++){
	                    for (int j = 0; j < matriz1[i].length; j++) {
	                        matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
	                        System.out.printf("\nA subtra��o dos valores das matrizes �: %d - %d = %d"
	                                ,matriz1[i][j],matriz2[i][j],matriz3[i][j]);
	                    }
	                }
	            }
	            case 3 -> {
	                System.out.println("\nInforme o valor da constante que ser� adicionada:");
	                 int constante = scan.nextInt();

	                for (int i = 0; i < matriz1.length; i++){
	                    for (int j = 0; j < matriz1[i].length; j++) {
	                         matriz1[i][j] += constante;
	                         matriz2[i][j] += constante;
	                    }
	                }

	                System.out.println("\nCom a adi��o da constante os valores das matrizes passam a ser: ");
	                for (int i = 0; i < matriz1.length; i++) {
	                    for (int j = 0; j < matriz1[i].length; j++) {
	                        System.out.printf("\nValor da posi��o [%d][%d] da matriz 1 = %d" +
	                                        "\nValor da posi��o [%d][%d] da matriz 2 = %d\n",
	                                i,j,matriz1[i][j],i,j,matriz2[i][j]);
	                    }
	                }
	            }

	            case 4 -> {
	                System.out.print("\nvalores matriz 1: ");
	                for (int i = 0; i < matriz1.length; i++){
	                    for (int j = 0; j < matriz1[i].length; j++) {
	                        System.out.print(matriz1[i][j] + " ");
	                    }
	                }
	                System.out.print("\nvalores matriz 2: ");
	                for (int i = 0; i < matriz2.length; i++){
	                    for (int j = 0; j < matriz2[i].length; j++) {
	                        System.out.print(matriz2[i][j] + " ");
	                    }
	                }
	            }

	            default -> {
	                System.out.println("\nVoc� inseriu outro valor.");
	                System.out.print("valores matriz 1: ");
	                for (int i = 0; i < matriz1.length; i++){
	                    for (int j = 0; j < matriz1[i].length; j++) {
	                        System.out.print(matriz1[i][j] + " ");
	                    }
	                }
	                System.out.print("\nvalores matriz 2: ");
	                for (int i = 0; i < matriz2.length; i++){
	                    for (int j = 0; j < matriz2[i].length; j++) {
	                        System.out.print(matriz2[i][j] + " ");
	                    }
	                }
	            }
	        }
	    }
	}


