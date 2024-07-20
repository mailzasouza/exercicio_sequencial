package exerc_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double area, raio;
		
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		area = pi * (raio*raio);
		System.out.printf("AREA = %.4f", area);
		
		
		sc.close();

	}

}
