package fileHomeWork;

import java.io.File;

public class Ex2 {

	public static void main(String[] args) {

		try {
			File f2 = new File("doc.txt");
			if (f2.isDirectory()) {
				System.out.println(f2.list());

			} else {
				System.out.println("not a Directory");
				System.out.println(f2.getAbsolutePath());
			}
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
