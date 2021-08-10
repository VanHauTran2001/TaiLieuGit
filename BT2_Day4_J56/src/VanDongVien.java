import java.util.Scanner;

public class VanDongVien {
	private String ten;
	private int thanhtich1 , thanhtich2 , thanhtich3;
	
	public VanDongVien() {
		
	}

	public VanDongVien(String ten, int thanhtich1, int thanhtich2, int thanhtich3) {
		
		this.ten = ten;
		this.thanhtich1 = thanhtich1;
		this.thanhtich2 = thanhtich2;
		this.thanhtich3 = thanhtich3;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getThanhtich1() {
		return thanhtich1;
	}

	public void setThanhtich1(int thanhtich1) {
		this.thanhtich1 = thanhtich1;
	}

	public int getThanhtich2() {
		return thanhtich2;
	}

	public void setThanhtich2(int thanhtich2) {
		this.thanhtich2 = thanhtich2;
	}

	public int getThanhtich3() {
		return thanhtich3;
	}

	public void setThanhtich3(int thanhtich3) {
		this.thanhtich3 = thanhtich3;
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten van dong vien :");
		ten = sc.nextLine();
		System.out.println("Nhap thanh tich lan 1 :");
		thanhtich1 = sc.nextInt();
		System.out.println("Nhap thanh tich lan 2 :");
		thanhtich2 = sc.nextInt();
		System.out.println("Nhap thanh tich lan 3 :");
		thanhtich3 = sc.nextInt();
		sc.nextLine();
	}
	public int tongtt() {
		return thanhtich1+thanhtich2+thanhtich3;
	}
	public void xuat() {
		System.out.printf("%15s %15d %15d %15d %15d \n",ten,thanhtich1,thanhtich2,thanhtich3,tongtt());
	}
}
