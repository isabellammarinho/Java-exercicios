package La�osDeRepeti��o;
import java.util.Scanner;

public class Estudos2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);  
     
    // vamos pedir que o usu�rio informe tr�s n�meros inteiros
    System.out.print("Informe o primeiro valor: ");
    int num1 = Integer.parseInt(entrada.nextLine());
    System.out.print("Informe o segundo valor: ");
    int num2 = Integer.parseInt(entrada.nextLine());
    System.out.print("Informe o terceiro valor: ");
    int num3 = Integer.parseInt(entrada.nextLine());
     
    // o primeiro n�mero � maior que o segundo? vamos troc�-los
    if(num1 > num2){
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
 
    // o segundo n�mero � maior que o terceiro? vamos troc�-los
    if(num2 > num3){
      int temp = num2;
      num2 = num3;
      num3 = temp;
    }
 
    // depois da segunda troca o n�mero 1 � novamente maior que o n�mero 2?
    if(num1 > num2){
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
     
    // mostra o resultado
    System.out.println("Os n�meros ordenados em ordem crescente s�o: ");
    System.out.println(num1 + "  " + num2 + "  " + num3);
     
    System.out.println("\n");
  }
}
