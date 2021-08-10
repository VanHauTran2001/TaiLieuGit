
public class GiamDoc extends NhanVien{
		private String email;
		
		public GiamDoc(String ten, String sdt, int tuoi , String email) {
			super(ten,sdt,tuoi);
			this.email = email;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
		@Override
		public String toString() {
			return "\nThong tin Giam Doc :"
					   +"\nTen : " + ten 
					   +"\nTuoi :" + tuoi
					   +"\nSDT : " + sdt
					   +"\nEmail :"+email;
		}

		/*
		public void showInfor() {
			System.out.println("Ten :" + ten);
			System.out.println("Tuoi :" + tuoi);
			System.out.println("SDT : " + sdt);
			System.out.println("Email :" + email);
		}
		
		*/
}
