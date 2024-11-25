import java.util.Scanner;
public class exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], n, i;
		
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um número");
			a[i] = ler.nextInt();
		}
		
		System.out.println("Digite um número a ser buscado:");
		n = ler.nextInt();
		
		//se o numero esta em determinada posição ele irá achar e avisar o usuario
		if (a[0] == n) {
            System.out.println("O número " + n + " está armazenado em A[0].");
        } 
		else if (a[1] == n) {
            System.out.println("O número " + n + " está armazenado em A[1].");
        } 
		else if (a[2] == n) {
            System.out.println("O número " + n + " está armazenado em A[2].");
        } 
		else if (a[3] == n) {
            System.out.println("O número " + n + " está armazenado em A[3].");
        } 
		else if (a[4] == n) {
            System.out.println("O número " + n + " está armazenado em A[4].");
        } 
		else if (a[5] == n) {
            System.out.println("O número " + n + " está armazenado em A[5].");
        } 
		else if (a[6] == n) {
            System.out.println("O número " + n + " está armazenado em A[6].");
        } 
		else if (a[7] == n) {
            System.out.println("O número " + n + " está armazenado em A[7].");
        } 
		else if (a[8] == n) {
            System.out.println("O número " + n + " está armazenado em A[8].");
        } 
		else if (a[9] == n) {
            System.out.println("O número " + n + " está armazenado em A[9].");
        } 
		else {
            System.out.println("Este número não está armazenado em A.");
        }
        
        ler.close();
		
	}

}
