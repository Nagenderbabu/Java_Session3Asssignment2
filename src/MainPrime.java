import java.util.Scanner;


public class MainPrime {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prime p=new Prime();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		p.input = sc.nextInt();
		p.isPrime(p.input);
		
		
	}
	

}
