import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int n ;
		do {
			System.out.println("Nhap so ho gia dinh :");
			n = sc.nextInt();
			sc.nextLine();
		}
		while(n<10);
		
		GiaDinh a[] = new GiaDinh[n];
		for(int i=0;i<n;i++) {
			System.out.println("Ho gia dinh thu "+(i+1) + ":");
			a[i] = new GiaDinh();
			a[i].nhap();
		}
		do {
		System.out.println("\n --------------Menu-------------");
		System.out.println("Nhap cac lua chon :");
		System.out.println("1.Hien thi danh sach cac ho gia dinh !");
		System.out.println("2.Hien thi 3 ho gia dinh co so dien tieu thu nhieu nhat !");
		System.out.println("3.Hien thi cac ho gia dinh co ten 'Truong' ");
		System.out.println("4.Sap xep danh sach cac ho theo ten voi thu tu bang chu cai !");
		System.out.println("5.Sap xep danh sach cac ho gia dinh theo so dien tang dan !");
		System.out.println("0.Thoat chuong trinh !");
		
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			bai1(a,n);
			break;
		}
		case 2: {
			bai2(a,n);
			break;
		}
		case 3: {
			bai3(a,n);
			break;
		}
		case 4: {
			bai4(a,n);
			break;
		}
		case 5: {
			bai5(a,n);
			break;
		}
		case 0 :{
			break;
		}
		default:
			System.out.println("Khong hop le !");
			break;
		}
		}while(flag);
	}

	private static void bai5(GiaDinh[] a, int n) {
		System.out.println("\nDanh sach cac ho gia dinh tang dan theo so dien :");

		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i].getSoDien() > a[j].getSoDien()) {
					GiaDinh tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.printf("%15s %15s %15s \n","Ten Chu Ho","So Dien","Thanh Tien");
		for(int i=0;i<n;i++) {
			a[i].xuat();
		}
		
	}

	private static void bai4(GiaDinh[] a, int n) {
		System.out.println("Sap xep ten cac ho gia dinh theo thu bang chu cai :");
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i].getTen().compareTo(a[j].getTen())>0) {
					GiaDinh tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.printf("%15s %15s %15s \n","Ten Chu Ho","So Dien","Thanh Tien");
		for(int i=0;i<n;i++) {
			a[i].xuat();
		}
		
	}

	private static void bai3(GiaDinh[] a, int n) {
		System.out.println("Danh sach cac ho gia dinh co ten Truong :");
		System.out.printf("%15s %15s %15s \n","Ten Chu Ho","So Dien","Thanh Tien");
		for(int i=0;i<n;i++) {
			if(a[i].getTen().equals("Truong")) {
				a[i].xuat();
			}
		}
			
		
	}

	private static void bai1(GiaDinh[] a, int n) {
		System.out.printf("%15s %15s %15s \n","Ten Chu Ho","So Dien","Thanh Tien");
		for(int i=0;i<n;i++) {
			a[i].xuat();
		}
		
	}

	private static void bai2(GiaDinh a[] , int n) {
		//Cach 1 :
		/*
		int max=0;
		System.out.println("Danh sach 3 ho gia dinh tieu thu dien nhieu nhat :");
		for(int i=0;i<n;i++) {
			if(a[i].getSoDien()>max) {
				max =  a[i].getSoDien();
			}
			
		}
		System.out.printf("%15s %15s %15s \n","Ten Chu Ho","So Dien","Thanh Tien");
		for(int i=0;i<n;i++) {
			if(a[i].getSoDien()==max) {
				a[i].xuat();
			}
		}
		int max2 = 0;
		for(int i=0;i<n;i++) {
			if(a[i].getSoDien()>max2 && a[i].getSoDien()<max) {
				max2 = a[i].getSoDien();
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i].getSoDien()==max2) {
				a[i].xuat();
			}
		}
		int max3 = 0;
		for(int i=0;i<n;i++) {
			if(a[i].getSoDien()>max3 && a[i].getSoDien()<max2) {
				max3 = a[i].getSoDien();
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i].getSoDien()==max3) {
				a[i].xuat();
			}
		}
		*/
		//Cach 2 :
		System.out.println("Danh sach 3 ho gia dinh tieu thu dien nhieu nhat :");
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i].getSoDien() < a[j].getSoDien()) {
					GiaDinh tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.printf("%15s %15s %15s \n","Ten Chu Ho","So Dien","Thanh Tien");
		for(int i=0;i<3;i++) {
			a[i].xuat();
		}
		
	}

}
