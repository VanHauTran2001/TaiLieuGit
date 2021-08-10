import java.util.Scanner;

public class SinhVien extends MonHoc{

	private String maSV , hoDem , ten , ngaySinh ;

	public SinhVien() {
		super();
	}

	public SinhVien(String maSV, String hoDem, String ten, String ngaySinh,String maMH, String tenMH, int heSoMH, float diemMH) {
		super(maMH,tenMH,heSoMH,diemMH);
		this.maSV = maSV;
		this.hoDem = hoDem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public void nhapsv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sv :");
		maSV = sc.nextLine();
		System.out.println("Nhap ho dem :");
		hoDem = sc.nextLine();
		System.out.println("Nhap ten :");
		ten = sc.nextLine();
		System.out.println("Nhap ngay sinh :");
		ngaySinh = sc.nextLine();
	}

	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoDem=" + hoDem + ", ten=" + ten + ", ngaySinh=" + ngaySinh + "]";
	}
	
}
