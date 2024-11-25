import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=11;
		int a[], i;
		
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um número");
			a[i] = ler.nextInt();
			
			a[i] = 1;
			
			for(int j = 0; j < i; j++) {
                a[i] = a[i]*2;
			}
			 System.out.println("a[" + i + "] = " + a[i]);
		}
		
		ler.close();
		
	}

}
