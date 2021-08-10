
import java.util.Scanner;

public class BT3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			boolean flag = true;
			do {
			System.out.println("1.Thuc hien bai toan 1 !");
			System.out.println("2.Thuc hien bai toan 2 !");
			System.out.println("3.Thuc hien bai toan 3 !");
			System.out.println("4.Thuc hien bai toan 4 !");
			System.out.println("0.Thoat chuong trinh !");
			int key = sc.nextInt();
			switch (key) {
			case 1: {
				int n;
				do {
					System.out.println("Nhap n :");
					n = sc.nextInt();
				}
				while(n<1);
				int gt = 1;
				for(int i=1;i<=n;i++) {
					gt = gt *i;
				}
				System.out.println(n +"! = " + gt);
				break;
			}
			case 2: {
				
				System.out.println("Nhap so nguyen duong n :");
				int n = sc.nextInt();
				int m =0;
				while(n>0) {
					m = m*10 + n%10;
					n /= 10;

				}

				System.out.println("So nguoc lai la : " + m);
				break;
			}
			case 3: {
				System.out.println("Nhap x :");
				float x = sc.nextFloat();
				System.out.println("Nhap n :");
				int n = sc.nextInt();
				float s = 1;
				int gt = 1;
				for(int i=1;i<=n;i++) {
					gt = gt *i;
					s += Math.pow(x,i)/gt;
				}
				
				System.out.println("Gia tri bieu thuc :" +s);
				break;
			}
			case 4: {
				System.out.println("Nhap tu so :");
				int tuso = sc.nextInt();
				System.out.println("Nhap mau so :");
				int mauso = sc.nextInt();
				int ts = tuso;
				int ms = mauso;
				while(tuso != mauso)
					if(tuso>mauso)
						tuso = tuso - mauso;
					else
						mauso = mauso - tuso;
				ts = ts/tuso;
				ms = ms/tuso;
				System.out.println("Phan so toi gian la :" +ts+"/"+ms);
				break;
			}
			case 0: {
				return;
			}
			default:
				System.out.println("Khong hop le !!!");
				break;
			}
		}
			while(flag);
			
	}

}
