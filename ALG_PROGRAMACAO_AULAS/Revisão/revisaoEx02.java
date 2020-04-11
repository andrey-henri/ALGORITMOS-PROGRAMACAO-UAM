import java.util.*;
import javax.*;
import java.text.*;

public class revisaoEx02{
	public static void main (String args []){
		
	Scanner entrada = new Scanner (System.in);	
	Random gerador = new Random();
		
	int vetor[] = new int [50], i = 0, media, menor, cont = 0;
	
	
	vetor[0] = -1000 + gerador.nextInt(2001);
	media = vetor[0];
	menor = vetor[0];
	
		for(i = 1; i < vetor.length; i++){
			
			vetor[i] = -1000 + gerador.nextInt(2001);
		
			media += vetor[i];
		
			if(vetor[i] < menor){
				menor = vetor[i];
			}			
		}
		
		media = (media / 5);
		
		for(i = 0; i < vetor.length; i++){
			
			if(vetor[i] >= 	media){
				cont = cont + 1;
			}
			
		}
		
		System.out.println("O menor numero digitado neste vetor é: " + menor);
		System.out.println("A quantidade de numeros deste vetor maior ou igual a media de todos os numeros é: " + cont);
		
	}
}

/*import java.util.*;
import javax.*;

public class revisaoEx02{
	public static void main (String args []){
		
	Scanner entrada = new Scanner (System.in);	
	int vetor[] = new int [5], i = 0, media, menor, cont = 0;

	System.out.println ("Por favor digite o 1 numero do vetor: ");
	vetor[0] = entrada.nextInt();
	media = vetor[0];
	menor = vetor[0];
	
		for(i = 1; i < vetor.length; i++){
			
			System.out.println ("Por favor digite o " + (i+1) + " numero do vetor: ");
			vetor[i] = entrada.nextInt();
		
			media += vetor[i];
		
			if(vetor[i] < menor){
				menor = vetor[i];
			}			
		}
		
		media = (media / 5);
		
		for(i = 0; i < vetor.length; i++){
			
			if(vetor[i] >= 	media){
				cont = cont + 1;
			}
			
		}
		
		System.out.println("O menor numero digitado neste vetor é: " + menor);
		System.out.println("A quantidade de numeros deste vetor maior ou igual a media de todos os numeros é: " + cont);
		
	}
}*/