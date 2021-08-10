import java.util.Scanner;
public class HangHoa {
	protected String tenHang ;
	protected int sl ;
	protected float donGia;
	
	public HangHoa() {
		
	}

	public HangHoa(String tenHang, int sl, float donGia) {
		
		this.tenHang = tenHang;
		this.sl = sl;
		this.donGia = donGia;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public int getSl() {
		return sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	
	public void nhaphh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten hang :");
		tenHang = sc.nextLine();
		System.out.println("Nhap so luong hang :");
		sl = sc.nextInt();
		System.out.println("Nhap don gia :");
		donGia = sc.nextFloat();
	}
	public float thanhtien() {
		return sl*donGia;
	}
	public void xuathh() {
		System.out.printf("%15s %15d %15.2f %15.3f \n",tenHang,sl,donGia,thanhtien());
		
	}
}
