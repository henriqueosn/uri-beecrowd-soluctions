import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int quantity = sc.nextInt();
		double value1 = sc.nextDouble();
		
		value1 *= quantity;
		
		code = sc.nextInt();
		quantity = sc.nextInt();
		double value2 = sc.nextDouble();
		
		value2 *= quantity;
		
		double total = value1 + value2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}
