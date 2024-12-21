package serialization.deserialization;

import java.io.*;

public class YogaSerialization {

	public static void main(String[] args) {

		SuryaNamaskar suryaNamaskar = new SuryaNamaskar();

		// Create Yoga objects
		Yoga asana1 = new Yoga("Sukhasana", "Promotes mental calmness and relaxation.", "Easy", suryaNamaskar);
		Yoga asana2 = new Yoga("Pranayama", "Improves breathing, mental clarity, and reduces stress.", "Intermediate",
				suryaNamaskar);
		FileOutputStream fos = null;
		ObjectOutputStream os = null;
		try {
			fos = new FileOutputStream("YogaIsLife.txt");
			os = new ObjectOutputStream(fos);
			os.writeObject(asana1);
			os.writeObject(asana2);
			System.out
					.println("Yoga object saved to YogaIsLife.txt file located at " + new File(".").getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
				if (os != null)
					os.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
