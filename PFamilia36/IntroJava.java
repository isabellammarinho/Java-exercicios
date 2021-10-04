package PacoteJava;

import java.util.Scanner;

public class IntroJava {
	
	public static void main(String[] args)
	{
		int totaldias,anos,meses,dias;
		
		Scanner leia = new Scanner (System.in;
		
		System.out.println("\nEntre com o total de dias vividos:");
		totaldias= leia.nextInt();
		
		anos = totaldias /365 / 30;
		meses = (totaldias % 365) / 30;
		dias = (totaldias % 365 % 30);
		
		System.out.println("\nEu tenho : "+anos+" anos(s),meses")
	}

}
