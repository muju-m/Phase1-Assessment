import java.io.File;
import java.util.Scanner;

public class searchForFile {
	public void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path from which you want to search the file from");
		String path = sc.nextLine();
		System.out.println("enter the name of the file that you want to search");
		String filename=sc.next();
		File f=new File(path);
		int flag=0;
		File fileName[]=f.listFiles();
		for(File ff:fileName) {
			if(ff.getName().equals(filename)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		
		}
		if(flag==1) {
			System.out.println("file is found");
		}
		else {
			System.out.println("file is not found");
		}
	}
}

