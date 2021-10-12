package PraticaPooExercicios;
	
	public class Cavalo extends Animal {
		public Cavalo(String nome, int idade, String emitirSom, String deveCorrer) {
			super(nome, idade, emitirSom, deveCorrer);
			// TODO Auto-generated constructor stub
		}

		//Metodos
		public void correr()
		{
			System.out.println("Cavalo correndo...");
		}
		
		public void emitirSom()
		{
			System.out.println("IRRRIINN");
		}
	}


