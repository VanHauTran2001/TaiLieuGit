import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class QuanLy {

	private List<CanBo> office;
	
	public QuanLy() {
		this.office = new ArrayList<>();
	}
	public void addoffice(CanBo x) {
		this.office.add(x);
	}
	
	public List<CanBo> searchOfficerByName(String name){
		return this.office.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
	}
	public void showinforOffice() {
		this.office.forEach(o -> System.out.println(o.toString()));
	}
}
