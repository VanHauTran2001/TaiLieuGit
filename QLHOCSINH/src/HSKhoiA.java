
public class HSKhoiA extends HocSinh {
		public static final String MonToan = "Toan";
		public static final String MonLy = "Ly";
		public static final String MonHoa = "Hoa";
		
		public HSKhoiA(String sbd , String hoten , String diachi , String uutien) {
			super(sbd,hoten,diachi,uutien);
		}
		public String toString() {
		return "HS KHOI A : \n " + "\t SBD = " + sbd +"\t HOTEN = " + hoten  +"\t DIACHI = " + diachi + "\t UUTIEN = " + uutien +
									"\t MONTHI :" + MonToan + "-" + MonLy + "-" + MonHoa;
		}
		

}
