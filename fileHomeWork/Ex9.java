package fileHomeWork;

import java.io.File;

public class Ex9 {

	public static void main(String[] args) {
		try {
			File f9 = new File("doc1.txt");
			Long sizeInBytes = f9.length();
			System.out.println("The size in bytes is " + sizeInBytes);
			Double sizeInKb = (double) (sizeInBytes * Math.pow(10, -3));
			System.out.println("The size in kb is " + sizeInKb);
			Double sizeInMb = (Double) (sizeInKb * Math.pow(10, -3));
			System.out.println("The size in mb is " + sizeInMb);
		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}
	}

}
