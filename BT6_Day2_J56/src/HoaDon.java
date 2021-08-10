import java.util.Scanner;

public class HoaDon extends HangHoa{

	private String soHD , hoTen , ngayMua ;

	public HoaDon() {
		super();
	}

	public HoaDon(String tenHang, int sl, float donGia,String soHD, String hoTen, String ngayMua) {
		super(tenHang,sl,donGia);
		this.soHD = soHD;
		this.hoTen = hoTen;
		this.ngayMua = ngayMua;
	}

	public String getSoHD() {
		return soHD;
	}

	public void setSoHD(String soHD) {
		this.soHD = soHD;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgayMua() {
		return ngayMua;
	}

	public void setNgayMua(String ngayMua) {
		this.ngayMua = ngayMua;
	}
	
	public void nhaphd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so HD :");
		soHD = sc.nextLine();
		System.out.println("Nhap ho ten :");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay mua hang :");
		ngayMua = sc.nextLine();
	}
	public void xuathd() {
		System.out.println("So HD : "+ soHD);
		System.out.println("Ho Ten : "+ hoTen);
		System.out.println("Ngay Mua : "+ ngayMua);
	}
}
