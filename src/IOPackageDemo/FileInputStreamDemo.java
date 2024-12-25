package IOPackageDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {

			fis = new FileInputStream("C:/Trupti/myFile.txt");
			int readIndex;
			System.out.println("file Opened");

			while ((readIndex = fis.read()) != -1) {
				System.out.print((char) readIndex);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
