
public class NhanVienKinhDoanh extends NhanVienKeToan{
	
	private float doanhSoThang , doanhSoChiTieu;
	
	public NhanVienKinhDoanh(String ten, String sdt, int tuoi, float luongCoBan, float heSoLuong,float doanhSoThang , float doanhSoChiTieu) {
		super(ten,sdt,tuoi,luongCoBan,heSoLuong);
		this.doanhSoThang = doanhSoThang;
		this.doanhSoChiTieu = doanhSoChiTieu;
		
	}

	public float getDoanhSoThang() {
		return doanhSoThang;
	}

	public void setDoanhSoThang(float doanhSoThang) {
		this.doanhSoThang = doanhSoThang;
	}

	public float getDoanhSoChiTieu() {
		return doanhSoChiTieu;
	}

	public void setDoanhSoChiTieu(float doanhSoChiTieu) {
		this.doanhSoChiTieu = doanhSoChiTieu;
	}
	public float luongKinhDoanh() {
		float thuong , phat;
		if(doanhSoChiTieu>=200) {
			thuong =(float) 0.1*doanhSoThang;
			phat = 0;
		}
		else if(doanhSoChiTieu>=150) {
			thuong = (float)0.05*doanhSoThang;
			phat = 0;
		}
		else if(doanhSoChiTieu>=100 && doanhSoChiTieu<150){
			thuong = (float)0.02*doanhSoThang;
			phat = 0;
		}
		else if(doanhSoChiTieu>90) {
			thuong = 0;
			phat = 100;
		}
		else if(doanhSoChiTieu>75) {
			thuong = 0;
			phat = 200;
		}
		else if(doanhSoChiTieu>50) {
			thuong = 0;
			phat = 500;
		}
		else if(doanhSoChiTieu>25) {
			thuong =0;
			phat = 1000;
		}
		else {
			thuong = 0;
			phat = 2000;
		}
		return luongCoBan*heSoLuong+thuong-phat;
	}
	


	@Override
	public String toString() {
		return "\nThong tin nhan vien Kinh Doanh :"
				   +"\nTen : " + ten 
				   +"\nTuoi :" + tuoi
				   +"\nSDT : " + sdt
				   +"\nLuong co ban :" + luongCoBan
				   +"\nHe so luong :" + heSoLuong
				   +"\nDoanh So Thang :"+doanhSoThang
				   +"\nDoanh So Chi Tieu :"+doanhSoChiTieu
				   +"\nLuong = " + luongKinhDoanh();
	}
/*
	public void showInfor() {
		System.out.println("Ten :" + ten);
		System.out.println("Tuoi :" + tuoi);
		System.out.println("SDT : " + sdt);
		System.out.println("Luong co ban :" + luongCoBan);
		System.out.println("He so luong :" + heSoLuong);
		System.out.println("Doanh so thang :" + doanhSoThang);
		System.out.println("Doanh so chi tieu :" + doanhSoChiTieu);
		System.out.println("Luong " + luongKinhDoanh());
	}
	
	*/
	
}
