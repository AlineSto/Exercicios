package exercico;
import java.util.Scanner;

public class Fatorial {
	
	public static void main(String []args) {
		int n,i,fatorial;
		Scanner ler= new Scanner(System.in);
		
		System.out.print("informe o numero: ");
		n=ler.nextInt();
		fatorial=1;
		for(i=1;i<=n;i++) {
			fatorial=fatorial*i;
			System.out.println(fatorial);
		}
		
		
		
	}

}
