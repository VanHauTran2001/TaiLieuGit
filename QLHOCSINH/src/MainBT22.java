import java.util.Scanner;
public class MainBT22 {
	 public static HocSinh createCadidate(Scanner sc, String cate) {
	        System.out.print("Enter ID: ");
	        String sbd = sc.nextLine();
	        System.out.print("Enter name: ");
	        String hoten = sc.nextLine();
	        System.out.print("Enter address: ");
	        String diachi = sc.nextLine();
	        System.out.print("Enter Priotity: ");
	        String uutien = sc.nextLine();
	        sc.nextLine();
	        if (cate.equals("a")) {
	            return new HSKhoiA(sbd, hoten,diachi,uutien);
	        } else if (cate.equals("b")) {
	            return new HSKhoiB(sbd, hoten,diachi,uutien);
	        } else {
	            return new HSKhoiC(sbd, hoten,diachi,uutien);
	        }

	    }
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		TuyenSinh student = new TuyenSinh();
		while(true) {
			System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show information of candidate: ");
            System.out.println("Enter 3: To search candidate by id");
            System.out.println("Enter 4: To exit:");
            String line = sc.nextLine();
            switch(line) {
            case "1" : {
            	System.out.println("Enter a: to insert HS KHOI A");
                System.out.println("Enter b: to insert HS KHOI B");
                System.out.println("Enter c: to insert HS KHOI C");
                String num = sc.nextLine();
                switch(num) {
                case "a" :{
                	student.addhocsinh(createCadidate(sc,"a"));
                	break;
                }
                case "b" :{
                	student.addhocsinh(createCadidate(sc,"b"));
                	break;
                }
                case "c" :{
                	student.addhocsinh(createCadidate(sc,"c"));
                	break;
                }
                default:
                	break;
                }
                break;

            }
            case "2" :{
            	student.showinfor();
            	break;
            }
            case "3":{
            	System.out.println("Nhap sbd muon tim kiem :");
            	String sbd = sc.nextLine();
            	HocSinh st = student.searchbysbd(sbd);
            	if(st == null) {
            		System.out.println("Not Here !");
            	}
            	else {
            		System.out.println(st.toString());
            	}
            	break;
            }
            case "4": {
                return;
            }
            default:
                System.out.println("Invalid");
                continue;

            }
		}

	}

}
