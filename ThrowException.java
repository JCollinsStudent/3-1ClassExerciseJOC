import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowException {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("nonExistentFile.dat"));
		
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
		scan.close();
	}
}
