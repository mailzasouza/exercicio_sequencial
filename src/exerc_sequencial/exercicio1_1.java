package exerc_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y, preco, area, metro;
			
		System.out.println("Digite a largura, o comprimento e o valor do metro quadrado separado por espaço:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		metro = sc.nextDouble();
		area = x * y;
		System.out.printf("AREA = %.2f%n", area);

		preco = area * metro;
		System.out.printf("PRECO = %.2f%n", preco);
		
		
		
		sc.close();
		
		
	}

}
