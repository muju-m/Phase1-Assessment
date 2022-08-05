import java.io.File;
import java.util.Scanner;

public class displayFiles {
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path from which you want the files to be displayed");
		/* Add // after the path you specfied*/
		String path = sc.nextLine();
		File f = new File(path);
		//to display all the files
		File fileNames[] = f.listFiles();
		for(File ff:fileNames) {
			System.out.println( ff.getName());
		}
		//System.exit(0);
	}
}
