package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demofilereader {
	public static String readFile(String name) throws FileNotFoundException{
		StringBuilder builder = new StringBuilder();
		
			try {
				Scanner scanner = new Scanner(new FileInputStream(name));
				while(scanner.hasNext()) {
					builder.append(scanner.nextLine());
					builder.append('\n');
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
			}
		
		return builder.toString();
		
	}
}
