import java.util.Calendar;
import java.util.Date;

public class BT2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Cac thoi diem la thu sau ngay 13 tinh tu bay gio cho den het nam 2026 :");
		while(calendar.get(Calendar.YEAR)<=2026)
		{
			calendar.add(Calendar.DATE, 1);
			if(calendar.get(Calendar.DAY_OF_WEEK)==6 && calendar.get(Calendar.DAY_OF_MONTH) == 13)
			{	
				int day =  calendar.get(Calendar.DAY_OF_MONTH);
				int month = calendar.get(Calendar.MONTH);
				int year = calendar.get(Calendar.YEAR);
				System.out.format("\n%d/%d/%d",day,month +1,year );
			}
		}
	
	}
}