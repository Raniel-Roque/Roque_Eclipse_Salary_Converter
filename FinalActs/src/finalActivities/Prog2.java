package finalActivities;
import java.util.Scanner;
public class Prog2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter a number [0-35]: ");
		num = read.nextInt();
		
		if (num  >= 0 && num <= 9) {
			System.out.println(num);
		} else {
			switch (num) {
			case 10:
				System.out.println("A");
				break;
			case 11:
				System.out.println("B");
				break;
			case 12:
				System.out.println("C");
				break;
			case 13:
				System.out.println("D");
				break;
			case 14:
				System.out.println("E");
				break;
			case 15:
				System.out.println("F");
				break;
			case 16:
				System.out.println("G");
				break;
			case 17:
				System.out.println("H");
				break;
			case 18:
				System.out.println("I");
				break;
			case 19:
				System.out.println("J");
				break;
			case 20:
				System.out.println("K");
				break;
			case 21:
				System.out.println("L");
				break;
			case 22:
				System.out.println("M");
				break;
			case 23:
				System.out.println("N");
				break;
			case 24:
				System.out.println("O");
				break;
			case 25:
				System.out.println("P");
				break;
			case 26:
				System.out.println("Q");
				break;
			case 27:
				System.out.println("R");
				break;
			case 28:
				System.out.println("S");
				break;
			case 29:
				System.out.println("T");
				break;
			case 30:
				System.out.println("U");
				break;
			case 31:
				System.out.println("V");
				break;
			case 32:
				System.out.println("W");
				break;
			case 33:
				System.out.println("X");
				break;
			case 34:
				System.out.println("Y");
				break;
			case 35:
				System.out.println("Z");
				break;
			}
				
		}
		
		
	}

}
