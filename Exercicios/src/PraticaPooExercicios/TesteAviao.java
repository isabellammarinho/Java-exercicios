package PraticaPooExercicios;

public class TesteAviao {
	public static void main(String [] args) {
	
		Aviao aviao1 = new Aviao("Airbus");
		aviao1.getNomeAv();
		System.out.println("\nO nome do Avião é Airbus");
		
		aviao1.getCor();
		System.out.println("\nEle é branco e cinza");
		
		aviao1.getLocalDecolagem();
		System.out.println("\nAirbus irá decolar de Paris");
		
		aviao1.getLocalDestino();
		System.out.println("\n Seu local de destino será em Londres");
		
		
	
	
	}
}
