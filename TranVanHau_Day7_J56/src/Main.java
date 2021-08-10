

public class Main {

	public static void main(String[] args) {
		
		NhanVien nv[] = {
				new NhanVienBaoVe("Hau", "0213", 20, 5000,2,25, 200),
				new NhanVienKeToan("Trang", "0143", 20, 5000,2),
				new NhanVienKinhDoanh("Hien","0222",21, 4000,2, 10000,250),
				new GiamDoc("Huy","0886",30,"giamdoc123@")
		}; 
		for(NhanVien i:nv) {
			System.out.println(i.toString());
		}
		
		/*
		System.out.println("\n-----------Thong tin nhan vien bao ve :");
		for(NhanVien i:nv) {
			if(i instanceof NhanVienBaoVe) {
				((NhanVienBaoVe) i).showInfor();
			}
		}
		System.out.println("\n----------Thong tin nhan vien ke toan :");
		for(NhanVien i:nv) {
			if(i instanceof NhanVienKeToan) {
				((NhanVienKeToan) i).showInfor();
			}
		}
		System.out.println("\n----------Thong tin nhan vien kinh doanh :");
		for(NhanVien i:nv) {
			if(i instanceof NhanVienKinhDoanh) {
				((NhanVienKinhDoanh) i).showInfor();
			}
		}
		System.out.println("\n----------Thong tin Giam doc :");
		for(NhanVien i:nv) {
			if (i instanceof GiamDoc) {
				
				((GiamDoc) i).showInfor();
			}
		}
		*/
	}
	

}
