import java.util.Scanner;

public class MainBT20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLy managerofficer = new QuanLy();
		
		while(true) {
			System.out.println("1 : Insert office ");
			System.out.println("2 : Search office ");
			System.out.println("3 : ShowInformation office ");
			System.out.println("4 : Return ");
			String num = sc.nextLine();
			switch(num) {
			case "1" : {
				System.out.println("Enter a: to insert KySu");
                System.out.println("Enter b: to insert CongNhan");
                System.out.println("Enter c: to insert NhanVien");
                String line = sc.nextLine();
                switch(line) {
                
                
                case "a" :{
                	System.out.println("Nhap name :");
                	String name = sc.nextLine();
                	System.out.println("Nhap age :");
                	int age = sc.nextInt();
                	sc.nextLine();
                	System.out.println("Nhap gender :");
                	String gender = sc.nextLine();
                	System.out.println("Nhap address :");
                	String address = sc.nextLine();
                	System.out.println("Nhap branch :");
                	String branch = sc.nextLine();
                	CanBo engineer = new KySu(name,age,gender,address,branch);
                	managerofficer.addoffice(engineer);
                	System.out.println(engineer.toString());
                	break;
                }
                
                case "b" :{
                	System.out.println("Nhap name :");
                	String name = sc.nextLine();
                	System.out.println("Nhap age :");
                	int age = sc.nextInt();
                	sc.nextLine();
                	System.out.println("Nhap gender :");
                	String gender = sc.nextLine();
                	System.out.println("Nhap address :");
                	String address = sc.nextLine();
                	System.out.println("Nhap level :");
                	int level = sc.nextInt();
                	sc.nextLine();
                	CanBo work = new CongNhan(name,age,gender,address,level);
                	managerofficer.addoffice(work);
                	System.out.println(work.toString());
                	break;
                }
                case "c" :{
                	System.out.println("Nhap name :");
                	String name = sc.nextLine();
                	System.out.println("Nhap age :");
                	int age = sc.nextInt();
                	sc.nextLine();
                	System.out.println("Nhap gender :");
                	String gender = sc.nextLine();
                	System.out.println("Nhap address :");
                	String address = sc.nextLine();
                	System.out.println("Nhap branch :");
                	String task = sc.nextLine();
                	CanBo staff = new NhanVien(name,age,gender,address,task);
                	managerofficer.addoffice(staff);
                	System.out.println(staff.toString());
                	break;
                }
                default:
                	System.out.println("Error");
                	break;
               }
                break;
                
			}
			case "2":{
				System.out.println("Nhap name muon tim kiem :");
				String name = sc.nextLine();
				managerofficer.searchOfficerByName(name).forEach(x -> {
					System.out.println(x.toString());
				});
				break;
			}
			case "3" :{
				managerofficer.showinforOffice();
				
				break;
			}
			case "4" :{
				return;
			}
			default:
				System.out.println("Error");
			
		}
			
	}
		
	}

}
