import java.util.Scanner;

public class GiaDinh {
	
	private String ten ;
	private int soDien;
	
	public GiaDinh() {
		
	}

	public GiaDinh(String ten, int soDien) {
		
		this.ten = ten;
		this.soDien = soDien;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSoDien() {
		return soDien;
	}

	public void setSoDien(int soDien) {
		this.soDien = soDien;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten chu ho :");
		ten = sc.nextLine();
		System.out.println("Nhap so dien :");
		soDien = sc.nextInt();
		sc.nextLine();
	}
	public float tiendien() {
		float thanhtien;
		if(soDien<=50) {
			thanhtien = (float)(soDien*1.678*1.1);
		}
		else if(soDien<=100) {
			thanhtien = (float)(((soDien-50)*1.734 + 50*1.678)*1.1);
		}
		else if(soDien<=200) {
			thanhtien = (float)(((soDien-100)*2.014 + 50*1.734 + 50*1.678)*1.1);
		}
		else if(soDien<=300) {
			thanhtien = (float)(((soDien-200)*2.536 + 100*2.014 + 50*1.734 + 50*1.678)*1.1);
		}
		else if(soDien<=400) {
			thanhtien = (float)(((soDien-300)*2.834 + 100*2.546 + 100*2.014 + 50*1.734 + 50*1.678)*1.1);
		
		}
		else {
			thanhtien = (float)(((soDien-400)*2.927+50*1.678+50*1.734+100*2.014+100*2.536+100*2.834)*1.1);
		}
		return thanhtien;
	}
	public void xuat() {
		System.out.printf("%15s %15d %15.3f \n",ten,soDien,tiendien());
	}
}
