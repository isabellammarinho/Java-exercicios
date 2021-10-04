package LaçosDeRepetição;
import java.util.Scanner;

public class Estudos2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);  
     
    // vamos pedir que o usuário informe três números inteiros
    System.out.print("Informe o primeiro valor: ");
    int num1 = Integer.parseInt(entrada.nextLine());
    System.out.print("Informe o segundo valor: ");
    int num2 = Integer.parseInt(entrada.nextLine());
    System.out.print("Informe o terceiro valor: ");
    int num3 = Integer.parseInt(entrada.nextLine());
     
    // o primeiro número é maior que o segundo? vamos trocá-los
    if(num1 > num2){
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
 
    // o segundo número é maior que o terceiro? vamos trocá-los
    if(num2 > num3){
      int temp = num2;
      num2 = num3;
      num3 = temp;
    }
 
    // depois da segunda troca o número 1 é novamente maior que o número 2?
    if(num1 > num2){
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
     
    // mostra o resultado
    System.out.println("Os números ordenados em ordem crescente são: ");
    System.out.println(num1 + "  " + num2 + "  " + num3);
     
    System.out.println("\n");
  }
}
