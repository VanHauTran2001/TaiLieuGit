
public class NhanVienBaoVe extends NhanVienKeToan{
	private int soNgayCong ;
	private float phuCap;
	
	public NhanVienBaoVe(String ten, String sdt, int tuoi, float luongCoBan, float heSoLuong , int soNgayCong , float phuCap) {
		super(ten,sdt,tuoi,luongCoBan,heSoLuong);
		this.soNgayCong = soNgayCong;
		this.phuCap = phuCap;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public float getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(float phuCap) {
		this.phuCap = phuCap;
	}
	
	public float luongBaoVe() {
		if(soNgayCong>=24) {
			return luongCoBan*heSoLuong+phuCap+500f;
		}
		else {
			return luongCoBan*heSoLuong+phuCap+0;
		}
	}
	
	@Override
	public String toString() {
		return "\nThong tin Nhan Vien Bao Ve :"
				+"\nTen :" + ten 
				+ "\nSDT :" + sdt 
				+ "\nTuoi :" + tuoi 
				+ "\nSoNgayCong :" + soNgayCong
				+ "\nPhuCaP :" + phuCap 
				+ "\nLuongCoBan :" + luongCoBan
				+ "\nHeSoLuong :" + heSoLuong 
				+ "\nLuong = " + luongBaoVe();
	}

	/*
	public void showInfor() {
		System.out.println("Ten :" + ten);
		System.out.println("Tuoi :" + tuoi);
		System.out.println("SDT : " + sdt);
		System.out.println("Luong co ban :" + luongCoBan);
		System.out.println("He so luong :" + heSoLuong);
		System.out.println("Phu cap :" + phuCap);
		System.out.println("So ngay cong :" + soNgayCong);
		System.out.println("Luong " + luongBaoVe());
	}
	*/
	
}
