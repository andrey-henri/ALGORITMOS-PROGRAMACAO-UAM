import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;

public class Exercicios
{
	public static void main(String[] args)
	{
/*
	Scanner entrada = new Scanner(System.in);

	JOptionPane.showMessageDialog(null,"\n# TABELA DE MESES DO ANO #"+
									   "\n#     01   JANEIRO       #"+
									   "\n#     02   FEVEREIRO     #"+
									   "\n#     03   MARÇO         #"+
									   "\n#     04   ABRIL         #"+
									   "\n#     05   MAIO          #"+
									   "\n#     06   JUNHO         #"+
									   "\n#     07   JULHO         #"+
									   "\n#     08   AGOSTO        #"+
									   "\n#     09   SETEMBRO      #"+
									   "\n#     10   OUTUBRO       #"+
									   "\n#     11   NOVEMBRO      #"+
									   "\n#     12   DEZEMBRO      #");

	System.out.println("\nPor Favor digite um numero: "); 
	int mes = entrada.nextInt();

		switch(mes){
		case 1:
			System.out.println("\nO numero 1 representa o mês de janeiro.");
		break;

		case 2:
			System.out.println("\nO numero 2 representa o mês de Fevereiro.");
		break;

		case 3:
			System.out.println("\nO numero 3 representa o mês de Março.");
		break;

		case 4:
			System.out.println("\nO numero 4 representa o mês de Abril.");
		break;

		case 5:
			System.out.println("\nO numero 5 representa o mês de Maio.");
		break;

		case 6:
			System.out.println("\nO numero 6 representa o mês de Junho.");
		break;

		case 7:
			System.out.println("\nO numero 7 representa o mês de Julho.");
		break;

		case 8:
			System.out.println("\nO numero 8 representa o mês de Agosto.");
		break;

		case 9:
			System.out.println("\nO numero 9 representa o mês de Setembro.");
		break;

		case 10:
			System.out.println("\nO numero 10 representa o mês de Outubro.");
		break;

		case 11:
			System.out.println("\nO numero 11 representa o mês de Novembro.");
		break;

		case 12:
			System.out.println("\nO numero 12 representa o mês de Dezembro.");
		break;

		}


	Scanner entrada = new Scanner(System.in);

		JOptionPane.showMessageDialog(null,"\n#   TABELA DE DIAS DA SEMANA #\n"+
									   "\n# (1) DOMINGO                #"+
									   "\n# (2) SEGUNDA-FEIRA    #"+
									   "\n# (3) TERÇA-FEIRA  	        #"+
									   "\n# (4) QUARTA-FEIRA	      #"+
									   "\n# (5) QUINTA-FEIRA	        #"+
									   "\n# (6) SEXTA-FEIRA 	        #"+
									   "\n# (7) SABADO		                 #");

	System.out.println("\nPor Favor informe um numero, para saber o dia da semana "); 
	int semana = entrada.nextInt();

		switch(semana){

			case 1:
				System.out.println("\nO numero 1 representa o dia da semana *Domingo*");
			break;

			case 2:
				System.out.println("\nO numero 2 representa o dia da semana *Segunda-Feira*");
			break;

			case 3:
				System.out.println("\nO numero 3 representa o dia da semana *Terça-Feira*");
			break;

			case 4:
				System.out.println("\nO numero 4 representa o dia da semana *Quarta-Feira*");
			break;

			case 5:
				System.out.println("\nO numero 5 representa o dia da semana *Quinta-Feira*");
			break;	

			case 6:
				System.out.println("\nO numero 6 representa o dia da semana *Sexta-Feira*");
			break;	

			case 7:
				System.out.println("\nO numero 7 representa o dia da semana *Sabado-Feira*");
			break;
		}


	System.out.println("\nPor Favor informe o numero 1 "); 
	double num1 = entrada.nextDouble(); 

	System.out.println("\nPor Favor informe o numero 2 "); 
	double num2 = entrada.nextDouble(); 

	JOptionPane.showMessageDialog(null,"\n*   TABELA DE OPERAÇÕES  *\n"+
									   "\n# M   MEDIA ENTRE OS NUMEROS DIGITADOS #"+
									   "\n# S   DIFERENÇA DO MAIOR PELO MENOR         #"+
									   "\n# P   PRODUTO ENTRE DOIS NUMEROS             #"+
									   "\n# D   DIVISÃO DO PRIMEIRO PELO SEGUNDO   #");

	//entrada.nextInt();  //Serve apenas para limpar o banfer, quebra de linha do numero anterior digitado \n

	String operacao = JOptionPane.showInputDialog("Digite a letra em maiusculo da operação que deseja realizar!"); 

		switch(operacao){

			case "M":
				System.out.println("\nA média dos numeros digitados é: " + ((num1+num2)/2));
			break;

			case "S":
				System.out.println("\n Há diferença do Maior numero pelo menor é: "+ Math.abs(num1 - num2));
			break;

			case "P":
				System.out.println("\nO produto dos dois numeros digitados é: " + (num1*num2));
			break;

			case "D":
				System.out.println("\n Resultado da divisão do primeiro numero digitado pelo segundo = " + (num1/num2));
			break;

		}
		System.exit(0);//encerra a aplicação
	JOptionPane.showMessageDialog(null,"\n*   TABELA DE PLANOS  *\n"+
									   "\n# PLANO A - AUMENTO DE 10%  #"+
									   "\n# PLANO B - AUMENTO DE 15%  #"+
									   "\n# PLANO C - AUMENTO DE 20%  #\n");

	String plano = JOptionPane.showInputDialog("Digite a letra correspondente do seu plano de trabalho "); 
	double salario = Double.parseDouble(JOptionPane.showInputDialog("\n Por Favor digite o valor de seu salario ")); 

		switch(plano){

			case "A":
				System.out.println("\n Foi selecionado o plano " + plano + " o seu aumento é de: " + ((salario)*0.10) 
					+ " . O seu novo salario será de: " + ((salario)*0.10+salario));
			break;

			case "B":
				System.out.println("\n Foi selecionado o plano " + plano + " o seu aumento é de: " + ((salario)*0.15)
					+ " . O seu novo salario será de: " + ((salario)*0.15+salario));
			break;

			case "C":
				System.out.println("\n Foi selecionado o plano " + plano + " o seu aumento é de: " + ((salario)*0.20)
					+ " . O seu novo salario será de: " + ((salario)*0.20+salario));
			break;

		}

		System.exit(0);//encerra a aplicação

	int codigo = 0;
	double quantidade = 0.0;

	try{

		JOptionPane.showMessageDialog(null,"\n* CARDAPIO DA LANCHONETE  *\n"+
										   "\n# CODIGO 100 | CACHORRO QUENTE | R$: 1,20 #"+
										   "\n# CODIGO 101 | BAURU SIMPLES        | R$: 1,30 #"+
										   "\n# CODIGO 102 | BAURU COM OVO      | R$: 1,50 #"+
										   "\n# CODIGO 103 | HAMBURGUER            | R$: 1,20 #"+
										   "\n# CODIGO 104 | CHEESEBURGUER      | R$: 1,30 #"+
										   "\n# CODIGO 105 | REFRIGERANTE           | R$: 1,00 #\n");	

	codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"\n Por Favor digite o codigo do produto "));
	quantidade = Double.parseDouble(JOptionPane.showInputDialog("\n Por Favor digite a quantidade que será comprada deste produto "));  

	}

	catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,"Houve erro na conversão, por favor tente novamente e digite as informações corretamente! ");
    }	

			switch(codigo){

				case 100:
					System.out.println("\nVocê comprou " + quantidade + " unidades do produto de codigo '100' Cachorro Quente"
					+ ". O valor a pagar é de R$: " + (quantidade*1.20)); 
				break;

				case 101:
					System.out.println("\nVocê comprou " + quantidade + " unidades do produto de codigo '101' Bauru Simples"
					+ " . O valor a pagar é de R$: " + (quantidade*1.30)); 
				break;

				case 102:
					System.out.println("\nVocê comprou " + quantidade + " unidades do produto de codigo '102' Bauru com Ovo"
					+ " . O valor a pagar é de R$: " + (quantidade*1.50)); 
				break;

				case 103:
					System.out.println("\nVocê comprou " + quantidade + " unidades do produto de codigo '103' Hamburguer"
					+ " . O valor a pagar é de R$: " + (quantidade*1.20)); 
				break;

				case 104:
					System.out.println("\nVocê comprou " + quantidade + " unidades do produto de codigo '104' Cheeseburguer"
					+ " . O valor a pagar é de R$: " + (quantidade*1.30)); 
				break;		

				case 105:
					System.out.println("\nVocê comprou " + quantidade + " unidades do produto de codigo '105' Refrigerante"
					+ " . O valor a pagar é de R$: " + (quantidade*1.00)); 
				break;	

			}

	System.exit(0);//encerra a aplicação*/
	String aux = null;
	char periodo = '0';

	try{

		JOptionPane.showMessageDialog(null,"\n* SAUDAÇÃO  *\n"+
										   "\n# M - MATUTINO     #"+
										   "\n# V - VESPERTINO #"+
										   "\n# N - NOTURNO      #\n");	

		aux = JOptionPane.showInputDialog("\n Por Favor digite a letra do periodo que você estuda: \n");
		periodo = aux.charAt(0);	

		}

	catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,"Houve erro na conversão, por favor tente novamente e digite as informações corretamente! ");
    	}	

			switch(periodo){

				case 'M':
					System.out.println("\nVocê estuda de Manhã - BOM DIA!! ");
				break;

				case 'V':
					System.out.println("\nVocê estuda de Tarde - BOA TARDE!! ");
				break;

				case 'N':
					System.out.println("\nVocê estuda de Noite - BOA NOITE!! ");
				break;
			}
	}
}




/*Compilar no terminal palavras com acentuação: -encoding utf-8

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