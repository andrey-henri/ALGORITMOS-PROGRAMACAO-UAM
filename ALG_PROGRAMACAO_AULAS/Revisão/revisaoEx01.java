import java.util.*;
import javax.*;

public class revisaoEx01{
	public static void main (String args[]){
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Por favor digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Por favor digite a quantidade de livros que deseja comprar: ");
		int qtdlivros = entrada.nextInt();
		
		double criterioA = (0.25 * qtdlivros + 7.50);
		double criterioB = (0.50 * qtdlivros + 2.50);
		
		if(criterioA > criterioB){
			System.out.println("Utilize a promoção A para obter o maior valor de desconto!");
		}
		else if(criterioB > criterioA){
			System.out.println("Utilize a promoção B para obter o maior valor de desconto!");
		}
		else{
			System.out.println("O percentual de desconto nas duas promoções serão o mesmo, compre mais livros para aproveitar a promoção");
		}	
	}
}