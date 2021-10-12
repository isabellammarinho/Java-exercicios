package PraticaPooExercicios;

public class Aviao {
	// declarando os atributos
	
	private String nomeAv;
	private String cor;
	private String localDecolagem;
	private String localDestino;
	
	// declarando os construtores;
	
	public Aviao (String nomeAv, String cor, String localDecolagem,String localDestino) {
		this.nomeAv = nomeAv;
	    this.cor =  cor;
	    this.localDecolagem = localDecolagem;
	    this.localDestino = localDestino;
	    
	}

	public Aviao(String string) {
		// TODO Auto-generated constructor stub
	}

	public void ImprimirInfo()
	{
		System.out.println( "\nO nome: "+ nomeAv + "é da cor "+ cor + " Irá: "+localDecolagem+ " e seu destino será" + localDestino);
	}

	public String getNomeAv() {
		return nomeAv;
	}

	public void setNomeAv(String nomeAv) {
		this.nomeAv = nomeAv;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getLocalDecolagem() {
		return localDecolagem;
	}

	public void setLocalDecolagem(String localDecolagem) {
		this.localDecolagem = localDecolagem;
	}

	public String getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}
			
	}
