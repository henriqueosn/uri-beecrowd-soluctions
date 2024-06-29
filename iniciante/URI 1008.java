import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int hours = sc.nextInt();
		double payment = sc.nextDouble();
		
		double salary = hours * payment;
		
		System.out.printf("NUMBER = %d %n", code);
		System.out.printf("SALARY = %.2f %n", salary);
		
		sc.close();
		
	}

}
