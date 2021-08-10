package day9;

import java.util.Scanner;
public class SinhVien {
		String maSV , hoTen;
		int tuoi;
		double diemTK;
		
		public SinhVien(String maSV, String hoTen, int tuoi, double diemTK) {
			this.maSV = maSV;
			this.hoTen = hoTen;
			this.tuoi = tuoi;
			this.diemTK = diemTK;
		}

		public SinhVien() {
			
		}

		public String getMaSV() {
			return maSV;
		}

		public void setMaSV(String maSV) {
			this.maSV = maSV;
		}

		public String getHoTen() {
			return hoTen;
		}

		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}

		public int getTuoi() {
			return tuoi;
		}

		public void setTuoi(int tuoi) {
			this.tuoi = tuoi;
		}

		public double getDiemTK() {
			return diemTK;
		}

		public void setDiemTK(double diemTK) {
			this.diemTK = diemTK;
		}

		public void NhapTTSV() throws Exception {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Nhap ma sv :");
			maSV = sc.nextLine();
			int doDai = maSV.length();
			if(doDai!=6) {
				
					Exception maSVKDung = new Exception("Ma sv nhap vao khong dung");
					throw maSVKDung;
			}
			char[] p1 = maSV.toCharArray();
			int kt=1;
			for(int i=0;i<p1.length;i++) {
				if(!(p1[i] >=48 && p1[i]<= 57)) {
					kt = 0;
					break;
				}
			}
			if(kt==0) {
				Exception maSVSai = new Exception("Ma sv nhap vao khong dung");
				throw maSVSai;
			}
			System.out.println("Nhap ho ten :");
			hoTen = sc.nextLine();
			int doDaiTen = hoTen.length();
			if(doDaiTen<3) {
					Exception hoTenKDung = new Exception("Ho ten nhap vao khong dung");
					throw hoTenKDung;
			}
			char[] p2 = hoTen.toCharArray();
			int ktr =1;
			for(int i=0;i<p2.length;i++) {
				if(p2[i]>=33 && p2[i]<=47) {
					ktr=0;
					break;
				}
			}
			if(ktr==0) {
				Exception hoTenSai = new Exception("Ho ten khong duoc chua ki tu dac biet");
				throw hoTenSai;
			}
			System.out.println("Nhap tuoi :");
			tuoi = sc.nextInt();
			if(tuoi<=15) {
				Exception tuoiKDung = new Exception("Tuoi nhap khong dung ");
				throw tuoiKDung;
			}
			System.out.println("Nhap diem tong ket :");
			diemTK = sc.nextDouble();
			if(diemTK<0 || diemTK>10) {
				Exception diemKDung = new Exception("Diem tk nhap khong dung");
				throw diemKDung;
			}
	
		}	
	}


