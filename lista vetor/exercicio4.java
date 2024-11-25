import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i, j;
		
		a = new int[TAM];
		
		//começando o laço para ler o numero
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um número");
			a[i] = ler.nextInt();
			
		//enquanto o j for menor que o numero digitado ele soma 2 e apresenta
			
			for(j=0; j<=a[i]; j+=2) {
				System.out.println("Os números pares são: "+ j);
				
			}
			
		}
		ler.close();
	}

}
