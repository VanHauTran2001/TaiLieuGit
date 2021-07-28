import java.util.Scanner;

public class Hang {
	private String id;
	private String id_LoaiHang;
	private String tenHang;
	private int soLuong;
	private int donGia;
	
	public Hang() {
		
	}
	
	
	public Hang(String id, String id_LoaiHang, String tenHang, int soLuong, int donGia) {
		this.id = id;
		this.id_LoaiHang = id_LoaiHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}


	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ID hang:");
		id=sc.nextLine();
		System.out.print("Nhap ID Loai hang:");
		id_LoaiHang=sc.nextLine();
		sc.nextLine();
		System.out.print("Nhap ten hang:");
		tenHang=sc.nextLine();
		System.out.print("Nhap So luong hang:");
		soLuong=sc.nextInt();
		System.out.print("Nhap don gia hang:");
		donGia=sc.nextInt();
		sc.nextLine();
	}
	public void output() {
		System.out.printf("%15s %15s %15s %15d %15d\n",id,id_LoaiHang,tenHang,soLuong,donGia);
	}
	
}
