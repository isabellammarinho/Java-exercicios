package PraticaPooExercicios;

public class Cliente {
	// declaração dos atributos;
	
	
		private String primeiroNome;
		private String segundoNome;
		private String ultimoNome;
		private int idade;
		private String nacionalidade;
		
		
		// declarando meu construtor;
		public Cliente (String primeiroNome, String segundoNome, String ultimoNome,int idade,String nacionalidade) {
			this.primeiroNome = primeiroNome;
			this.segundoNome = segundoNome;
			this.ultimoNome = ultimoNome;
			this.idade = idade;
			this.nacionalidade = nacionalidade;
					
	// declaração dos metodos da classe;
	}
		
		
	public Cliente(String string) {
			// TODO Auto-generated constructor stub
		}


	public void imprimirInfo() 
	{
		System.out.println("\n" + primeiroNome+ segundoNome + ultimoNome+" tem: " + " idade " + "e possui a " + nacionalidade);
	}


	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public String getSegundoNome() {
		return segundoNome;
	}


	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}


	public String getUltimoNome() {
		return ultimoNome;
	}


	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

}