import java.util.Scanner;
public class BT2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Thuc hien bai toan 1 !");
		System.out.println("2.Thuc hien bai toan 2 !");
		System.out.println("3.Thuc hien bai toan 3 !");
		System.out.println("4.Thuc hien bai toan 4 !");
		System.out.println("0.Thoat chuong trinh !");
		int num = sc.nextInt();
		switch (num) {
		case 1: {
			System.out.println("Nhap 1 so :");
			int key = sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("Mot");
				break;
			}
			case 2: {
				System.out.println("Hai");
				break;
			}
			case 3: {
				System.out.println("Ba");
				break;
			}
			case 4: {
				System.out.println("Bon");
				break;
			}
			case 5: {
				System.out.println("Nam");
				break;
			}
			case 6: {
				System.out.println("Sau");
				break;
			}
			case 7: {
				System.out.println("Bay");
				break;
			}
			case 8: {
				System.out.println("Tam");
				break;
			}
			case 9: {
				System.out.println("Chin");
				break;
			}
			default:
				System.out.println("So khong hop le !!!");	
			}
			break;
		}
		case 2: {
			System.out.println("Nhap x :");
			float x = sc.nextFloat();
			float s ;
			if(x>2 && x<3) {
				s = (float)(5*Math.cos(3*x+2)-Math.log(x*x+2));
				System.out.println("Gia tri bieu thuc :" + s);
			}
			else if(x>=3) {
				s = (float)(Math.pow((x+3),2));
				System.out.println("Gia tri bieu thuc :" + s);
			}
			else {
				s = 1;
				System.out.println("Gia tri bieu thuc :" + s);
			}
			break;
		}
		case 3: {
			float m;
			do {
				System.out.println("Nhap so luong mua :");
				m = sc.nextFloat();
			} while (m<1);
			float tien;
			if(m>=1 && m<=50) {
				tien = 14000*m;
				System.out.println("So tien phai tra cho " + m +"kg gao la :" + tien );
			}
			else {
			
				float muathem = m  -50;;
				if(muathem >=1 && muathem <=25) {
					tien = 50*14000 + muathem*14000-muathem*500;
					System.out.println("So tien phai tra la :" + tien);
				}
				else if(muathem>=26 && muathem<=40) {
					tien = 50*14000 + muathem*14000-muathem*750;
					System.out.println("So tien phai tra la :" + tien);
				}
				else if(muathem>=41 && muathem<=55) {
					tien = 50*14000 + muathem*14000-muathem*1000;
					System.out.println("So tien phai tra la :" + tien);
				}
				else {
					tien = 50*14000 + muathem*14000-muathem*1500;
					System.out.println("So tien phai tra la :" + tien);
				}
			}
			break;
		}
		case 4: {
			System.out.println("Nhap toa do dinh A :");
			float a1 = sc.nextFloat();
			float a2 = sc.nextFloat();
			System.out.println("Nhap toa do dinh B :");
			float b1 = sc.nextFloat();
			float b2 = sc.nextFloat();
			System.out.println("Nhap toa do dinh C :");
			float c1 = sc.nextFloat();
			float c2 = sc.nextFloat();
			float ab = (float)(Math.sqrt(Math.pow((b1-a1),2) + Math.pow((b2-a2),2)));
			float bc = (float)(Math.sqrt(Math.pow((c1-b1),2) + Math.pow((c2-b2),2)));
			float ac = (float)(Math.sqrt(Math.pow((c1-a1),2) + Math.pow((c2-a2),2)));
			System.out.println("Do dai canh AB :" + ab);
			System.out.println("Do dai canh BC :" + bc);
			System.out.println("Do dai canh AC :" + ac);
			if((b1-a1)/(c1-a1) == (b2-a2)/(c2-a2)) {
				System.out.println(" A , B ,C thang hang !");
			}
			else {
				float cv = ab + bc + ac;
				float p = cv/2;
				double s = (float)Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
				float r = (float)((ab*bc*ac)/(4*s));
				System.out.println("CV : " +cv);
				System.out.println("DT : " +s);
				System.out.println("Ban kinh :" + r);
			}
			break;
		}
		case 0: {
			break;
		}
		default:
			System.out.println("Khong hop le !!");
			break;
		}
	}

}
