import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class deleteFiles {
 public void delete() throws IOException {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the path from which you want the files to be deleted");
	 /* Add // after the path you specfied*/
	 String path = sc.nextLine();
	 System.out.println("Enter the name of the file that you want to delete");	 
	 String fileName = sc.nextLine();
	 String finalPath = path+fileName;
	 File file = new File(finalPath);
	 file.delete();
	 System.out.println("The file is successfully deleted");
 	}
}
