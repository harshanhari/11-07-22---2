package fileHomeWork;

import java.io.File;

public class Ex4 {

	public static void main(String[] args) {

		try {
			File f2 = new File("doc.txt");
			if (f2.canRead()) {
				System.out.println("The file is readable");
			} else {
				System.out.println("The file is not readeable");
			}
			if (f2.canWrite()) {
				System.out.println("The file is writable");
			} else {
				System.out.println("The file is not writable");
			}
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
