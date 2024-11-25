import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		 final int TAM = 10;
	        int a[], b[], c[], i, j, k = 0;
	        a = new int[TAM];
	        b = new int[TAM];
	        c = new int[TAM];

	        System.out.println("Digite os 10 elementos do vetor A:");
	        for (i = 0; i<TAM; i++) {
	            a[i] = ler.nextInt();
	        }

	        System.out.println("Digite os 10 elementos do vetor B:");
	        for (i = 0; i<TAM; i++) {
	            b[i] = ler.nextInt();
	        }

	        for (i = 0; i<TAM; i++) {
	            for (j = 0; j<TAM; j++) {
	                if (a[i] == b[j]) { 
	                    c[k] = a[i];
	                    k++;
	                }
	            }
	        }

	        System.out.println("Interseção dos vetores A e B:");
	        for (i = 0; i<k; i++) {
	            System.out.print(c[i] + " ");
	        }
	        ler.close();
	    }
	}


