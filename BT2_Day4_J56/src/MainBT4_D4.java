import java.util.Scanner;

public class MainBT4_D4 {
	
	public static void main(String[] args) {
		boolean flag = true;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap so luong van dong vien :");
			int n = sc.nextInt();
			sc.nextLine();
			VanDongVien a[] = new VanDongVien[n];
			for(int i=0;i<n;i++) {
				System.out.println("Van dong vien thu " + (i+1)+" : ");
				a[i] = new VanDongVien();
				a[i].nhap();
			}
			do {
				System.out.println("\n-------------------------------------Menu------------------------------------------");
				System.out.println("   Nhap lua chon cua ban !! ");
				System.out.println("   1.Hien thi danh sach van dong vien ! ");
				System.out.println("   2.Hien thi van dong vien co tong thanh tich cao nhat ! ");
				System.out.println("   3.Hien thi 3 van dong vien co tong thanh tich cao nhat ! ");
				System.out.println("   4.Sap xep danh sach van dong vien theo ten ! ");
				System.out.println("   5.Hien thi danh sach van dong vien co ten bat dau bang 'T' ");
				System.out.println("   6.Hien thi danh sach van dong vien ten co van 'an' ");
				System.out.println("   7.Sap xep danh sach van dong vien theo chieu dai cua ten tang dan !	");
				System.out.println("   8.Hien thi danh sach van dong vien co cung tong thanh tich va xep thu 2 ! ");
				System.out.println("   9.Hien thi danh sach van dong vien thanh tich thu 3 thap nhat !	");
				System.out.println("   10.Hien thi danh sach van dong vien co thanh tich lan 1 cao nhat ! ");
				System.out.println("--------------------------------------------------------------------------------------");
				int key = sc.nextInt();
				switch (key) {
				case 1: {
					System.out.println("\nDanh sach cac van dong vien :");
					System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
					for(int i=0;i<n;i++) {
						a[i].xuat();
					}
					break;
				}
				case 2: {
					System.out.println("\nDanh sach van dong vien co tong thanh tich cao nhat :");
					int max = 0;
					for(int i=0;i<n;i++) {
						if(a[i].tongtt()>max) {
							max = a[i].tongtt();
						}
					}
					System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
					for(int i=0;i<n;i++) {
						if(a[i].tongtt()==max) {
							a[i].xuat();
						}
					}
					break;
				}
				case 3: {
					System.out.println("\n3 van dong vien co tong thanh tich cao nhat ! ");					
					for(int i=0;i<n-1;i++) {
						for(int j=n-1;j>i;j--) {
							if(a[j].tongtt()>a[j-1].tongtt()) {
								VanDongVien tam = a[j];
								a[j] = a[j-1];
								a[j-1] = tam;
							}
						}
					}
					System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
					for(int i=0;i<3;i++) {
						a[i].xuat();
					}
					break;
				}
				case 4: {
					System.out.println("\nDanh sach van dong vien sap xep ten theo bang chu cai :");
					for(int i=0;i<n-1;i++) {
						for(int j=i+1;j<n;j++) {
							if(a[i].getTen().compareTo(a[j].getTen())>0) {
								VanDongVien tmp = a[i];
								a[i] = a[j];
								a[j] = tmp;
							}
						}
					}
					System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
					for(int i=0;i<n;i++) {
						a[i].xuat();
					}
					break;
				}
				case 5: {
					System.out.println("\nDanh sach van dong vien co ten bat dau bang 'T' :");
					System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
					
					//Co the dung startWith
					for(int i=0;i<n;i++) {
						if(a[i].getTen().indexOf('T')==0) {
							a[i].xuat();
						}
					}
					break;
				}
				case 6: {
					System.out.println("Danh sach van dong vien co van 'an' :");
					System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
					
					for(int i=0;i<n;i++) {
						char c;
						char d;
						for(int j=0;j<a[i].getTen().length()-1;j++) {
							c = a[i].getTen().charAt(j);
							d = a[i].getTen().charAt(j+1);
							if(c=='a'&& d=='n') {
								a[i].xuat();
							}
						}
					}
										
					break;
				}
				case 7: {
					System.out.println("Sap xep danh sach van dong vien theo chieu dai cua ten tang dan :");
					for(int i=0;i<n-1;i++) {
						for(int j=i+1;j<n;j++) {
							if(a[i].getTen().length() > a[j].getTen().length()) {
								VanDongVien tmp = a[i];
								a[i] = a[j];
								a[j] = tmp;
							}
						}
					}
					System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
					for(int i=0;i<n;i++) {
						a[i].xuat();
					}
					break;
				}
				case 8: {
					System.out.println("Danh sach van dong vien co cung tong thanh tich va xep thu 2 :");
						System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
						int max1=0;
						for(int i=0;i<n;i++) {
							if(a[i].tongtt()>max1) {
								max1 = a[i].tongtt();
							}
						}
						int max2=0;
						for(int i=0;i<n;i++) {
							if(a[i].tongtt()>max2 && a[i].tongtt()<max1) {
								max2 = a[i].tongtt();
							}
						}
						for(int i=0;i<n;i++) {
							if(a[i].tongtt()==max2) {
								a[i].xuat();
							}
						}
					break;
				}
				case 9: {
					System.out.println("Danh sach van dong vien thanh tich thu 3 thap nhat :");
					for(int i=0;i<n-1;i++) {
						for(int j=i+1;j<n;j++) {
							if(a[i].getThanhtich3() > a[j].getThanhtich3()) {
								VanDongVien tmp = a[i];
								a[i] = a[j];
								a[j] = tmp;
							}
						}
					}
					System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
					for(int i=0;i<1;i++) {
							a[i].xuat();
					}
					break;
				}
				case 10: {
					System.out.println("Danh sach van dong vien thanh tich thu 1 cao nhat :");
					int maxvalue = 0;
					for(int i=0;i<n;i++) {
						if(a[i].getThanhtich1() > maxvalue) {
							maxvalue = a[i].getThanhtich1();
						}
					}
					System.out.printf("%15s %15s %15s %15s %15s\n","Ten VDV","Thanh Tich 1","Thanh Tich 2","Thanh Tich 3","Tong Thanh Tich");
					for(int i=0;i<n;i++) {
						if(a[i].getThanhtich1()==maxvalue) {
							a[i].xuat();
						}
					}
					break;
				}
				default:
					System.out.println("Khong hop le! Nhap lai!!!!");
					break;
				}
			}
			while(flag);
			
	}

	
	
}
