package fileHomeWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex13 {

	public static void main(String[] args) {

		try {
			File f10 = new File("doc.txt");
			FileReader fr = new FileReader(f10);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
			fr.close();
			System.out.println("contents of file ");
			String dataStore = sb.toString();
			System.out.println(dataStore);
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
