
public class HocSinh {
	protected String sbd;
	protected String hoten;
	protected String diachi;
	protected String uutien;
	
	public HocSinh(String sbd , String hoten , String diachi , String uutien) {
		this.sbd = sbd;
		this.hoten = hoten;
		this.diachi = diachi;
		this.uutien = uutien;
	}
	public String getSbd() {
		return sbd;
	}
	public void setSbd(String sbd) {
		this.sbd = sbd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getUutien() {
		return uutien;
	}
	public void setUutien(String uutien) {
		this.uutien = uutien;
	}

}
