package exercico;
import java.util.Scanner;

/*
 *
12. Fa�a um algoritmo para ler o nome, as tr�s notas e o n�mero de faltas de um aluno e escrever qual
a sua situa��o final: Aprovado, Reprovado por Falta ou Reprovado por M�dia. A m�dia para
aprova��o � 5,0 e o limite de faltas � 27. A reprova��o por falta sobrep�e a reprova��o por M�dia.
 */

public class Notas {
	
	public static void main (String[]args) {
		String nome;
		Double n1,n2,n3,falta,media;
	
		
		Scanner ler= new Scanner(System.in);
		

			System.out.println("Informe o nome ");
			nome=ler.nextLine();
			System.out.println(" informe 1� nota: ");
			n1=ler.nextDouble();
			System.out.println(" informe 2� nota: ");
			n2=ler.nextDouble();
			System.out.println(" informe 3� nota: ");
			n3=ler.nextDouble();
			System.out.println(" informe as faltas: ");
		  falta=ler.nextDouble();
		  
		  media=(n1+n2+n3)/3;
	
		
		if (media>=27) {
			System.out.println(" reprovado por falta");
			
		}else if(media>=5 && falta <27) {
			System.out.println(" Aprovado!");
		} else if( media<5 && falta>27) {
			System.out.println(" reprovado ");
		}
		
		
	}
	

}
