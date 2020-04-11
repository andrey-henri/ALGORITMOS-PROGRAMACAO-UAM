import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;

public class While02
{
	public static void main(String[] args)
	{

	Scanner entrada = new Scanner(System.in);

	int  numeroEx05, numeroEx06, numeroEx07, cont;

		numeroEx05 = 0;

		double imc;
		int imcIdeal = 0;

	while (numeroEx05 >=0 && numeroEx05 <=10){

	System.out.println("\nO numero 5 X " + numeroEx05 + " = " + (5*numeroEx05));

	numeroEx05 = numeroEx05 + 1;

	}

	System.out.println("\nFim do While Exercicio 05\n"); 


	System.out.println("\nPor Favor digite um numero: "); 
	numeroEx06 = entrada.nextInt();  

	cont = 1;

	while (cont*2 <= numeroEx06){

	if(cont == 1){
	System.out.print("\n Sequência: " + cont + ", ");
	cont = cont + 1;
	}
		
	else{
		cont = (cont * 2);
	}

	System.out.print("" + cont + ", ");

	}

	System.out.println("\n\nFim do While Exercicio 06\n"); 

	cont = 1;

	while (cont <= 20){
			
	System.out.println("\nPor Favor digite a altura da " + cont + " pessoa!"); 
	double altura = entrada.nextDouble();
			
	System.out.println("\nPor Favor digite o peso da " + cont + " pessoa!"); 
	double peso = entrada.nextDouble();

	imc = (peso/(altura*altura));

		if (imc >= 18.5 && imc <= 24.9){
		imcIdeal = imcIdeal + 1;
		}

	cont++;
	}

	System.out.println("\nO numero de pessoas que não tem obesidade é de: " + imcIdeal);
	System.out.println("\n\nFim do While Exercicio 07\n"); 

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