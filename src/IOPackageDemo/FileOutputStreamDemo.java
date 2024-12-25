package IOPackageDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {

			fis = new FileInputStream("C:/Trupti/Christmas.jpg");
			fos = new FileOutputStream("C:/Trupti/CopyImage.jpg");

			int readIndex;
			System.out.println("file Opened");

			while ((readIndex = fis.read()) != -1) {
				fos.write(readIndex);
			}
			System.out.println("new file created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
