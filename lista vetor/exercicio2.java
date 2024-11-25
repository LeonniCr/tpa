import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=5;
		int a[], i, j, Resultado;
		
		a = new int[TAM];
		
		for(j=0; j<TAM; j++) {
			System.out.println("Digite o numero para sua tabuada");
			a[j] = ler.nextInt();
			
			for(i=1; i<=10; i++) {
				Resultado = i*a[j];
				System.out.println(a[j]+ " * " + i +" = "+ Resultado );
			}
		}
		ler.close();
	}

}
