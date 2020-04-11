import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;

public class While03
{
	public static void main(String[] args)
	{
		
	Scanner entrada = new Scanner(System.in);
	char escolha = 'S';
	double cachorroQuente =0.0,bauruSimples =0.0,bauruOvo =0.0,hamburguer =0.0,cheeseBurguer =0.0,refrigerante = 0.0,total = 0.0;

		JOptionPane.showMessageDialog(null,"\n* CARDAPIO DA LANCHONETE  *\n"+
										   "\n# CODIGO 100 | CACHORRO QUENTE | R$: 1,20 #"+
										   "\n# CODIGO 101 | BAURU SIMPLES        | R$: 1,30 #"+
										   "\n# CODIGO 102 | BAURU COM OVO      | R$: 1,50 #"+
										   "\n# CODIGO 103 | HAMBURGUER            | R$: 1,20 #"+
										   "\n# CODIGO 104 | CHEESEBURGUER      | R$: 1,30 #"+
										   "\n# CODIGO 105 | REFRIGERANTE           | R$: 1,00 #\n");	

		do{

		System.out.println("Por favor digite o codigo do produto que deseja comprar!");
		int codigo = entrada.nextInt(); 

		System.out.println("Por favor digite a quantidade do produto");
		int quantidade = entrada.nextInt(); 

		System.out.println("Gostaria de comprar mais um item ? (Digite 'S' para Sim e 'N' para Não");
		escolha = entrada.next().charAt(0); 

		if(codigo != 100 || codigo != 101 || codigo != 102 || codigo != 103 || codigo != 104 || codigo != 105){
			System.out.println("Codigo do produto digitado é invalido, tente novamente!");	
		}
			switch(codigo){
				case 100: 
				cachorroQuente = cachorroQuente + (quantidade * 1.20);
				break;	
				case 101: 
				bauruSimples = bauruSimples + (quantidade * 1.30);
				break;	
				case 102: 
				bauruOvo = bauruOvo + (quantidade * 1.50);
				break;	
				case 103: 
				hamburguer = hamburguer + (quantidade * 1.20);
				break;	
				case 104: 
				cheeseBurguer = cheeseBurguer + (quantidade * 1.30);
				break;	
				case 105: 
				refrigerante = refrigerante + (quantidade * 1.00);
				break;	
			}
				
		} while(escolha == 'S' || escolha == 's');

		if(cachorroQuente > 0.0){
			System.out.println("\nCACHORRO QUENTE | " + (cachorroQuente/1.20) + " UN | " + "VL. UNITARIO R$:01,20 | " + "VL. TOTAL " + cachorroQuente);
			total = total + cachorroQuente;
		}
		if(bauruSimples > 0.0){
			System.out.println("\nBAURU SIMPLES   | " + (bauruSimples/1.30) + " UN | " + "VL. UNITARIO R$:01,30 | " + "VL. TOTAL " + bauruSimples);
			total = total + bauruSimples;
		}
		if(bauruOvo > 0.0){
			System.out.println("\nBAURU COM OVO   | " + (bauruOvo/1.50) + " UN | " + "VL. UNITARIO R$:01,50 | " + "VL. TOTAL " + bauruOvo);
			total = total + bauruOvo;
		}
		if(hamburguer > 0.0){
			System.out.println("\nHAMBURGUER      | " + (hamburguer/1.20) + " UN | " + "VL. UNITARIO R$:01,20 | " + "VL. TOTAL " + hamburguer);
			total = total + hamburguer;
		}
		if(cheeseBurguer > 0.0){
			System.out.println("\nCHEESE BURGUER  | " + (cheeseBurguer/1.30) + " UN | " + "VL. UNITARIO R$:01,30 | " + "VL. TOTAL " + cheeseBurguer);
			total = total + cheeseBurguer;
		}
		if(refrigerante > 0.0){
			System.out.println("\nREFRIGERANTE    | " + (refrigerante/1.00) + " UN | " + "VL. UNITARIO R$:01,00 | " + "VL. TOTAL " + refrigerante);
			total = total + refrigerante;
		}

	System.out.println("\nVALOR TOTAL A PAGAR: " + total);

	}
}



/*Compilar no terminal palavras com acentuação: -encoding utf-8 

	Scanner entrada = new Scanner(System.in);


	//System.out.println("Por Favor digite o seu sexo: "); 
	//char sexoPessoa = entrada.next().charAt(0);  

	//System.out.println("Por Favor digite o seu nome: "); 
	//String nome = entrada.nextLine(); 

	//System.out.println("Por Favor digite um numero "); 
	//double numero02 = entrada.nextDouble();

	//System.out.println("\nPor Favor digite sua idade: "); 
	//int idade = entrada.nextInt();  

-encoding utf-8

swith(menu){
	case 1:
	System.out.println("Você digitou o numero 1");
	break;
	case 2:
	System.out.println("Você digitou o numero 2");
	break;
}

	int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"\n Por Favor digite o codigo do produto "));
	double quantidade = Double.parseDouble(JOptionPane.showInputDialog("\n Por Favor digite a quantidade que será comprada deste produto ")); 

*/