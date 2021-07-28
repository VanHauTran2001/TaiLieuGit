import java.util.ArrayList;
import java.util.Scanner;

public class GioHang {
		private String id , id_KhachHang;
		private ArrayList<String> id_Hang = new ArrayList<String>();
		private ArrayList<Integer> soluong = new ArrayList<Integer>();
		private int tien;
		
		public GioHang() {
			
		}

		public GioHang(String id, String id_KhachHang, ArrayList<String> id_Hang, ArrayList<Integer> soluong,
				int tien) {
			
			this.id = id;
			this.id_KhachHang = id_KhachHang;
			this.id_Hang = id_Hang;
			this.soluong = soluong;
			this.tien = tien;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getId_KhachHang() {
			return id_KhachHang;
		}

		public void setId_KhachHang(String id_KhachHang) {
			this.id_KhachHang = id_KhachHang;
		}

		public ArrayList<String> getId_Hang() {
			return id_Hang;
		}

		public void setId_Hang(ArrayList<String> id_Hang) {
			this.id_Hang = id_Hang;
		}

		public ArrayList<Integer> getSoluong() {
			return soluong;
		}

		public void setSoluong(ArrayList<Integer> soluong) {
			this.soluong = soluong;
		}

		public int getTien() {
			return tien;
		}

		public void setTien(int tien) {
			this.tien = tien;
		}
		
		public void input() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap id gioi hang :");
			id = sc.nextLine();
			System.out.println("Nhap id khach hang :");
			id_KhachHang = sc.nextLine();
			int chon;
			do {
				System.out.println("Co them hang vao gio khong ?");
				System.out.println("\t1.Co");
				System.out.println("\t0.Khong");
				chon = sc.nextInt();
				switch (chon) {
				case 1: {
					System.out.println("----------Nhap hang vao gio-----------");
					System.out.println("Nhap ID Hang :");
					String tmpid = sc.nextLine();
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + chon);
				}
			}while(chon!=0);
		}
		
}
