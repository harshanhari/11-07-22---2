package fileHomeWork;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		try {
			File f10 = new File("doc2.txt");
			FileWriter fWrite = new FileWriter(f10);
			Scanner sc = new Scanner(System.in);
			Scanner sd = new Scanner(f10);
			while (sd.hasNextLine()) {
				String dataReader = sd.nextLine();
				System.out.println(dataReader);
			}
			System.out.println("Enter the text");
			String msg = sc.nextLine();
			fWrite.append(msg);
			System.out.println("Updated");
			sd.close();
			sc.close();
			fWrite.close();

		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
