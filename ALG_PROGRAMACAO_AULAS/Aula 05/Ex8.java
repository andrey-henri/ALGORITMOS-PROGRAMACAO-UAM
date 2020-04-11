import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex8
{
public static void main(String[] args)
	{

// Ex8

        Scanner entrada = new Scanner(System.in);

		System.out.println("Por Favor digite a altura do Triângulo equilatero: "); 
		double altura = entrada.nextDouble(); 

		System.out.println("Por Favor digite a base do Triângulo equilatero: "); 
		double base = entrada.nextDouble(); 

		double at = ((altura*base)/2);

        System.out.println("A area do Triângulo digitado é: " + at + "\n");
        //System.out.println("A area do Triângulo digitado é: " + ((altura*base)/2));


// Ex9
        System.out.println("Por Favor digite o primeiro numero: \n"); 
		int n1 = entrada.nextInt(); 

		System.out.println("Por Favor digite o segundo numero: \n"); 
		int n2 = entrada.nextInt(); 

        System.out.println("O primeiro numero digitado foi: " + n1 + " e o segundo numero digitado foi: " + n2 + "\n");

// Ex10

        System.out.println("Por Favor digite o seu ano de nascimento: \n"); 
		int anoNasc = entrada.nextInt(); 

        System.out.println("Você nasceu em: " + anoNasc + ", Hoje em 2018, você tem: " + (2018-anoNasc) + " Anos de vida." +
         " E no ano de 2020 você terá: " +  (2020-anoNasc) + " Anos de idade!"); 

	}
}

//Compilar no terminal palavras com acentuação: -encoding utf-8