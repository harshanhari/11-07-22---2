package fileHomeWork;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		try {
			File f1=new File("doc2.txt");
			FileReader fRead = new FileReader(f1);
			Scanner sc = new Scanner(fRead);
			System.out.println(f1.length());
			while (sc.hasNextLine()) {
				String dataReader = sc.nextLine();
				System.out.println(dataReader);
			}

		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}

	}

}
