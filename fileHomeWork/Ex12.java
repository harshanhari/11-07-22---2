package fileHomeWork;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		try {

			File f10 = new File("doc.txt");
			FileReader fRead = new FileReader(f10);
			Scanner sc = new Scanner(f10);
			while (sc.hasNextLine()) {
				String dataReader = sc.nextLine();
				System.out.println(dataReader);
			}
			fRead.close();

		} catch (Exception e) {
			e.getStackTrace();
			/* TODO: handle exception */    
		}
	}
}
