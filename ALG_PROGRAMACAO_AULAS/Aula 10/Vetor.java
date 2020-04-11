import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Vetor
{
	public static void main(String[] args){
		
	Scanner entrada = new Scanner(System.in);

		int i; // Variavel contador
		double numeros[] = new double [10]; // Declaração do vetor numeros de 10 elementos

		// Exercio 01 Aula 10
		for (i = 0; i < numeros.length; i++){
		System.out.print("\nPor Favor digite o " + (i+1) + " numero: "); 
		numeros[i] = entrada.nextDouble();
		}

		for (i = 0; i < numeros.length; i ++){
		System.out.println("\nO " + (i+1) + " numero digitado foi: " + numeros[i]); 
		}

		System.exit(0);

		// Exercio 02 Aula 10
		String nomes[] = new String [15];

		for(i = 0; i < nomes.length; i++){
		System.out.print("\nPor Favor digite o nome da " + (i+1) + " pessoa: "); 
		nomes[i] = entrada.nextLine();
		}

		for(i = 14; i >= 0; i--){
		System.out.print("\nO nome da " + (i+1) + " Pessoa foi: " + nomes[i]); 
		}

		System.exit(0);

		// Exercio 03 Aula 10
		int elementosA[] = new int [8]; 
		int elementosB[] = new int [8]; 

		for (i = 0; i < elementosA.length; i++){
		System.out.print("\nPor Favor digite o " + (i+1) + " numero: "); 
		elementosA[i] = entrada.nextInt();

		elementosB[i] = (elementosA[i]*3);
		}

		for (i = 0; i < elementosB.length; i ++){
		System.out.println("\nO numero " + (i+1)+ ": (" + elementosA[i] + " * 3 é = " + elementosB[i]+")"); 
		}

		System.exit(0);

		// Exercio 04 Aula 10
		int elementos_A[] = new int [5]; 
		int elementos_B[] = new int [5]; 
		int elementos_C[] = new int [5]; 

		for (i = 0; i < elementos_A.length; i++){
		System.out.print("\nPor Favor digite o " + (i+1) + " numero do Vetor A: "); 
		elementos_A[i] = entrada.nextInt();

		System.out.print("\nPor Favor digite o " + (i+1) + " numero do Vetor B: "); 
		elementos_B[i] = entrada.nextInt();

		elementos_C[i] = (elementos_A[i] - elementos_B[i]);
		}

		for (i = 0; i < elementos_C.length; i ++){
		System.out.println("\nO numero " + elementos_A[i] + " - " + elementos_B[i] + " = " + elementos_C[i]); 
		}

		System.exit(0);

		// Exercio 05 Aula 10
		int cont = 4;

		int elementos_ReaisA[] = new int [4]; 
		int elementos_ReaisB[] = new int [7]; 
		int juncao_A_B[] = new int [11]; 

		for (i = 0; i < elementos_ReaisA.length; i++){

		System.out.print("\nPor Favor digite o " + (i+1) + " numero do Vetor A: "); 
		elementos_ReaisA[i] = entrada.nextInt();

		juncao_A_B[i] = elementos_ReaisA[i]; 
		}

		for (i = 0; i < elementos_ReaisB.length; i++){
		System.out.print("\nPor Favor digite o " + (i+1) + " numero do Vetor B: "); 
		elementos_ReaisB[i] = entrada.nextInt();

		juncao_A_B[cont] = elementos_ReaisB[i]; 
		cont ++;
		}

		for (i = 0; i < juncao_A_B.length; i++){
		System.out.println("\nO numero digitado " + (i+1) + " digitado foi: " + juncao_A_B[i]); 
		}

		System.exit(0);

		// Exercio 06 Aula 10
		int numeros_sorteados[] = new int [1000]; 
		int menorNumeroVetor = 0;
		
		for (i = 0; i < numeros_sorteados.length; i++){
		Random gerador = new Random();

		numeros_sorteados[i] = 1 + gerador.nextInt(1001);

		menorNumeroVetor = numeros_sorteados[i];

			if(numeros_sorteados[i] < menorNumeroVetor){
				menorNumeroVetor = numeros_sorteados[i];
			}
		}
		System.out.println("O menor numero sorteado é: " + menorNumeroVetor);
	}	
}
/*
int sorteado;
Random gerador = new Random();

sorteado = random.nextInt();
sorteado = random.nextInt(10);
sorteado = 1 + random.nextInt(10);

double sorteado;

sorteado = random.nextDouble();
sorteado = 10 + random.nextDouble()*90;




				int i = 0, maior = 0;

		int numeros [] = new int [10];

		System.out.println("\nPor Favor digite o 1 numero."); 
		numeros[i] = entrada.nextInt(); 
		maior = numeros[0];

		for(i = 1; i < numeros.length; i++){
			System.out.println("\nPor Favor digite o " + (i+1) + " numero."); 
			numeros[i] = entrada.nextInt(); 

			if(numeros[i] > maior){
				maior = numeros[i];
			}
		}
		System.out.println("O maior número é " + maior);


notas[0] = 4.5;
notas[1] = 5.5;
notas[2] = 6.5;

 -encoding utf-8

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