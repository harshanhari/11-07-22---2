package fileHomeWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		try {
			File f1 = new File("doc.txt");
			FileReader fRead = new FileReader(f1);
			FileWriter fWrite = new FileWriter(f1);
			Scanner sc = new Scanner(System.in);
			Scanner sd = new Scanner(f1);

			System.out.println("Enter the data ");
			String msg = sc.nextLine();
			fWrite.write(msg);
			System.out.println("Written Successfully");
			while (sd.hasNextLine()) {
				String dataReader = sd.nextLine();
				System.out.println("the written message is " + dataReader);
			}
			fRead.close();
			fWrite.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}
	}

}
