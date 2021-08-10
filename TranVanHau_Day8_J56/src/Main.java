import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		ArrayList<HinhHCN> hinhHCN = new ArrayList<HinhHCN>();
		
		for(int i=0;i<1000;i++) {
			HinhHCN hhcn = new HinhHCN(ThreadLocalRandom.current().nextInt(0,101),ThreadLocalRandom.current().nextInt(0,101),ThreadLocalRandom.current().nextInt(0,101));
			hinhHCN.add(hhcn);
		}
		dsRandum(hinhHCN);
		sapxep(hinhHCN);
		dsLoc(hinhHCN);
	}

	private static void dsLoc(ArrayList<HinhHCN> hinhHCN) {
		Predicate<HinhHCN> predicate = new Predicate<HinhHCN>() {
			@Override
			public boolean test(HinhHCN t) {
				
				return t.getChieuCao()<10;
			}
		};
		hinhHCN.removeIf(predicate);
		System.out.println("\nDanh sach sau khi loc :");
		System.out.printf("%15s %15s %15s \n","Chieu dai","Chieu rong","Chieu cao");
		for (HinhHCN hinhHCN2 : hinhHCN) {
			hinhHCN2.showInfo();
		}

	}

	private static void sapxep(ArrayList<HinhHCN> hinhHCN) {
		Collections.sort(hinhHCN, new Comparator<HinhHCN>() {

			@Override
			public int compare(HinhHCN o1, HinhHCN o2) {
				
				return o1.theTich()>o2.theTich() ? 1 : -1; //Sắp xếp tăng
				
			   // return o1.theTich()>o2.theTich() ? -1 : 1; // Sắp xếp giảm
			}

//			@Override
//			public int compare(HinhHCN o1, HinhHCN o2) {
//				
//				if(o1.theTich()>o2.theTich()) {
//					return 1;
//				}
//				else if(o1.theTich()==o2.theTich()) {
//					return 0;
//				}
//				else {
//					return -1;
//				}
//			}
		
		});
	System.out.println("\nDanh sach sau khi sap xep tang dan theo the tich : ");
	System.out.printf("%15s %15s %15s %15s %15s\n","Chieu dai","Chieu rong","Chieu cao","Dien Tich","The Tich");
			for (HinhHCN hinhHCN2 : hinhHCN) {
				hinhHCN2.showFull();
			}

	}

	private static void dsRandum(ArrayList<HinhHCN> hinhHCN) {
		System.out.println("\nDanh sach random :");
		System.out.printf("%15s %15s %15s \n","Chieu dai","Chieu rong","Chieu cao");
		for (HinhHCN hinhHCN2 : hinhHCN) {
			hinhHCN2.showInfo();
		}
		
	}

}
