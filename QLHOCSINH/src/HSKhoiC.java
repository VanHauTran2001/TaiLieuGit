
public class HSKhoiC extends HocSinh{
	public static final String MonVan = "Van";
	public static final String MonSu = "Su";
	public static final String MonDia = "Dia";
	
	public HSKhoiC(String sbd , String hoten , String diachi , String uutien) {
		super(sbd,hoten,diachi,uutien);
	}
	public String toString() {
	return "HS KHOI C : \n " + "\t SBD = " + sbd +"\t HOTEN = " + hoten  +"\t DIACHI = " + diachi + "\t UUTIEN = " + uutien +
								"\t MONTHI :" + MonVan + "-" + MonSu + "-" + MonDia;
	}
	

}
