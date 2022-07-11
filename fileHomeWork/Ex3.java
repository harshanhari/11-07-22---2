package fileHomeWork;

import java.io.File;

public class Ex3 {

	public static void main(String[] args) {

		try {
			File f1 = new File("doc.txt");
			if (f1.exists()) {
				System.out.println("File is existing");
			} else {
				System.out.println("File not exists");
			}
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
