import java.util.*;
import javax.*;
import java.text.*;

public class revisaoEx03{
	public static void main (String args []){
		
		Scanner entrada = new Scanner (System.in);
		Random gerador = new Random ();
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		double media_final [] = new double [10];
		
		System.out.println("Digite a nota da N1 - 1ª prática parcial: \nObs:valor máximo 3,0");
		media_final[0] = entrada.nextDouble();

		System.out.println("Digite a nota da N1 - 2ª prática parcial: \nObs:valor máximo 3,0");
		media_final[1] = entrada.nextDouble();
		
		System.out.println("Digite a nota do Trabalho N1: \nObs:valor máximo 4,0");
		media_final[2] = entrada.nextDouble();
		
		media_final[3] = (media_final[0] + media_final[1] + media_final[2]);
		
		System.out.println("Digite a nota da N1 - 2ª Avaliação – Teste de progresso: \nObs:valor máximo 10,0");
		media_final[4] = entrada.nextDouble();
		
		System.out.println("Digite a nota da N1 - 3ª Avaliação discursiva: \nObs:valor máximo 10,0");
		media_final[5] = entrada.nextDouble();		
		
		media_final[6] = (((media_final[3] + media_final[4] + media_final[5]) / 3) * 0.4);
		
		System.out.println("Digite a nota da N2 - Prova Final: \nObs:valor máximo 10,0");
		media_final[7] = entrada.nextDouble();	
		
		media_final[7] = (media_final[7] * 0.6);

		media_final[8] = (media_final[6] + media_final[7]);
		
		if(media_final[8] >= 5.0){
				System.out.println("\nSua nota na N1 corresponde á: " + df.format(media_final[6]) + ". E na N2 sua nota corresponde á: " + df.format(media_final[7]));
				System.out.println("Desta maneira sua media final foi: " + df.format(media_final[8]) + ". Parabêns você foi aprovado!");
		}
		else if(media_final[8] < 5.0){
			System.out.println("\nVocê não foi aprovado, estude mais é faça a prova substitutiva da N2!\n");
			System.out.println("Digite a nota da N2 - Prova substitutiva: \nObs:valor máximo 10,0");
			media_final[9] = entrada.nextDouble();
		}
		
		if(media_final[9] > media_final[7]){
			media_final[9] = (media_final[9] * 0.6);
			media_final[8] = (media_final[6] + media_final[9]);
			
			if(media_final[8] >= 5.0){
				System.out.println("\nSua nota na N1 corresponde á: " + df.format(media_final[6]) + ". E na N2 sua nota corresponde á: " + df.format(media_final[9]));
				System.out.println("Desta maneira sua media final foi: " + df.format(media_final[8]) + ". Parabêns você foi aprovado!");
			}
			else{
				System.out.println("\nmedia final: " + df.format(media_final[8]));				
				System.out.println("Mesmo fazendo a prova substitutiva, você não foi aprovado nessa disciplina. Estude mais para o proximo semestre!");
			}
		}
		else{
			System.out.println("\nmedia final: " + df.format(media_final[8]));				
			System.out.println("Sua nota da prova substitutiva foi menor que a nota da prova da N2, desta maneira você, continua reprovado!");
		}
	}
}