import java.util.Scanner;

public class KhachHang {
	private String id , tenKH;

	public KhachHang() {
		
	}

	public KhachHang(String id, String tenKH) {
		this.id = id;
		this.tenKH = tenKH;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id khach hang :");
		id = sc.nextLine();
		System.out.println("Nhap ten khach hang :");
		tenKH = sc.nextLine();
	}
	public void output() {
		System.out.printf("%15s %15s ",id,tenKH);
	}
}
