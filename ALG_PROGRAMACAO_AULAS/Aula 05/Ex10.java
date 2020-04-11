import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex10
{
public static void main(String[] args)
	{
        Scanner entrada = new Scanner(System.in);
		System.out.println("Por Favor digite o seu nome: "); 
		String nome = entrada.nextLine(); 

		System.out.println("Por Favor digite sua idade: "); 
		int idade = entrada.nextInt(); 

		System.out.println("Por Favor digite o seu sexo: "); 
		char sexoPessoa = entrada.next().charAt(0);  
		
        System.out.println("O seu nome é " + nome + "," + " você tem: " + idade + " Anos" + "," + " e seu genero é: " + sexoPessoa);
	}
}
