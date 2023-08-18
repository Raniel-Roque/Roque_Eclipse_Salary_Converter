package javaprac;
import java.util.Scanner;																			//IMPORT SCANNER
public class javaprac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner read = new Scanner(System.in);																//DECLARE SCANNER 
int Secs, Secs2, Min, Hour, Day;																	//DECLARE VARIABLES

System.out.print("Enter your seconds: ");															//INPUT SECONDS
Secs = read.nextInt();

Day = Secs/60/60/24;																				//PROCESS CONVERSIONS
Hour = Secs/60/60 - (Day*24);																		
Min = (Secs/60) - (Hour*60) - (Day*24*60);			
Secs2 = Secs - (Min*60) - (Hour*60*60) - (Day*24*60*60);

System.out.println("The converted time is: " + (Day) + ":" + (Hour) + ":" + (Min) + ":" + (Secs2));	//OUTPUT
	}

}
