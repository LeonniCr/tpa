import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=20;
		int a[], b[], i, j=0, Resultado;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o numero:");
			a[i] = ler.nextInt();
		}
		
		//calcula para ver se é par
		for (i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++; //faz o valor avançar
            }
        }
        
		//calcula para ver se é impar
        for (i = 0; i < TAM; i++) {
            if (a[i] % 2 != 0) {
                b[j] = a[i];
                j++; //faz o valor avançar
            }
        }
		
		System.out.print("Números pares e impares:");
        for (i = 0; i < TAM; i++) {
            System.out.print(b[i] + " ");
        }
        
        ler.close();
		}
		
}


