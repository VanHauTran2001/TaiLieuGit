import java.util.Scanner;

public class BT4 {
	public static int ktrasnt(int n) {
	
		if(n<2) 
			return 0;
		for(int i=2;i<=n/2;i++) 
			if(n%i==0) 
				return 0;
			return 1;
		
	}
	public static int gt(int n) {
		int gt = 1;
		for(int i=1;i<=n;i++) {
			gt = gt*i;
		}
		return gt;
	}
	public static int fibonacci(int n) {
		if(n==0||n==1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		do {
			System.out.println("1.Thuc hien bai toan 1 ");
			System.out.println("2.Thuc hien bai toan 2 ");
			System.out.println("3.Thuc hien bai toan 3 ");
			System.out.println("4.Thuc hien bai toan 4 ");
			System.out.println("5.Thuc hien bai toan 5" );
			System.out.println("0.Thoat khoi chuong trinh !");
			int key = sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("Nhap n :");
				int n = sc.nextInt();
				for(int i=2;i<=n/2;i++) {
					if(n%i==0) {
						System.out.println(n + " khong phai so nguyen to !");
						break;
					}
					else {
						System.out.println(n + " la so nguyen to !");
						break;
					}
				}
				break;
			}
			case 2: {
				System.out.println("Nhap n :");
				int n = sc.nextInt();
				int tong = 0;
				int dem = 0;
				int i =2;
				System.out.println(n+ " SNT dau tien la :");
				while(dem<n) {
					if(ktrasnt(i)==1) {
						System.out.print(i+ " ");
						
						tong = tong +i;
						dem++;
					}
					i++;
				}
				
				System.out.println("\nTong " + n + " SNT dau tien la :"+tong);
				break;
				
			}
			case 3: {
				System.out.println("BANG CUA CHUONG ");
				for(int i=2;i<=9;i++) {
					System.out.println("---------Bang nhan"+ i +"---------");
					for(int j=1;j<=9;j++) {
						System.out.println(i + "x" + j + "= " +(i*j));
					}
				}
				break;
			}
			case 4: {
				System.out.println("Nhap x :");
				float x = sc.nextFloat();
				System.out.println("Nhap n :");
				int n = sc.nextInt();
				double s = 0;
				for(int i=0;i<=n;i++) {
					s += (float)Math.pow((-1),i)*Math.pow(x,(2*i+1))/gt(2*i+1);
				}
				System.out.println("\nGia tri bieu thuc :"+s);
				break;
			}
			case 5: {
				System.out.println("Nhap n :");
				int n = sc.nextInt();
				System.out.println("\nDay " + n + " so Fibonacci dau tien :");
				for(int i=1;i<=n;i++) {
					System.out.printf(fibonacci(i) + " ");
				}
				break;
			}
			case 0: {
				return;
			}
			default:
				System.out.println("Khong hop le !");
				break;
			}
		}while(flag);
	}
}
