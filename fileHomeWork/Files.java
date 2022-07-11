package fileHomeWork;

import java.io.File;

public class Files {

	public static void main(String[] args) {

		try {
			File file = new File("doc2.txt");
			
			if (file.createNewFile()) {
				System.out.println("File created");
			} else {
				System.out.println("File existing");
				System.out.println(file.getAbsolutePath());
				
			}
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
