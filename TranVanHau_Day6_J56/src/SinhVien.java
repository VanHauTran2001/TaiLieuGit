import java.util.Scanner;

public class SinhVien {
	
	private String maSV , ho , ten , gioiTinh , ngaySinh , queQuan ;

	public SinhVien(String maSV, String ho, String ten, String gioiTinh, String ngaySinh, String queQuan) {
		
		this.maSV = maSV;
		this.ho = ho;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}

	public SinhVien() {
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sv :");
		maSV = sc.nextLine();
		System.out.println("Nhap ho :");
		ho = sc.nextLine();
		System.out.println("Nhap ten :");
		ten = sc.nextLine();
		System.out.println("Nhap gioi tinh :");
		gioiTinh = sc.nextLine();
		System.out.println("Nhap ngay sinh :");
		ngaySinh = sc.nextLine();
		System.out.println("Nhap que quan :");
		queQuan = sc.nextLine();
	}
	public void xuat() {
		System.out.println("Ma SV :" + maSV);
		System.out.println("Ho ten :"+ ho + " " + ten);
		System.out.println("Gioi tinh :" + gioiTinh);
		System.out.println("Ngay sinh :" + ngaySinh);
		System.out.println("Que quan :" + queQuan);
		
	}
	
	
}
