package fileHomeWork;

import java.io.File;

public class Ex5 {

	public static void main(String[] args) {

		try {
			File f5 = new File("doc.txt");
			String pathName = f5.getPath();
			if (f5.isFile()) {
				System.out.println("Its a file");
			} else {
				System.out.println("Its a directory");
			}
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
