package PraticaPOO;
	
	public class Preguica extends Animal {
		public Preguica(String nome, int idade, String emitirSom, String deveCorrer) {
			super(nome, idade, emitirSom, deveCorrer);
			// TODO Auto-generated constructor stub
		}

		//Metodos
		public void subirArvore()
		{
			System.out.println("Preguica subindo em arvores...");
		}
		
		public void emitirSom()
		{
			System.out.println("AAAAAAHHHHZZZZ");
		}
	}


