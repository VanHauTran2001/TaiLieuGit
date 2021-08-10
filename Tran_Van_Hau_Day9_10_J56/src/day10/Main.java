 package day10;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap so luong phan tu trong mang :");
		int n = sc.nextInt();
		int[] a = new int[n];	
		LuongChan lc = new LuongChan(a);
		LuongLe ll = new LuongLe(a);
		
		lc.start();
		ll.start();
		try {
			Thread.sleep(50);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Mang Arr :");
		for(int i=0;i<n;i++) {
			System.out.println("Arr["+i+"] = " +a[i]);
		}

	}
		

}


