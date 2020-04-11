import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;

public class While
{
	public static void main(String[] args)
	{

	Scanner entrada = new Scanner(System.in);

	int numero, numeroEx01, numeroEx05;
	double numeroEx02;
	numero = 100;
	numeroEx01 = 100;
	numeroEx02 = 10.0;
	
	
		while (numero >=100 && numero <=200){
			
		System.out.print(numero + " "); 
		
		numero = numero + 1;
		
		}
		
		System.out.print("\n"); 
		
		while (numeroEx01 >=100 && numeroEx01 <=200){
			
		System.out.println("Impressão do numero: " + numeroEx01); 
		
		numeroEx01 = numeroEx01 + 1;
		
		}
	
		System.out.println("\nFim do While Exercicio 01\n"); 

	
		while (numeroEx02 >=10.0&& numeroEx02 <=20.0){
			
		System.out.println("A metade de " + numeroEx02 + " é " + (numeroEx02/2.0)+"\n"); 
		
		numeroEx02 = numeroEx02 + 1;
		
		}	
	
		System.out.println("\nFim do While Exercicio 02\n"); 

		numeroEx05 = 0;

		while (numeroEx05 >=0 && numeroEx05 <=10){

		System.out.println("O numero 5 X " + numeroEx05 + " = " + (5*numeroEx05));

		numeroEx05 = numeroEx05 + 1;

		}

		System.out.println("\nFim do While Exercicio 05\n"); 


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