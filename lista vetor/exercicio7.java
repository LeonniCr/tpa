import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=15;
		int a[], b[], i, j, f;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for(j=0; j<TAM; j++) {
			System.out.println("Digite um numero");
			a[j] = ler.nextInt();
		}
		
        for (j=0; j<TAM; j++) {
            f = 1;
            
            for (i=a[j]; i>=1; i--) {
                f= f* i;
                
            }
		b[j] = f;
		
	}
        
        System.out.println("\nFatoriais calculados:");
        for (j = 0; j < TAM; j++) {
            System.out.println("Fatorial de " + a[j] + " é: " + b[j]);
        }
        
        ler.close();

   }
}

