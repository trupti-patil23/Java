package IOPackageDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileReaderWriterDemo {

	public static void main(String[] args) {

		FileReader frd = null;
		FileWriter fwr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			frd = new FileReader("C:/Trupti/myFile.txt");
			fwr = new FileWriter("C:/Trupti/myNewFile.txt");

			br = new BufferedReader(frd);
			bw = new BufferedWriter(fwr);

			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				StringTokenizer str = new StringTokenizer(data);
				while (str.hasMoreTokens()) {

					bw.write(str.nextToken() + "\n");
				}
			}
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (frd != null)
					frd.close();
				if (fwr != null)
					fwr.close();
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
