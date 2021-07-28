import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DataIO {
		public static ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
		public static ArrayList<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
		public static ArrayList<Diem> dsDiem = new ArrayList<Diem>();
		public static Scanner sc = new Scanner(System.in);
		public static String root = "E:\\DSSV";
		public static final String fileSinhVien = "sinhvien.txt";
		public static final String fileDiem = "diem.txt";
		public static final String fileMonHoc = "monhoc.txt";
		
		public static void Data() {
			dataSinhVien();
			dataMonHoc();
			dataDiem();
		}

		private static void dataDiem() {
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			File file = new File(root+"/" +fileDiem);
			try {
				fileReader = new FileReader(file);
				bufferedReader = new BufferedReader(fileReader);
				String line;
				while((line = bufferedReader.readLine()) != null) {
					if(line.startsWith("#")) continue;
					String part[] = line.split(";");
					String maSV = part[0];
					String maMH = part[1];
					Float diem = Float.parseFloat(part[2]);
					Diem d = new Diem(maSV, maMH, diem);
					dsDiem.add(d);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(fileReader != null) fileReader.close();
					if(bufferedReader != null) bufferedReader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}

		private static void dataMonHoc() {
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			File file = new File(root+"/"+fileMonHoc);
			try {
				fileReader = new FileReader(file);
				bufferedReader = new BufferedReader(fileReader);
				String line;
				while((line = bufferedReader.readLine()) != null) {
					if(line.startsWith("#")) continue;
					String part[] = line.split(";");
					String maMH = part[0];
					String tenMH = part[1];
					Float heSoMon = Float.parseFloat(part[2]);
					MonHoc mh = new MonHoc(maMH, tenMH, heSoMon);
					dsMonHoc.add(mh);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(fileReader != null) fileReader.close();
					if(bufferedReader != null) bufferedReader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}

		private static void dataSinhVien() {
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			File file = new File(root+"/"+fileSinhVien);
			try {
				fileReader = new FileReader(file);
				bufferedReader = new BufferedReader(fileReader);
				String line;
				while((line = bufferedReader.readLine()) != null) {
					if(line.startsWith("#")) continue;
					String part[] = line.split(";");
					String maSV = part[0];
					String hoDem = part[1];
					String ten = part[2];
					String ngaySinh = part[3];
					String gioiTinh = part[4];
					SinhVien sv = new SinhVien(maSV,hoDem,ten,ngaySinh,gioiTinh);
					dsSinhVien.add(sv);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(fileReader !=null) fileReader.close();
					if(bufferedReader != null) bufferedReader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
		public static void ThemSV(ArrayList<SinhVien> listSV) {
			
			String x;
			do {
				System.out.println("Nhap thong tin sinh vien theo dang :\r\n"
						+ "[Ho dem];[Ten];[NgaySinh];[GioiTinh]\r\n"
						+ "Nhap exit de quay lai !");
				System.out.println("Nhap :");
				x = sc.nextLine();
				if(x.equals("exit")) continue;
				String part[] = x.split(";");
				String hoDem = part[0];
				String ten = part[1];
				String ngaySinh = part[2];
				String gioiTinh = part[3];
				String maSV = listSV.get(listSV.size()-1).getMaSV();
				String m = maSV.substring(2);
				int newMS = Integer.parseInt(m)+1;
				String newMaSo = Integer.toString(newMS);
				String newMaSV = "SV0"+newMaSo;
				System.out.println("Them sinh vien vao danh sach thanh cong ");
				System.out.println("[" + newMaSV + "\t" + hoDem + " "+ ten +"\t" + ngaySinh +"\t"+ gioiTinh +"]");
				SinhVien newsv = new SinhVien(newMaSV, hoDem, ten, ngaySinh, gioiTinh);
				dsSinhVien.add(newsv);
				
				FileWriter fileWriter = null;
				BufferedWriter bufferedWriter = null;
				try {
					File file = new File(root+"/"+fileSinhVien);
					fileWriter = new FileWriter(file);
					bufferedWriter = new BufferedWriter(fileWriter);
					bufferedWriter.write("#ma sv;ho dem;ten;ngay sinh;gioi tinh");
					for (SinhVien sv : listSV) {
						String ds = sv.getMaSV()+";"+sv.getHoDem()+";"+sv.getTen()+";"+sv.getNgaySinh()+";"+sv.getGioiTinh();
						bufferedWriter.newLine();
						bufferedWriter.write(ds);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(bufferedWriter != null) bufferedWriter.close();
						if(fileWriter != null) fileWriter.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			}while(!x.equals("exit"));
		}
		
		public static void suaTTSV() {
			System.out.println("Nhap ma sv muon sua :");
			String maSVSua = sc.nextLine();
			for(int i=0;i<dsSinhVien.size();i++) {
				SinhVien sinhVien = dsSinhVien.get(i);
				if(sinhVien.getMaSV().equals(maSVSua)) {
					System.out.println("Da tim thay sinh vien :");
					System.out.format("[%s %s %s %s %s ]\n",sinhVien.getMaSV(),sinhVien.getHoDem(),sinhVien.getTen(),sinhVien.getNgaySinh(),sinhVien.getGioiTinh());
					System.out.println("---------------------------------------------");
					System.out.println("Nhap lai thong tin sinh vien theo dang :");
					System.out.println("[hodem];[ten];[ngaysinh];[gioitinh]");
					System.out.println("Neu khong sua thi bo trong !");
					System.out.println("Vi du :Tran Van;Hau;;Nam");
					System.out.println("Nhap :");
					String line = sc.nextLine();
					String part[] = line.split(";");
					String hoDem = null , ten = null , ngaySinh = null , gioiTinh = null;
					if(part.length>=1)
						hoDem = part[0];
					if(part.length>=2)
						ten = part[1];
					if(part.length>=3)
						ngaySinh = part[2];
					if(part.length>=4)
						gioiTinh = part[3];
					if(hoDem != null && !hoDem.isEmpty())
						sinhVien.setHoDem(hoDem);
					if(ten != null && !ten.isEmpty())
						sinhVien.setTen(ten);
					if(ngaySinh != null && !ngaySinh.isEmpty())
						sinhVien.setNgaySinh(ngaySinh);
					if(gioiTinh != null && !gioiTinh.isEmpty())
						sinhVien.setGioiTinh(gioiTinh);
					System.out.println("Sua thanh cong !");
					break;
				}
				if(i == dsSinhVien.size()-1)
					System.out.println("Khong tim thay sinh vien ");
			}
			File file = new File(root+"/"+fileSinhVien);
			FileWriter  fileWriter= null;
			BufferedWriter bufferedWriter = null;
			try {
				fileWriter = new FileWriter(file);
				bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write("#ma sv;ho dem;ten;ngay sinh;gioi tinh");
				for (SinhVien sv : dsSinhVien) {
					String dsSV = sv.getMaSV()+";"+sv.getHoDem()+";"+sv.getTen()+";"+sv.getNgaySinh()+";"+sv.getGioiTinh();
					bufferedWriter.newLine();
					bufferedWriter.write(dsSV);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(bufferedWriter != null) bufferedWriter.close();
					if(fileWriter != null) fileWriter.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		public static void XoaSV(ArrayList<SinhVien> list) {
			System.out.println("Nhap ma sv muon xoa :");
			String ma = sc.nextLine();
			SinhVien sv = null;
			for (SinhVien sinhVien : list) {
				if(sinhVien.getMaSV().equals(ma)) {
					sv = sinhVien;
					break;
				}
			}
			if(sv != null) {
				boolean coDiem = false;
				for (Diem diem : dsDiem) {
					if(diem.getMaSV().equals(sv.getMaSV())) {
						coDiem = true;
						break;
					}
				}
				if(!coDiem) {
					System.out.println("Tim thay sinh vien :");
					System.out.println("["+sv.getMaSV()+"\t"+sv.getHoDem()+"\t"+sv.getTen()+"\t"+sv.getNgaySinh()+"\t"+sv.getGioiTinh()+"]");
					list.remove(sv);
					System.out.println("Xoa thanh cong !!");
					
				}else {
					System.out.println("Tim thay sinh vien :");
					System.out.println("["+sv.getMaSV()+"\t"+sv.getHoDem()+"\t"+sv.getTen()+"\t"+sv.getNgaySinh()+"\t"+sv.getGioiTinh()+"]");
					System.out.println("Sinh vien da co diem , khong the xoa !");
					
				}
			}else {
				System.out.println("Khong tim thay sinh vien nao !!");
			}
			FileWriter fileWriter = null;
			BufferedWriter bufferedWriter = null;
			try {
				File file = new File(root+"/"+fileSinhVien);
				fileWriter = new FileWriter(file);
				bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write("#ma sv;ho dem;ten;ngay sinh;gioi tinh");
				for (SinhVien sinhVien : dsSinhVien) {
					String line = sinhVien.getMaSV()+";"+sinhVien.getHoDem()+";"+sinhVien.getTen()+";"+sinhVien.getNgaySinh()+";"+sinhVien.getGioiTinh();
					bufferedWriter.newLine();
					bufferedWriter.write(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(bufferedWriter != null) bufferedWriter.close();
					if(fileWriter != null) fileWriter.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		public static void hienThiSV(ArrayList<SinhVien> list) {
			int trang =1;
			int tongTrang;
			int chon;
			if(list.size()%30!=0) {
				tongTrang = list.size()/30 + 1;
			}
			else {
				tongTrang = list.size()/30;
			}
			do {
				System.out.println("====================== Danh Sach Sinh Vien ======================================");
				System.out.println("----------------------trang : "+ (trang)+"/"+tongTrang+"-------------------------");
				
				System.out.println("┏━━━━━━━━━━┳━━━━━━━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━━━┳━━━━━━━━━━━━━┳━━━━━━━━━━┓");
				System.out.format("┃ %-9s┃ %-21s┃ %-13s┃ %-9s   ┃ %-9s┃\n","MaSV","Ho Dem","Ten","Ngay sinh","Gioi Tinh");
				System.out.println("┣━━━━━━━━━━╋━━━━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━━━━━╋━━━━━━━━━━━━━╋━━━━━━━━━━┫");
				for(int i=(trang-1)*30;i<trang*30;i++) {
					if(i>list.size()-1) {
						break;
					}
					SinhVien sv = list.get(i);
					
					System.out.format("┃ %-9s┃ %-21s┃ %-13s┃ %-9s  ┃ %-9s┃\n",sv.getMaSV(),sv.getHoDem(),sv.getTen(),sv.getNgaySinh(),sv.getGioiTinh());
					
				}
				System.out.println("┗━━━━━━━━━━┻━━━━━━━━━━━━━━━━━━━━━━┻━━━━━━━━━━━━━━┻━━━━━━━━━━━━━┻━━━━━━━━━━┛");
				
				System.out.println("1.Xem trang tiep theo \t  2.Tro lai trang truoc \t  3.Den trang cuoi");
				System.out.println("3.Xem trang dau tien  \t  5.Xem trang cu the    \t  0.Tro ve menu truoc");
				System.out.println("Nhap lua chon :");
				chon = sc.nextInt();
				switch (chon) {
				case 1: {
					trang++;
					System.out.println(trang);
					break;
				}
				case 2: {
					trang--;
					break;
				}
				case 3: {
					trang = tongTrang;
					break;
				}
				case 4: {
					trang =1;
					break;
				}
				case 5: {
					System.out.println("Nhap vao trang ban muon xem :");
					int t = sc.nextInt();
					
					trang = t;
					break;
				}
				default:
					break;
				}
			}while(chon!=0);
		}
		
		public static void sapxepTenSV(ArrayList<SinhVien> list) {
			Collections.sort(list,new Comparator<SinhVien>() {
				@Override
				public int compare(SinhVien o1, SinhVien o2) {
					
					return o1.getTen().compareTo(o2.getTen());
				}
			});
		}
		
		public static void hienThiMH() {
			int trang=1;
			int chon;
			int tongTrang;
			if(dsMonHoc.size()%30!=0) {
				tongTrang = dsMonHoc.size()/30+1;
			}else {
				tongTrang = dsMonHoc.size()/30;
			}
			System.out.println("======================= Danh Sach Mon Hoc ==================================");
			System.out.println("-----------------trang : "+ (trang)+"/"+tongTrang+"-------------------------");
			
			
			System.out.println("┏━━━━━━━━━━┳━━━━━━━━━━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━━━┓");
			System.out.format("┃ %-9s┃ %-24s┃ %-13s┃\n","MaMH","Ten Mon","He so Mon");
			System.out.println("┣━━━━━━━━━━╋━━━━━━━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━━━━━┫");
			for(int i=(trang-1)*30;i<trang*30;i++) {
				if(i>dsMonHoc.size()-1) {
					break;
				}
			MonHoc mh = dsMonHoc.get(i);
			System.out.format("┃ %-9s┃ %-24s┃ %-13s┃\n",mh.getMaMH(),mh.getTenMH(),mh.getHeSoMon());
			}
			System.out.println("┗━━━━━━━━━━┻━━━━━━━━━━━━━━━━━━━━━━━━━┻━━━━━━━━━━━━━━┛");
			
		}
		public static void sapxepTenMH(ArrayList<MonHoc> list) {
			Collections.sort(list, new Comparator<MonHoc>() {

				@Override
				public int compare(MonHoc o1, MonHoc o2) {
					
					return o1.getTenMH().compareTo(o2.getTenMH());
				}
			});
		}
		
		public static void hienThiBangDiem(ArrayList<SinhVien> listSV , ArrayList<MonHoc> listMH , ArrayList<Diem> listDiem) {
			String maSv;
			int trang=1;
			int chon;
			int tongTrang;
			if(listSV.size()%30!=0) {
				tongTrang = listSV.size()/30+1;
			}
			else {
				tongTrang = listSV.size()/30;
			}
			do {
				System.out.println("====================== Bang Diem =========================================");
				System.out.println("-----------------trang : "+ trang+"/"+tongTrang + "-------------------------");
				for(int i=(trang-1)*30;i<trang*30;i++) {
					if(i>listSV.size()-1) {
						break;
					}
					SinhVien sv = listSV.get(i);
					String maSV = listSV.get(i).getMaSV();
					maSv = sv.getMaSV();
					ArrayList<Diem> bangDiem = new ArrayList<Diem>();
					ArrayList<MonHoc> monHoc = new ArrayList<MonHoc>();
					for (Diem d : listDiem) {
						if(d.getMaSV().equals(maSv)) {
							bangDiem.add(d);
						}
					}
					for (Diem d : bangDiem) {
						for (MonHoc mh : listMH) {
							if(mh.getMaMH().equals(d.getMaMH())) {
								monHoc.add(mh);
							}
							
						}
					}
					float diem = 0f;
					float hs = 0f;
					float dtk = 0f;
					if(monHoc.size()!=0) {
						for(int k=0;k<monHoc.size();k++) {
							diem += bangDiem.get(k).getDiem()*monHoc.get(k).getHeSoMon();
							hs += monHoc.get(k).getHeSoMon();
						}
						dtk = (float)diem/hs;
					}
					System.out.println("┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.format("┃%-7s %33s ┃\n",sv.getMaSV(),sv.getHoDem()+" "+sv.getTen());
					System.out.format("┃DTK : %32.2f    ┃\n",dtk);
					System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
					if(monHoc.size()!=0) {
						for(int k=0;k<monHoc.size();k++) {
							System.out.format("┃ %s %27s  %4.2f    ┃\n",monHoc.get(k).getMaMH(),monHoc.get(k).getTenMH(),bangDiem.get(k).getDiem());
							
						}
					}else {
						System.out.format("┃%41s ┃\n","Khong co diem nao");
					}
					System.out.println("┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				}
				System.out.println("1.Xem trang tiep theo \t 2.Tro lai trang truoc \t  3.Den trang cuoi ");
				System.out.println("4.Xem trang dau tien  \t 5.Xem trang cu the    \t  0.Tro ve menu truoc ");
				System.out.println("Nhap lua chon :");
				chon = sc.nextInt();
				switch (chon){
				case 1: {
					trang++;
					break;
				}
				case 2: {
					trang--;
					break;
				}
				case 3: {
					trang = tongTrang;
					break;
				}
				case 4: {
					trang=1;
					break;
				}
				case 5: {
					System.out.println("Nhap trang muon xem :");
					int tr = sc.nextInt();
					trang = tr;
					break;
				}
				default:
					break;
				}
			}while(chon!=0);
		}
		public static void sapxepMaSV(ArrayList<SinhVien> list) {
			Collections.sort(list, new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien o1, SinhVien o2) {
					
					return o1.getMaSV().compareTo(o2.getMaSV());
				}
			});
		}
		public static void searchMaSV(String maSV) {
			ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
			for (SinhVien sinhVien :dsSinhVien) {
				if(sinhVien.getMaSV().equals(maSV)) {
					dsSV.add(sinhVien);
				}
			}
			if(dsSV.size()>0) {
				hienThiBangDiem(dsSV, dsMonHoc, dsDiem);
			}
			else {
				System.out.println("Khong tim thay sinh vien co ma [" + maSV +"]");
			}
		}
		public static void searchByName(ArrayList<SinhVien> listSV) {
			ArrayList<SinhVien> dsTK = new ArrayList<SinhVien>();
			System.out.println("Nhap ten sinh vien ");
			String tenSV = sc.nextLine();
			for (SinhVien sinhVien : listSV) {
				String name = sinhVien.getTen().toLowerCase();
				String num = tenSV.toLowerCase();
				if(name.equals(num)) {
					dsTK.add(sinhVien);
				}
			}
			if(dsTK.size()>0) {
				hienThiSV(dsTK);
			}else {
				System.out.println("Khong tim thay sinh vien co ten ["+tenSV+"]");
			}
		}
}
