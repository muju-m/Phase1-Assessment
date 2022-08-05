import java.io.IOException;
import java.util.Scanner;

public class assessment {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		displayFiles dis = new displayFiles();
		SubSwitch ss = new SubSwitch();
		FinalTermination tt = new FinalTermination();
		System.out.println("/*File Handler-->Written and developed by Mujahith*/"+'\n'+'\n');
		while(true) {
			System.out.println("Enter 1 for displaying the files in the directory."+'\n'+
					"Enter 2 for performing business level operations."+'\n'+
					"Enter 3 to close the application.");
			int option1 = sc.nextInt();
			switch(option1) {
			case 1: dis.display();
			break;
			case 2: ss.sub();continue;
			case 3: tt.term();
			}
		}
		
	}
}
