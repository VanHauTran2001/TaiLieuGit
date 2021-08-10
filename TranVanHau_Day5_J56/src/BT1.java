import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BT1 {

	public static void main(String[] args) {
		day();
	}

	private static void day() {
		Calendar calendar = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ngay , thang , nam sinh :");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		int daynow = calendar.get(Calendar.DAY_OF_MONTH);
		int monthnow = calendar.get(Calendar.MONTH);
		int yearnow = calendar.get(Calendar.YEAR);
		int tuoi = yearnow - year;
		
		if(daynow==day && (monthnow+1)==month) {
			System.out.println("Chuc mung sinh nhat !!!");
		}
		if(month>(monthnow+1) || month==(monthnow+1) && day > daynow ) {
			System.out.println("Tuoi hien tai la : "+(tuoi-1));
			calendar = Calendar.getInstance();
			int dayofyearnow = calendar.get(Calendar.DAY_OF_YEAR);
			calendar.set(yearnow,month-1,day); 
			int dayofyearSN = calendar.get(Calendar.DAY_OF_YEAR);
			int kq = dayofyearSN - dayofyearnow;
			System.out.println("So ngay con lai tu "+daynow+"/"+(monthnow+1)+"/"+yearnow + " den " +day +"/"+month+"/"+yearnow + " la :" +kq);
		}
		else if(month==(monthnow+1) && day == daynow ) {
			System.out.println("Tuoi hien tai la :"+tuoi);
			calendar = Calendar.getInstance();
			int dayofyearnow = calendar.get(Calendar.DAY_OF_YEAR);
			int max = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
			calendar.set(yearnow+1,month-1,day);
			int dayofyearSN = calendar.get(Calendar.DAY_OF_YEAR);
			int kq = dayofyearSN+max - dayofyearnow;
			System.out.println("So ngay con lai tu "+daynow+"/"+(monthnow+1)+"/"+yearnow + " den " +day +"/"+month+"/"+(yearnow+1) + " la :" + kq);

		}
		else {

			System.out.println("Tuoi hien tai la :"+(tuoi+1));
			calendar = Calendar.getInstance();
			int dayofyearnow = calendar.get(Calendar.DAY_OF_YEAR);
			int max = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
			calendar.set(yearnow+1,month-1,day);
			int dayofyearSN = calendar.get(Calendar.DAY_OF_YEAR);
			int kq = dayofyearSN+max - dayofyearnow;
			System.out.println("So ngay con lai tu "+daynow+"/"+(monthnow+1)+"/"+yearnow + " den " +day +"/"+month+"/"+(yearnow+1) + " la :" + kq);


		}
		
	}

}
