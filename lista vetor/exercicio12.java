import java.util.Scanner;
public class exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i;
		
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um número");
			a[i] = ler.nextInt();
		}
		
		if (a[0] != a[9]) {
            System.out.println("O número não é um palíndromo.");
        } 
		
		else if (a[1] != a[8]) {
            System.out.println("O número não é um palíndromo.");
        } 
		
		else if (a[2] != a[7]) {
            System.out.println("O número não é um palíndromo.");
        } 
		
		else if (a[3] != a[6]) {
            System.out.println("O número não é um palíndromo.");
        } 
		
		else if (a[4] != a[5]) {
            System.out.println("O número não é um palíndromo.");
        } 
		
		else {
        	
            // Se todas as condições acima forem verdadeiras então é um palindromo
            System.out.println("O número é um palíndromo.");
        }
		
		ler.close();

  }
}
