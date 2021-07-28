import java.util.Scanner;

public class LoaiHang {
	private String id , tenLoai;

	public LoaiHang() {
	
	}

	public LoaiHang(String id, String tenLoai) {
		this.id = id;
		this.tenLoai = tenLoai;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	
	public void input() {
		Scanner sc  =new Scanner(System.in);
		System.out.println("Nhap id loai hang:");
		id = sc.nextLine();
		System.out.println("Nhap ten loai :");
		tenLoai = sc.nextLine();
	}
	public void output() {
		System.out.printf("%15s %15s",id,tenLoai);
	}
}
