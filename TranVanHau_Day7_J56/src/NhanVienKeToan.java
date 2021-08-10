
public class NhanVienKeToan extends NhanVien{
	
	protected float luongCoBan , heSoLuong;
	
	public NhanVienKeToan(String ten, String sdt, int tuoi, float luongCoBan, float heSoLuong) {
		super(ten,sdt,tuoi);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}

	public float getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public float luongKeToan() {
		return luongCoBan*heSoLuong;
	}
	
	@Override
	public String toString() {
		return "\nThong tin nhan vien Ke Toan :"
			   +"\nTen : " + ten 
			   +"\nTuoi :" + tuoi
			   +"\nSDT : " + sdt
			   +"\nLuong co ban :" + luongCoBan
			   +"\nHe so luong :" + heSoLuong
			   +"\nLuong = " + luongKeToan();
	}
	/*
	public void showInfor() {
		System.out.println("Ten :" + ten);
		System.out.println("Tuoi :" + tuoi);
		System.out.println("SDT : " + sdt);
		System.out.println("Luong co ban :" + luongCoBan);
		System.out.println("He so luong :" + heSoLuong);
		System.out.println("Luong = " + luongKeToan());
	}
	*/
}
