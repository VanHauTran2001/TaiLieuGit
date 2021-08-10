import java.util.Scanner;

public class MainBT6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HoaDon hd = new HoaDon();
		hd.nhaphd();
		System.out.println("Nhap so luong hang hoa :");
		int n = sc.nextInt();
		sc.nextLine();
		HoaDon hh[] = new HoaDon[n];
		for(int i=0;i<n;i++) {
			System.out.println("Hang hoa thu"+(i+1));
			hh[i] = new HoaDon();
			hh[i].nhaphh();
		}
		System.out.println("THONG TIN HOA DON");
		hd.xuathd();
		System.out.printf("%15s %15s %15s %15s \n","Ten Hang","So Luong","Don Gia","Thanh Tien");
		for(int i=0;i<n;i++) {
			hh[i].xuathh();
		}
		float tongtien = 0;
		for(int i=0;i<n;i++) {
			tongtien = tongtien + hh[i].thanhtien();
		}
		float tien = (float)(tongtien + tongtien*0.1) ;
		System.out.println("\n Tong tien hang la :"+tongtien);
		System.out.println("\n Tong tien phai tra :"+tien);
	}

}
