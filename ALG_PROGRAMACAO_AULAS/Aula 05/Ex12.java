import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;

public class Ex12
{
public static void main(String[] args)
	{
		String aux = JOptionPane.showInputDialog("\n Por Favor digite um numero para realizarmos algumas operações com ele: \n"); 	
		try{
			if (aux == null){
				JOptionPane.showMessageDialog(null, "Deseja encerrar a aplicação ?");
			}
			else{
					if(!aux.equals("")) {
						if(!aux.trim().isEmpty()){
							double numero = Double.parseDouble(aux);
							JOptionPane.showMessageDialog(null,"\nO resultado do numero: " + numero + " elevado ao quadrado é igual: " + (Math.pow(numero,2)));
							JOptionPane.showMessageDialog(null,"\nO resultado do numero: " + numero + " elevado ao cubo é igual: " + (Math.pow(numero,3)));
							JOptionPane.showMessageDialog(null,"\nA raiz quadrada do numero: " + numero + " é igual: " + (Math.sqrt(numero)));
							JOptionPane.showMessageDialog(null,"\nO numero: " + numero + " elevado a pontência de 10 é igual a: " + (Math.pow(numero,10)));
						}
							else{
								JOptionPane.showMessageDialog(null, "Informação digitada no campo é invalida!");
							}
			
					}
							else{
								JOptionPane.showMessageDialog(null, "Não foi digitado nenhuma informação nesse campo!");
							}
				}	
		}
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,"Houve erro na conversão para realizar as operações, digite apenas caracteres numericos");
        }		
		System.exit(0);//encerra a aplicação
	}
}

//Compilar no terminal palavras com acentuação: -encoding utf-8


/*import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;


public class Ex12
{
public static void main(String[] args)
	{

// Ex12
        Scanner entrada = new Scanner(System.in);

		System.out.println("\n Por Favor digite um numero para realizarmos algumas operações com ele: \n"); 
		double n1 = entrada.nextDouble(); 

        System.out.println("\nResultado do numero: " + n1 + " elevado ao quadrado é igual: " + (Math.pow(n1,2)));
        System.out.println("\nResultado do numero: " + n1 + " elevado ao cubo é igual: " + (Math.pow(n1,3)));
        System.out.println("\nA raiz quadrada do numero: " + n1 + " é igual: " + (Math.sqrt(n1)));
        System.out.println("\nO numero: " + n1 + " elevado a pontência de 10 é igual a: " + (Math.sqrt(n1)));

        //Scanner entrada = new Scanner(System.in);

		//String nome = JOptionPane.showInputDialog("\n Por Favor digite o seu nome: \n"); 
		//double numero = Double.parseDouble(JOptionPane.showInputDialog("\n Por Favor digite um numero para realizarmos algumas operações com ele: \n")); 

		String aux = JOptionPane.showInputDialog("\n Por Favor digite um numero para realizarmos algumas operações com ele: \n"); 	

		if (aux != null){
			if(!aux.equals("")) {
				if(!aux.trim().isEmpty()){
					double numero = Double.parseDouble(aux);
					JOptionPane.showMessageDialog(null,"\nO resultado do numero: " + numero + " elevado ao quadrado é igual: " + (Math.pow(numero,2)));
					JOptionPane.showMessageDialog(null,"\nO resultado do numero: " + numero + " elevado ao cubo é igual: " + (Math.pow(numero,3)));
					JOptionPane.showMessageDialog(null,"\nA raiz quadrada do numero: " + numero + " é igual: " + (Math.sqrt(numero)));
					JOptionPane.showMessageDialog(null,"\nO numero: " + numero + " elevado a pontência de 10 é igual a: " + (Math.pow(numero,10)));
				}else{
					JOptionPane.showMessageDialog(null, "Informação digitada no campo é invalida!");
				}
			
			}else{
					JOptionPane.showMessageDialog(null, "Não foi digitado nenhuma informação nesse campo!");
			}
		
		}else{
				JOptionPane.showMessageDialog(null, "Deseja encerrar a aplicação ?");
		}

	}
}

//Compilar no terminal palavras com acentuação: -encoding utf-8*/
