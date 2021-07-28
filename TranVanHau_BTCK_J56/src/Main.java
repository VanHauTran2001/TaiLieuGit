import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		DataIO.Data();
		DataIO.dsSinhVien.size();
		System.out.println(DataIO.dsSinhVien.size());
		int chon;
		
			try {
				do {
					dsMenu();
					System.out.println("Nhap lua chon :");
					chon = sc.nextInt();
					switch (chon) {
					case 1: {
						capNhapDS();
						break;
					}
					case 2: {
						System.out.println(DataIO.dsSinhVien.size());
						DataIO.sapxepMaSV(DataIO.dsSinhVien);
						DataIO.hienThiBangDiem(DataIO.dsSinhVien,DataIO.dsMonHoc,DataIO.dsDiem);
						break;
					}
					case 3: {
						timKiem();
						break;
					}
					default:
						break;
					}
			}while(chon!=0);
			} catch (InputMismatchException e) {
				System.out.println("Chi duoc nhap so !!");
			}
			
	}

	private static void timKiem() {
		int chon;
		do {
			System.out.println("┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("│1.Tim kiem theo ten sinh vien  │ ");
			System.out.println("│2.Tim kiem theo ma sinh vien   │");
			System.out.println("│0.Thoat                        │");
			System.out.println("┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("Nhap lua chon :");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				DataIO.searchByName(DataIO.dsSinhVien);
				break;
			}
			case 2: {
				System.out.println("Nhap ma sv muon tim kiem :");
				String masv = sc.nextLine();
				DataIO.searchMaSV(masv);
				break;
			}
			default:
				break;
			}
		}while(chon!=0);
		
	}

	private static void capNhapDS() {
	
		int chon;
		do {
			System.out.println("┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("│1.Them sinh viên      	     │ ");
			System.out.println("│2.Sua thong tin sinh vien   │");
			System.out.println("│3.Xoa thong tin sinh vien   │");
			System.out.println("│4.Hien thi danh sach SV     │");
			System.out.println("│5.Hien thi danh sach MH     │");
			System.out.println("│0.Thoat	             │");
			System.out.println("┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("Nhap lua chon :");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				DataIO.ThemSV(DataIO.dsSinhVien);
				break;
			}
			case 2: {
				DataIO.suaTTSV();
				break;
			}
			case 3: {
				DataIO.XoaSV(DataIO.dsSinhVien);
				break;
			}
			case 4: {
				DataIO.sapxepTenSV(DataIO.dsSinhVien);
				DataIO.hienThiSV(DataIO.dsSinhVien);
				break;
			}
			case 5: {
				DataIO.sapxepTenMH(DataIO.dsMonHoc);
				DataIO.hienThiMH();
				break;
			}
			default:
				break;
			}
		}while(chon!=0);
	}

	private static void dsMenu() {
		System.out.println("┍━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("│1.Cap nhat danh sach  │ ");
		System.out.println("│2.Hien thi bang diem  │");
		System.out.println("│3.Tim kiem            │");
		System.out.println("│0.Thoat               │");
		System.out.println("┕━━━━━━━━━━━━━━━━━━━━━━┛");
		
	}

}
