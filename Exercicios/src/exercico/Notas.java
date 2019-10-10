package exercico;
import java.util.Scanner;

/*
 *
12. Faça um algoritmo para ler o nome, as três notas e o número de faltas de um aluno e escrever qual
a sua situação final: Aprovado, Reprovado por Falta ou Reprovado por Média. A média para
aprovação é 5,0 e o limite de faltas é 27. A reprovação por falta sobrepõe a reprovação por Média.
 */

public class Notas {
	
	public static void main (String[]args) {
		String nome;
		Double n1,n2,n3,falta,media;
	
		
		Scanner ler= new Scanner(System.in);
		

			System.out.println("Informe o nome ");
			nome=ler.nextLine();
			System.out.println(" informe 1º nota: ");
			n1=ler.nextDouble();
			System.out.println(" informe 2º nota: ");
			n2=ler.nextDouble();
			System.out.println(" informe 3º nota: ");
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
