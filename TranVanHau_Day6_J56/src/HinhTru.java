
public class HinhTru {
	float chieuCao , bkNgoai , bkTrong ;	
	static float klRieng ;
	
	public void hienthiHT() {
		float khoiLuong =  (float) ((Math.PI*Math.pow(bkNgoai,2)*chieuCao - Math.PI*Math.pow(bkTrong,2)*chieuCao)*klRieng);
		System.out.println("Chieu cao :" + chieuCao);
		System.out.println("Ban kinh ngoai :" + bkNgoai);
		System.out.println("Ban kinh trong :" + bkTrong);
		System.out.println("Khoi luong rieng :" + klRieng);
		System.out.println("Khoi luong = " + khoiLuong);
	}
}
