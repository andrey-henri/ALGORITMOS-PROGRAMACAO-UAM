import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;
public class Teste
{
public static void main(String[] args)
	{
		String aux = JOptionPane.showInputDialog("\n Por Favor digite um numero para realizarmos algumas operações com ele: \n"); 
		if (aux == null){
			JOptionPane.showMessageDialog(null, "Deseja encerrar a aplicação ?");
			// INSERIR PROMPT DE CONFIRMARÇÂO
		}else if(aux.equals("")) {
			JOptionPane.showMessageDialog(null, "Não foi digitado nenhuma informação nesse campo!");
		}else if(aux.trim().isEmpty()){
			JOptionPane.showMessageDialog(null, "Informação digitada no campo é invalida!");
		}else{
			double numero = Double.parseDouble(aux);
			JOptionPane.showMessageDialog(null,"\nO resultado do numero: " + numero + " elevado ao quadrado é igual: " + (Math.pow(numero,2)));
			JOptionPane.showMessageDialog(null,"\nO resultado do numero: " + numero + " elevado ao cubo é igual: " + (Math.pow(numero,3)));
			JOptionPane.showMessageDialog(null,"\nA raiz quadrada do numero: " + numero + " é igual: " + (Math.sqrt(numero)));
			JOptionPane.showMessageDialog(null,"\nO numero: " + numero + " elevado a pontência de 10 é igual a: " + (Math.pow(numero,10)));
		}
	}
}