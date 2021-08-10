import java.util.Scanner;

public class BT1 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("---------------------Menu------------------");
			System.out.println("Nhap lua chon !");
			System.out.println("1.Giai bai toan 1");
			System.out.println("2.Giai bai toan 2");
			System.out.println("3.Giai bai toan 3");
			System.out.println("4.Giai bai toan 4");
			System.out.println("0.Thoat chuong trinh");
			int x = sc.nextInt();
			switch (x) {
			case 1: {
				bai1();
				break;
			}
			case 2: {
				bai2();
				break;
			}
			case 3: {
				bai3();
				break;
			}
			case 4: {
				bai4();
				break;
			}
			case 0 :{
				break;
				
			}
			default:
				System.out.println("Khong hop le !");
				break;
			}
	
		}while(flag);
	}

	private static void bai4() {
		System.out.println("Nhap thang :");
		int month = sc.nextInt();
		switch (month) {
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10:
		case 12 :
			System.out.println("Thang " + month + " co 31 ngay ");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("Thang " + month + " co 30 ngay !");
			break;
		case 2 :
			System.out.println("Nhap nam :");
			int year = sc.nextInt();
			if((year % 4 == 0 && year % 100 != 0 )||(year %400 ==0)) {
				System.out.println("Thang " + month + " Nam " + year + " co 29 ngay !");
			}
			else {
				System.out.println("Thang " + month + " Nam " + year + " co 28 ngay !");
			}
			break;
		default:
			System.out.println("Thang khong hop le !!!");
		}
		
	}

	private static void bai3() {
		System.out.println("Nhap luong cung cua nhan vien :");
		int lc = sc.nextInt();
		System.out.println("Nhap doanh so cua nhan vien :");
		int ds = sc.nextInt();
		int luong;
		if(ds<50000000) {
		
			luong = (int)(lc - lc*0.1);
			System.out.println("Tien luong thuc linh cua nhan vien la :"+luong);
			
		}
		else if(ds>=50000000 && ds<=100000000) {
			luong = lc;
			System.out.println("Tien luong thuc linh cua nhan vien la :"+luong);
		}
		else if(ds>=100000000 && ds<=150000000) {
			luong = (int)(lc + 0.05*ds);
			System.out.println("Tien luong thuc linh cua nhan vien la :"+luong);
		}
		else{
			luong = (int)(lc + 0.1*ds);
			System.out.println("Tien luong thuc linh cua nhan vien la :"+luong);
		}
		
	}

	private static void bai2() {
		System.out.println("Nhap diem tong ket cua hoc sinh :");
		float diem = sc.nextFloat();
		if(diem >=8) {
			System.out.println("Xep loai gioi !");
		}
		else if(diem >=7 && diem <8) {
			System.out.println("Xep loai kha !");
		}
		else if(diem >=5 && diem<7) {
			System.out.println("Xep loai trung binh");
		}
		else {
			System.out.println("Xep loai yeu !");
		}
		
	}

	private static void bai1() {
		System.out.println("Nhap he so a:");
		int a = sc.nextInt();
		System.out.println("Nhap he so b:");
		int b = sc.nextInt();
		System.out.println("Nhap he so c:");
		int c = sc.nextInt();
		if(b == 0)
        {
            if(c == 0)
            {
                System.out.println("Phuong trinh vo so nghiem !");
            }
            else
            {
               System.out.println("Phuong trinh vo nghiem !!");
            }
        }
		else {
			float dental = b*b-4*a*c;
			if(dental >0) {
				System.out.println("Phuong trinh co 2 nghiem phan biet :");
				float x1 = (float)(-b + Math.sqrt(dental)/(2*a));
				float x2 = (float)(-b - Math.sqrt(dental)/(2*a));
				System.out.println("x1 = " +x1);
				System.out.println("x2 = "+x2);
			}
			else if(dental ==0) {
				System.out.println("Phuong trinh co nghiem kep :");
				float x3 = (float)(-b/(2*a));
				System.out.println("x ="+x3);
			}
			else {
				System.out.println("Phuong trinh vo nghiem !!!");
			}
		}
		
	}

}
