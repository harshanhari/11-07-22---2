package fileHomeWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		try {
			FileWriter f8 = new FileWriter("doc.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the text : ");
			String msg = sc.nextLine();
			f8.write(msg);
			System.out.println("Updated");
			f8.close();

		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
