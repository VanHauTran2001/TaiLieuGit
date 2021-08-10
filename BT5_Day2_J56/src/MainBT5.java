import java.util.Scanner;

public class MainBT5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		
		sv.nhapsv();
		System.out.println("Nhap so luong mon hoc :");
		int n = sc.nextInt();
		sc.nextLine();
		SinhVien mh[] = new SinhVien[n];
		for(int i=0;i<n;i++) {
			System.out.println("Mon hoc thu "+(i+1));
			mh[i] = new SinhVien();
			mh[i].nhap();
		}
		float tong = 0;
		float tongdiem = 0;
		int tongheso = 0;
		float tbc = 0;
		for(int i=0;i<n;i++) {
			tongheso = tongheso + mh[i].getHeSoMH();
			tong = mh[i].getHeSoMH()*mh[i].getDiemMH();
			tongdiem = tongdiem + tong;
		}
		tbc = (float)tongdiem/tongheso;
		
		System.out.println(sv.toString());
		System.out.printf("%15s %15s %15s %15s \n","Ma MH","Ten MH","He So MH","Diem MH");
		for(int i=0;i<n;i++) {
			mh[i].xuat();
		}
		
		System.out.println("Diem trung binh cua sinh vien la :" + tbc);
	}

}
