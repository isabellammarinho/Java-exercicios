package PraticaPooExercicios;

public class TesteAviao {
	public static void main(String [] args) {
	
		Aviao aviao1 = new Aviao("Airbus");
		aviao1.getNomeAv();
		System.out.println("\nO nome do Avi�o � Airbus");
		
		aviao1.getCor();
		System.out.println("\nEle � branco e cinza");
		
		aviao1.getLocalDecolagem();
		System.out.println("\nAirbus ir� decolar de Paris");
		
		aviao1.getLocalDestino();
		System.out.println("\n Seu local de destino ser� em Londres");
		
		
	
	
	}
}
