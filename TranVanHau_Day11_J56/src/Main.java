import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Đọc file
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		ArrayList<HinhTru> hinhTru = new ArrayList<HinhTru>();
		try {
			fileReader = new FileReader("G:/data.txt");
			
			bufferedReader = new BufferedReader(fileReader);
			
			String line;
			while((line = bufferedReader.readLine()) !=null) {
				System.out.println("Line -> " + line);
				if(line.isEmpty()) continue;
				String part[] = line.split(";");
				float bk = Float.parseFloat(part[0].trim());
				float cc = Float.parseFloat(part[1].trim());
				
				HinhTru ht = new HinhTru(bk, cc);
				hinhTru.add(ht);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bufferedReader != null) bufferedReader.close();
				
			} catch (Exception e2) {
				
			}
		}
		for (HinhTru hinhTru2 : hinhTru) {
			hinhTru2.show();
		}
		
		//Ghi file
		File file = new File("G:/hinhtru.txt");
		FileWriter writer = null;
		BufferedWriter buffer =null;
		try {
			writer = new FileWriter(file);
			buffer = new BufferedWriter(writer);
			buffer.write("#ban_kinh;chieu_cao;dien_tich;the_tich;khoi_luong");
			for (HinhTru ht : hinhTru) {
				
				String s = (ht.getBk())/1000+";"+(ht.getCc())/1000+";"+ht.dt()+";"+ht.tt()+";"+ht.kl();
				buffer.newLine();
				buffer.write(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer !=null) buffer.close();
				if(writer != null) writer.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
