package exercico;

public class TesteArray {
	

		public static void main(String[] args) {
			int[] v1 = {1,2,3};
			int[] v2 = {2,5,7};
			
			int[] v3 = new int[6];

			int i = 0 ;
			int j = 0;
			int k = 0;

			for ( int cont = 0 ; cont < v1.length ; cont++ ) {
				System.out.println( v1[cont] + " ");
			}
			
			for ( int cont = 0 ; cont < v2.length ; cont++ ) {
				System.out.println( v2[cont] + " ");
			}
			
			while ( k != v3.length ) {
				
				if ( i == v1.length ) {
					for ( ; j < v2.length ; j++)
						v3[k++] = v2[j];
					break;
				}
				
				if ( j == v2.length ) {
					for ( ; i < v1.length ; i++)
						v3[k++] = v1[i];
					break;
				}
				
				if ( v1[i] < v2[j] ) {
					v3[k++] = v1[i++];
				}else
					v3[k++] = v2[j++];


			}
			
			for ( int cont = 0 ; cont < v3.length ; cont++ ) {
				System.out.println( v3[cont] + " ");
			}

			
			
		}



}
