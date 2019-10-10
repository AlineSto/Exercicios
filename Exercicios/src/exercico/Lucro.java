package exercico;
import java.util.Scanner;
/* faça um algoritimo para ler o preço de compra e o porcentual de 
 * lucro desejado por um vendedor e calcular o preço */
 



public class Lucro {
	
	public static void main (String []args) {
		 double valor,port,totalVenda=0;
		 
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Valor do produto: ");
		valor=ler.nextDouble();
		System.out.println("porcetagem: ");
		port=ler.nextDouble();
		
		totalVenda=valor+(valor*port/100);
		System.out.println(" o total da venda: "+totalVenda);
		
		
		
		
		
	}
	
	
	

}
