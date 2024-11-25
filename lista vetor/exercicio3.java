import java.util.Scanner;
public class exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=5;
		int a[], i, div, j;
		
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o numero:");
			a[i] = ler.nextInt();
			
			for (i = 0; i<TAM; i++) {
			     div = 0;

		            for (j = 1; j<=a[i]; j++) {
		                if (a[i] % j == 0) {
		                    div++;
		                }
		            }

		            if (div == 2) {
		                System.out.println(a[i] + " é um numero primo.");
		            } else {
		                System.out.println(a[i] + " não é um numero primo.");
		            }
		            System.out.println();
				}
		}
		ler.close();
	}
}