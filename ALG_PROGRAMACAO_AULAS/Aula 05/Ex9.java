import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex9
{
public static void main(String[] args)
	{
        String imovel, nomeUsuario; 
        double mediaDisciplina, precoProd; 
        int divisao, guiches;  
        char sexoPessoa; 
        boolean resultExpressao, escolha;  

        int idade = 20;
        double vlConta = 350.69;
        String nomeEmpresa = "Pwi Sistemas";
        mediaDisciplina = 8;


		System.out.println("\n");
		System.out.println("A area do circulo de raio 5 cm: " + (3.14159*5*5)); 

		System.out.println("\n");

		System.out.println("Calculo 01 = " + ((20.0 - 15.0)/2)); 
		System.out.println("Calculo 02 = " + (2*(5.0/20.0) + 30/(15*2))); 
		System.out.println("Calculo 03: " + (35/(6.0+2.0))); 
		System.out.println("Calculo 04: " + (23%4)); 

		System.out.println("\n");

		System.out.println("Ex 3 Variavel idade: " + idade); 
		System.out.println("Ex 3 Variavel vlConta: " + vlConta); 
		System.out.println("Ex 3 Variavel nomeEmpresa: " + nomeEmpresa); 
		System.out.println("Ex 3 Variavel mediaDisciplina: " + mediaDisciplina + "\n\n");

        Scanner entradanomeUsuario = new Scanner(System.in);
		System.out.println("Por Favor informe seu nome " +"\n");
		nomeUsuario = entradanomeUsuario.nextLine();
 		System.out.println("\n"+"Bem vindo a aula 05: " + nomeUsuario +" !");

        Scanner entradaNota = new Scanner(System.in);
		double nota1, nota2, nota01, nota02, notaFinal;
		System.out.println("Por favor digite suas duas notas: "); 
		nota1 = entradaNota.nextDouble();
		nota2 = entradaNota.nextDouble();
		System.out.println("Suas notas sao: " + nota1 + " e " + nota2 + "  " + "Sua media final e: " + ((nota1+nota2)/2)); 

 		//double nota01 = JOptionPane.showInputDialog("Por Favor digite sua nota 01: ");
 		//double nota02 = JOptionPane.showInputDialog("Por Favor digite sua nota 02: ");
		//System.out.println("As notas digitadas foram: " + nota01 + " e " + nota02 + "  " + "Sua media final é: " + ((nota01+nota02)/2)); 
        //JOptionPane.showMessageDialog(null, nota01, nota02 + "Digite uma informação valida nesse campo");
        
        String nome01;
        int idade01;
        char sexoPessoa01;
        double vlteste01;
        Scanner entrada = new Scanner(System.in);
		System.out.println("Por Favor digite o seu nome: "); 
		nome01 = entrada.nextLine(); 
		System.out.println("Por Favor digite sua idade: "); 
		idade01 = entrada.nextInt(); 
		System.out.println("Por Favor digite o seu sexo: "); 
		sexoPessoa01 = entrada.next().charAt(0);  
        System.out.println("O seu nome é " + nome01 + "," + " você tem: " + idade01 + " Anos" + "," + " e seu genero é: " + sexoPessoa01);
	}
}

//Compilar no terminal palavras com acentuação: -encoding utf-8