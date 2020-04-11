import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

public class Aula06
{
public static void main(String[] args)
	{

        /*double pontuacao = Double.parseDouble(JOptionPane.showInputDialog("\n Digite sua pontuação realizada na primeira fase do jogo: \n")); 

        if(pontuacao >= 1000){
        JOptionPane.showMessageDialog(null,"Parabens você atingiu: " + pontuacao + " e passou para a segunda fase do jogo! ");
        System.exit(0);
         }

        else{
        JOptionPane.showMessageDialog(null,"Game Over!");
        System.exit(0);
        }*/
	
        /*double numero = Double.parseDouble(JOptionPane.showInputDialog("\n Digite um numero para validação do seu tipo: \n")); 
        

        if(numero%2==0){
                JOptionPane.showMessageDialog(null,"O numero que você digitou é Par!");
                System.exit(0);
         }

        else{
                JOptionPane.showMessageDialog(null,"O numero que você digitou é Impar!");
                System.exit(0);
        }*/
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dê um palpite, e tente adivinhar o numero correto: "));

        if(numero==15){
                JOptionPane.showMessageDialog(null,"Parabéns você acertou o numero sorteado!");
        }

        else{

        if(numero>15){
                JOptionPane.showMessageDialog(null,"O numero que você digitou é maior que o numero sorteado!");
        }
        else{
               JOptionPane.showMessageDialog(null,"O numero que você digitou é menor que o numero sorteado!");
         }
       }
    }
}

//Compilar no terminal palavras com acentuação: -encoding utf-8