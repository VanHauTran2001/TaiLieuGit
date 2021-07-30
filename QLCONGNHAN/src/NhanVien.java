
public class NhanVien extends CanBo{
	private String task;
	public NhanVien(String name , int age ,String gender, String address , String task ) {
		super(name,age,gender,address);
		this.task = task;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task  = task;
	}
	public String toString() {
		return "NhanVien{" + 
				"Task = '" + task + '\'' + 
				", Name ='" + name + '\'' +
				", Age ='" + age + '\'' +
				", Gender ='" + gender + '\'' +
				", Address ='" + address + '\'' +
				'}';
	}

	

}
