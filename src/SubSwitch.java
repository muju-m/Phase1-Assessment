import java.io.IOException;
import java.util.Scanner;

public class SubSwitch {
 public void sub() throws IOException {
	 Scanner sc = new Scanner(System.in);
	 addFiles add = new addFiles();
	 deleteFiles del = new deleteFiles();
	 searchForFile src = new searchForFile();
	 boolean b = true;
	 while(true) {
		 System.out.println("Enter 1 to add a new file"+'\n'+
				 "Enter 2 to delete a file"+'\n'+
				 "Enter 3 to search for a file"+'\n'+
				 "Enter 4 to go back to main");
		 int option2 = sc.nextInt();
		 switch(option2) {
			case 1: add.create();
			break;
			case 2: del.delete();
			break;
			case 3: src.search();
			break;
			case 4: System.out.println("Returning to main"); 
			b=false;
			break;
		}	
		 	if(b == false) {
		 		break;
		 	}
	}
 }
}
