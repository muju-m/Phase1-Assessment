import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class addFiles {
	public void create() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path for where the new file wants to be created");
		/* Add // after the path you specfied*/
		String path = sc.nextLine();
		System.out.println("Enter the name of the file that you want to create");
		String fileName = sc.next();
		String finalPath = path+fileName;
		File file = new File(finalPath);
		//To create a new file
		boolean b = file.createNewFile();
		if(b != true) {
			System.out.println("File is not created.");			
		}
		else {
			System.out.println("File created successfully");
		}
	}
}
