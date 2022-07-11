package fileHomeWork;

import java.io.File;

public class Ex6 {

	public static void main(String[] args) {

		try {
			File f5 = new File("doc.txt");
			File f6 = new File("doc1.txt");
			f6.createNewFile();
			int i = f5.compareTo(f6);
			if (i == 0) {
				System.out.println("the files are lexicographcaly equal");
			} else {
				System.out.println("the files are not lexicographicaly equal by " + i);
			}
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
