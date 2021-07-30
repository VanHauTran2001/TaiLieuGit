
public class HSKhoiB extends HocSinh{
	public static final String MonToan = "Toan";
	public static final String MonSinh = "Sinh";
	public static final String MonHoa = "Hoa";
	
	public HSKhoiB(String sbd , String hoten , String diachi , String uutien) {
		super(sbd,hoten,diachi,uutien);
	}
	public String toString() {
	return "HS KHOI B : \n " + "\t SBD = " + sbd +"\t HOTEN = " + hoten  +"\t DIACHI = " + diachi + "\t UUTIEN = " + uutien +
								"\t MONTHI :" + MonToan  + "-" + MonHoa + "-" +MonSinh;
	}
	

}
