package PraticaPOO;

	public class cachorro1 extends Animal{
	public cachorro1(String nome, int idade, String emitirSom, String deveCorrer) {
			super(nome, idade, emitirSom, deveCorrer);
			// TODO Auto-generated constructor stub
		}

		public void correr()
			{
				System.out.println("Cachorro correndo...");
			}
			
			public void emitirSom()
			{
				System.out.println("AU AU AU!");
			}
		}
	
