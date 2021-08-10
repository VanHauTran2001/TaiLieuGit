import java.util.Scanner;
public class HocSinh {
	private String maHS,hoDem,ten ,ngaySinh ,gt ;
	private float diemToan , diemVan , diemLy , diemHoa , diemSu , diemDia , diemSinh , diemAnh,diemGDCD;
	
	public HocSinh() {
		
	}

	public HocSinh(String maHS, String hoDem, String ten, String ngaySinh, String gt, float diemToan, float diemVan,
			float diemLy, float diemHoa, float diemSu, float diemDia, float diemSinh, float diemAnh, float diemGDCD) {
		
		this.maHS = maHS;
		this.hoDem = hoDem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.gt = gt;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.diemSu = diemSu;
		this.diemDia = diemDia;
		this.diemSinh = diemSinh;
		this.diemAnh = diemAnh;
		this.diemGDCD = diemGDCD;
	}

	public String getMaHS() {
		return maHS;
	}

	public void setMaHS(String maHS) {
		this.maHS = maHS;
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

	public String getGt() {
		return gt;
	}

	public void setGt(String gt) {
		this.gt = gt;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemSu() {
		return diemSu;
	}

	public void setDiemSu(float diemSu) {
		this.diemSu = diemSu;
	}

	public float getDiemDia() {
		return diemDia;
	}

	public void setDiemDia(float diemDia) {
		this.diemDia = diemDia;
	}

	public float getDiemSinh() {
		return diemSinh;
	}

	public void setDiemSinh(float diemSinh) {
		this.diemSinh = diemSinh;
	}

	public float getDiemAnh() {
		return diemAnh;
	}

	public void setDiemAnh(float diemAnh) {
		this.diemAnh = diemAnh;
	}

	public float getDiemGDCD() {
		return diemGDCD;
	}

	public void setDiemGDCD(float diemGDCD) {
		this.diemGDCD = diemGDCD;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma hs :");
		maHS = sc.nextLine();
		System.out.println("Nhap ho dem :");
		hoDem = sc.nextLine();
		System.out.println("Nhap ten :");
		ten = sc.nextLine();
		System.out.println("Nhap ngay sinh :");
		ngaySinh = sc.nextLine();
		System.out.println("Nhap gioi tinh :");
		gt = sc.nextLine();
		System.out.println("Nhap diem toan :");
		diemToan = sc.nextFloat();
		System.out.println("Nhap diem van :");
		diemVan = sc.nextFloat();
		System.out.println("Nhap diem ly :");
		diemLy = sc.nextFloat();
		System.out.println("Nhap diem hoa :");
		diemHoa = sc.nextFloat();
		System.out.println("Nhap diem su :");
		diemSu = sc.nextFloat();
		System.out.println("Nhap diem dia :");
		diemDia = sc.nextFloat();
		System.out.println("Nhap diem sinh :");
		diemSinh = sc.nextFloat();
		System.out.println("Nhap diem anh :");
		diemAnh = sc.nextFloat();
		System.out.println("Nhap diem GDCD :");
		diemGDCD = sc.nextFloat();
	}

	public float diemtb() {
		return ((diemToan+diemVan)*2 + (diemAnh+diemDia+diemGDCD+diemHoa+diemLy+diemSinh+diemSu))/11;
	}

	@Override
	public String toString() {
		return "HocSinh [maHS=" + maHS + ", hoDem=" + hoDem + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", gt=" + gt
				+ ", diemToan=" + diemToan + ", diemVan=" + diemVan + ", diemLy=" + diemLy + ", diemHoa=" + diemHoa
				+ ", diemSu=" + diemSu + ", diemDia=" + diemDia + ", diemSinh=" + diemSinh + ", diemAnh=" + diemAnh
				+ ", diemGDCD=" + diemGDCD + ", diemTB = " + diemtb()+ "]";
	}
	
	
	
		
	
	

}
