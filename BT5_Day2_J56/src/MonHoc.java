import java.util.Scanner;
public class MonHoc {

	protected String maMH , tenMH;
	protected int heSoMH ;
	protected float diemMH;
	
	public MonHoc() {
		
	}

	public MonHoc(String maMH, String tenMH, int heSoMH, float diemMH) {
		
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.heSoMH = heSoMH;
		this.diemMH = diemMH;
	}

	public String getMaMH() {
		return maMH;
	}

	public void setMaMH(String maMH) {
		this.maMH = maMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public int getHeSoMH() {
		return heSoMH;
	}

	public void setHeSoMH(int heSoMH) {
		this.heSoMH = heSoMH;
	}

	public float getDiemMH() {
		return diemMH;
	}

	public void setDiemMH(float diemMH) {
		this.diemMH = diemMH;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma MH :");
		maMH = sc.nextLine();
		System.out.println("Nhap ten MH :");
		tenMH = sc.nextLine();
		System.out.println("Nhap he so MH :");
		heSoMH = sc.nextInt();
		System.out.println("Nhap diem MH :");
		diemMH = sc.nextFloat();
	}

	public void xuat() {
		System.out.printf("%15s %15s %15d %15.2f \n",maMH,tenMH,heSoMH,diemMH);
	}
	
	
}
