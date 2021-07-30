
public class KySu extends CanBo {
	private String branch;
	public KySu(String name , int age , String gender , String address , String branch) {
		super(name,age,gender,address);
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String toString() {
		return "KySu{" + 
				"Branch = '" + branch + '\'' + 
				", Name ='" + name + '\'' +
				", Age ='" + age + '\'' +
				", Gender ='" + gender + '\'' +
				", Address ='" + address + '\'' +
				'}';
	}

}
