package fileHomeWork;

import java.io.File;

public class Ex1 {

	public static void main(String[] args) {

		try {
			File f1 = new File("doc.txt");
			String listOfFiles[] = new String[100];
			listOfFiles = f1.list();
			System.out.println(listOfFiles);
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
