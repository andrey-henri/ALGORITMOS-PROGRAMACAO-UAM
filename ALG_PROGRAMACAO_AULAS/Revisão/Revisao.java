import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;

public class Revisao
{
	public static void main(String[] args){
		
	Scanner entrada = new Scanner(System.in);
			
	int cont = 1, notasClasse = 0, aluno1 = 0, aluno2 = 0, aluno3 = 0, aluno4 = 0, aluno5 = 0;
		
		do{
				
			System.out.println("\nPor favor digite a nota um do " + cont + "º  aluno"); 
			int nota1 = entrada.nextInt(); 
			
			if(nota1 < 0 || nota1 > 10){
			System.out.println("A primeira nota digitada é invalida, você terá que recomeçar a operação");
			System.exit(0);//encerra a aplicação
			}
			
			System.out.println("\nPor favor digite a nota dois do " + cont + "º  aluno"); 
			int nota2 = entrada.nextInt(); 		
		
			if(nota1 < 0 || nota2 > 10){
			System.out.println("A segunda nota digitada é invalida, você terá que recomeçar a operação");
			System.exit(0);//encerra a aplicação
			}
					
			switch(cont){
			case 1:
			aluno1 = (nota1 + nota2);
			notasClasse = notasClasse + aluno1;
			break;
			case 2:
			aluno2 = (nota1 + nota2);
			notasClasse = notasClasse + aluno2;
			break;
			case 3:
			aluno3 = (nota1 + nota2);
			notasClasse = notasClasse + aluno3;
			break;		
			case 4:
			aluno4 = (nota1 + nota2);
			notasClasse = notasClasse + aluno4;
			break;
			case 5:
			aluno5 = (nota1 + nota2);
			notasClasse = notasClasse + aluno5;
			break;
			}	
			
		cont = cont + 1;
		
		}while(cont<=5);
		
	System.out.println("\nA Média do primeiro aluno é: " + (aluno1/2));
	System.out.println("\nA Média do segundo aluno é: " + (aluno2/2));
	System.out.println("\nA Média do terceiro aluno é: " + (aluno3/2));
	System.out.println("\nA Média do quarto aluno é: " + (aluno4/2));
	System.out.println("\nA Média do quinto aluno é: " + (aluno5/2));
	System.out.println("\nDesta maneira a média da sala é: " + (notasClasse/5));

	}	
}


/* -encoding utf-8

	//System.out.println("Por Favor digite o seu sexo: "); 
	//char sexoPessoa = entrada.next().charAt(0);  

	//System.out.println("Por Favor digite o seu nome: "); 
	//String nome = entrada.nextLine(); 

	//System.out.println("Por Favor digite um numero "); 
	//double numero02 = entrada.nextDouble();

	//System.out.println("\nPor Favor digite sua idade: "); 
	//int idade = entrada.nextInt();  
	
	/System.out.println("\nPor Favor digite sua idade: "); 
	//int idade = entrada.nextFloat();  
	
	/System.out.println("\nPor Favor digite sua idade: "); 
	//int idade = entrada.nextBoolean();


switch(menu){
	case 1:
	System.out.println("Você digitou o numero 1");
	break;
	case 2:
	System.out.println("Você digitou o numero 2");
	break;
}

		String senhaFixa = "a123";

		if(senha.equals(senhaFixa)){
			System.out.println ("Acesso concedido");
		}
		

int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"\n Por Favor digite o codigo do produto "));
double quantidade = Double.parseDouble(JOptionPane.showInputDialog("\n Por Favor digite a quantidade que será comprada deste produto ")); 
	
Math.pow( double base, double exp); Calcula uma potência. Base elevada ao Expoente Math.pow( 2 , 10);
Math.sqrt(double v); Calcula a raiz quadrada de um valor v Math.sqrt( 25 );
Math.PI Retorna a constante PI (3.1415) Math.PI
System.out.println("O valor de pi é: " + Math.PI);
System.out.println("O valor de E é: " + Math.E);
System.out.println("'e' elevado ao quadrado = "+ Math.exp(2));
System.out.println("2 elevado ao cubo = " + Math.pow(2, 3));

Módulo (Resto da divisão) % 10 % 3  =  1
Prioridade:
1 - ();
2 - / e *
3 - * e - 

Maior que >
Maior ou igual a >=
Menor que <
Menor ou igual <=
igual ==
Diferente de !=

Operadores Lógicos
- E (&&)
- OU (||)
- NEGAÇÃO (!)

ORDEM DE PRIORIDADE ! , && E ||

EXERCICIOS 02:

- x || z && w = V 
- z && x && x = V
- z || z || w && x = V
- x && z && w || ! w = v=V


- x (True) || z (true) && w (false)  = V 
- z (true) && x (True) && (True) = V
- z (True) || z (True) || w (false) && x (True) = V
- x (True) && z (True) && w (false) || ! w (true) = V


CONSOLE NAVEGADOR:

var x = true;

var z = true;

var w = false;


x || z && w

true

z && x && x

true

x && z && w || !w

true

*/