import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		
		boolean prime=true;
		System.out.println("enter the number to check whether its prime or not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<=num;i++) {
			if(num%i==0)
				prime=false;
				break;
		}
		if(prime) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println("Given number is not prime");
		}
		
	}

}
