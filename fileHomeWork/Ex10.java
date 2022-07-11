package fileHomeWork;

import java.io.File;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		try {
			File f10 = new File("doc.txt");
			Scanner sc = new Scanner(f10);
			String dataReader = null;
			while (sc.hasNextLine()) {
				dataReader = sc.nextLine();
				System.out.println(dataReader);
			}
			byte arr[] = new byte[100];
			arr = dataReader.getBytes();
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
