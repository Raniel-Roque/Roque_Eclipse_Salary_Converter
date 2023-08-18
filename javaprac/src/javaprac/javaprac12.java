package javaprac;
import java.util.Scanner;
public class javaprac12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		String name, iniT = "";
		System.out.print("Enter your name: ");
		name = read.nextLine();
		
		iniT += name.charAt(0) + ". ";
		
		for (int x = 0; x <= name.length() - 1; x++) {
			if (name.charAt(x) == ' ') {
				iniT += name.charAt(x+1) + ". ";
			} 
		}
		
		System.out.println(iniT);
	}

}
