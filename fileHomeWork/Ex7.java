package fileHomeWork;

import java.io.File;
import java.sql.Date;

public class Ex7 {

	public static void main(String[] args) {

		try {
			File f7 = new File("doc.txt");
			long l = f7.lastModified();
			Date date = new Date(l);
			System.out.println(date);
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
