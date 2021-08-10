
public class NhanVien {
	protected String ten , sdt;
	protected int tuoi;
	
	public NhanVien(String ten, String sdt, int tuoi) {
		this.ten = ten;
		this.sdt = sdt;
		this.tuoi = tuoi;
	}

	public NhanVien() {
		
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	
}
