package PraticaPooExercicios;

// criei os atributos;
public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual; 
	double velocidadeMaxima;
	
	void liga()
	{
		System.out.println("o carro esta ligado...");
		
	}
	void acelera(double quantidade)
	{
		double velocidade = this.velocidadeAtual+quantidade;
		double velocidadeNova = 0;
		this.velocidadeAtual = velocidadeNova;
	}
	int pegaMarcha()
	{
		if(this.velocidadeAtual<0)
		{
			return -1;
		}
		if(this.velocidadeAtual>=0 && this.velocidadeAtual<40)
		{
			return 1;
		}
		if(this.velocidadeAtual>=40 && this.velocidadeAtual<80)
		{
			return 3;
		}
		return 0;
	}
	
	

}
