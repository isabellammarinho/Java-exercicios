package ExerciciosLRepeti��o;

public class LRepeti��o2 {
	public static void main(String[] args){
	       
	       
        int[] vetor = new int[10];
        
       
        int i = 0, slot = 0;
        
        do{
           
            if(i % 2 == 1){
                vetor[slot] = i;
                slot++;
            }
            i++;
        }while(slot < 10);
        
        
        i = 0;
        
        
        for(; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    } 
} 



