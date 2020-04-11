import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicios
{
	public static void main(String[] args)
	{
		
		/*Scanner entrada = new Scanner(System.in);

		System.out.println("\nPor Favor digite um numero inteiro "); 
		int numero01 = entrada.nextInt(); 

		if(numero01>20){
			System.out.println("O numero digitado é: " + (numero01/2)); 
		}
		else{
			System.out.println("Numero digitado é menor que 20, sistema não irá realizar nenhuma operação");
		}

		System.out.println("\nPor Favor digite um numero "); 
		double numero02 = entrada.nextDouble(); 

		if(numero02>=50 && numero02<=100){
			System.out.println("O numero digitado é maior ou igual a 50 e menor ou igual a 100: " + numero02); 
		}
		else{
			System.out.println("Numero digitado não é maior ou igual a 50 e menor ou igual a 100");
		}
		
		System.out.println("\nPor Favor informe o numero 1 "); 
		int numero1 = entrada.nextInt(); 
		System.out.println("\nPor Favor informe o numero 2 "); 
		int numero2 = entrada.nextInt();

		if(numero1==numero2){
			System.out.println("Os numeros digitados são iguais");
		}
		else{
				//if((numero03 - numero04)<0){
			System.out.println("A diferença entre os numeros digitados é: " + Math.abs(numero1 - numero2));
				}

		System.out.println("\nPor Favor informe o numero 1 "); 
		double num1 = entrada.nextDouble(); 
		System.out.println("\nPor Favor informe o numero 2 "); 
		double num2 = entrada.nextDouble(); 

		if(num1>num2){

		}
		

		System.out.println("\nPor Favor digite o seu nome: "); 
		String nome = entrada.nextLine();

		System.out.println("\nPor Favor digite o seu salario: "); 
		double salario = entrada.nextDouble(); 

		System.out.println("\nPor Favor digite o tempo que você trabalha nessa empresa: "); 
		int anoTrabalho = entrada.nextInt(); 

		if(anoTrabalho>=5){
			System.out.println("\nParabéns, você tem cinco anos ou mais de trabalho nessa empresa." 
			 + " E será concedido a você um bônus de 20%: " + (salario*0.2));
		}

		else{
			System.out.println("Parabêns você ganhou um bônus de 10%: " + (salario*0.1));
		}

		System.out.println("\nPor Favor digite sua idade: "); 
		int idade = entrada.nextInt(); 

		if(idade>=18){
			System.out.println("\nA idade digitada foi: " + idade + " . Parabêns você já é maior de idade.");
		}
		else{
			System.out.println("\nVocê ainda é menor de idade, portanto não pode utilizar esse programa.");
		}
		
			System.out.println("\nPor Favor digite sua altura: "); 
			double altura = entrada.nextDouble(); 
			System.out.println("Por Favor digite 'M' Masculino e 'F' Feminino: "); 
			char sexoPessoa = entrada.next().charAt(0); 
		
			if(sexoPessoa == 'M'){
				System.out.println("Você é do sexo Masculino, e sua altura é: " + altura + " . Portato o seu peso ideal deve ser: " + ((72.7*altura)-58.0));
			} 
			else{
				if(sexoPessoa == 'F'){
					System.out.println("Você é do sexo Feminino, e sua altura é: " + altura + " . Portato o seu peso ideal deve ser: " + ((62.1*altura)-44.7));
				}
				else{
					System.out.println("O sexo digitado está fora dos parâmetros solicitados, reinicie a aplicação e tente novamente!");
				}
			}
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

		}*/

	Scanner entrada = new Scanner(System.in);

	System.out.println("\nPor Favor informe o numero 1 "); 
	double num1 = entrada.nextDouble(); 

	System.out.println("\nPor Favor informe o numero 2 "); 
	double num2 = entrada.nextDouble(); 

	JOptionPane.showMessageDialog(null,"\n#   TABELA DE OPERAÇÕES  #\n"+
									   "\n# M   MEDIA ENTRE OS NUMEROS DIGITADOS #"+
									   "\n# S   DIFERENÇA DO MAIOR PELO MENOR    #"+
									   "\n# P   PRODUTO ENTRE DOIS NUMEROS       #"+
									   "\n# D   DIVISÃO DO PRIMEIRO PELO SEGUNDO #");

	System.out.println("Digite a letra em maiusculo da operação que deseja realizar!"); 
	String op = entrada.nextLine(); 

	switch(op){

		case M:
			System.out.println("\nA média dos numeros digitados é: " + (num1/num2)*2.0);
		break;

		case S:
			System.out.println("\nO numero 1 representa o mês de janeiro.");
		break;

		case P:
			System.out.println("\nO numero 1 representa o mês de janeiro.");
		break;

		case D:
			System.out.println("\nO numero 1 representa o mês de janeiro.");
		break;



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

*/