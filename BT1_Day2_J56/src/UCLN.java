import java.util.Scanner;
public class UCLN {
	
	public static int ucln(int a , int b) {
		if(b==0)
			return a;
		else {
			return ucln(b,a%b);
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap 4 so nguyen :");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		System.out.println("Uoc chung lon nhat cua 4 so :"+ucln(ucln(a, b),ucln(c, d)));
		
	}
}
