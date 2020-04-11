import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Aulafor
{
	public static void main(String[] args){
		
	Scanner entrada = new Scanner(System.in);

	int cont, media_alturas = 0, superior_ciquenta = 0;
	double total_alturas = 0.0,  porcentagem_pessoas = 0.0;
		//Incialização ; condição; incremento do contador
		/*for(cont = 0; cont <= 50;  cont++){
			System.out.println("\nNumero:" + cont);
		}	

		for(cont = 100; cont > 0;  cont--){
			System.out.println("\nNumero:" + cont);
		}
		for(cont = 15; cont <= 100;  cont++){
			System.out.println("\nNumero: " + cont + " Ao quadrado é " + Math.pow(cont, 2));
		}
		System.out.println("Por Favor digite um numero: "); 
		int numero = entrada.nextInt(); 

		for(cont = 1; cont <= numero;  cont++){
			System.out.println("\nNumero: " + cont);
		}
		for(cont = 1; cont <= 3;  cont++){

			System.out.println("\nPor Favor digite a idade da: " + cont + " Pessoa"); 
			int idade = entrada.nextInt(); 
			System.out.println("Por favor digite a altura da: " + cont + " Pessoa"); 
			double altura = entrada.nextDouble();
			System.out.println("Por Favor digite o peso da: " + cont + " Pessoa"); 
			double peso = entrada.nextDouble();

			if(idade > 50){
				superior_ciquenta = superior_ciquenta ++;
			}
			if(idade>= 10 && idade <=20){
				total_alturas = (total_alturas + altura);
				media_alturas = media_alturas ++;
			}
			if(peso < 40){
				porcentagem_pessoas = porcentagem_pessoas ++;
			}
		}
		DecimalFormat df = new DecimalFormat("###,##0.00");
		System.out.println("A quantidade de pessoas com idade superior a 50 anos é: " + superior_ciquenta);
		System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos: " + (df.format(total_alturas/media_alturas)) + " Metros");
		System.out.println("A porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas: " + (df.format(porcentagem_pessoas*100/3)) + "%");*/
		
		int alunos_aprovados = 0, alunos_exame = 0, alunos_reprovados = 0; 
		double media_classe = 0.0, media = 0.0;
		
		for(cont = 1; cont <= 6;  cont++){

		System.out.println("\nPor Favor digite a primeira nota, do aluno: " + cont); 
		double nota01 = entrada.nextDouble(); 
		System.out.println("\nPor Favor digite a segunda nota, do aluno: " + cont); 
		double nota02 = entrada.nextDouble();

		media = ((nota01 + nota02)/2.0);
		System.out.println(media);

			if(media >= 7.0){
				alunos_aprovados += 1;
			}
			else if(media > 3.0 && media < 7.0){
				alunos_exame += 1;
			}
			else if(media <= 3.0){
				alunos_reprovados += 1;
			}
			media_classe = media_classe + media;
		}

		DecimalFormat df = new DecimalFormat("###,##0.00");
		JOptionPane.showMessageDialog(null,"Total de alunos aprovados: " + alunos_aprovados + "\nTotal de alunos de exame: " +
		alunos_exame + "\nTotal de alunos reprovados: " + alunos_reprovados + "\nA média da classe é: " + (df.format(media_classe/6.0)));	
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