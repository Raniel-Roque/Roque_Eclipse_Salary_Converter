package javaprac;
import java.util.Scanner;
public class javaprac10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int rows;
		
		System.out.print("Enter how many rows: ");
		rows = read.nextInt();
		
		for (int i = rows; i >= 0; i--) {
				for(int c = i; c >= 0; c--) {
					System.out.print(" * ");
				}
		System.out.println();
	}
		
		
	}

}
