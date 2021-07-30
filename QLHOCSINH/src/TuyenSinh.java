import java.util.ArrayList;
import java.util.List;
public class TuyenSinh {
		List<HocSinh> hs;
		
		public TuyenSinh() {
			this.hs = new ArrayList<>();
		}
		public void addhocsinh(HocSinh a) {
			this.hs.add(a);
		}
		public void showinfor() {
			this.hs.forEach(a -> System.out.println(a.toString()));
		}
		public HocSinh searchbysbd(String sbd) {
			return this.hs.stream().filter(a -> a.getSbd().equals(sbd)).findFirst().orElse(null);
		}

}
