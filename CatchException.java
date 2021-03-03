import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class CatchException {

	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(new File("nonExistentFile.dat"));
			
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			scan.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

}
