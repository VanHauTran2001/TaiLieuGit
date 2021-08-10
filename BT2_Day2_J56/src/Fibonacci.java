import java.util.Scanner;

public class Fibonacci {
	public static int fibonacci(int n) {
		if(n<0) {
			return -1;
		}
		else if(n==0 || n==1) {
			return n;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n :");
		int n = scanner.nextInt();
		System.out.println("Day "+ n +" so Fibonacci dau tien :");
		for(int i=1;i<=n;i++) {
			System.out.printf(fibonacci(i) + " ");
		}
		scanner.close();
	}

}
