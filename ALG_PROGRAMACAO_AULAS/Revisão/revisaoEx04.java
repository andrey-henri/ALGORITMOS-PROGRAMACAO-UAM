import java.util.*;
import java.text.*;
import javax.*;

public class revisaoEx04{
	public static void main (String args []){
		
		Scanner entrada = new Scanner (System.in);
		Random gerador = new Random ();
		
		DecimalFormat df = new DecimalFormat ("###,##0.00");
		
		double alturaPedro = 1.50, alturaLucas = 1.10;
		int cont = 0;
			
		while (alturaPedro >= alturaLucas){
			alturaPedro += 0.02;
			alturaLucas += 0.03;
			cont++;
		}
		System.out.println("\nLucas irá demorar: " + cont + " Anos, para atingir a altura: " + df.format(alturaLucas) + ". E desta maneira passar pedro que tem: " + df.format(alturaPedro));		
	}
}