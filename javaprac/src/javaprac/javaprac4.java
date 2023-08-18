package javaprac;
import java.util.Scanner;																			//IMPORT SCANNER
public class javaprac4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner read = new Scanner(System.in);																//DECLARE SCANNER 
int Secs;																							//DECLARE VARIABLES

System.out.print("Enter your seconds: ");															//INPUT SECONDS
Secs = read.nextInt();

System.out.println("The converted time is: " + (Secs/60/60/24%24) + ":" + (Secs/60/60%24) + ":" + (Secs/60%60) + ":" + (Secs%60));	//OUTPUT
	}

}
