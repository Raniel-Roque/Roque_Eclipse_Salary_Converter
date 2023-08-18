package javaprac;
import java.util.Scanner;
public class javaprac5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		String CusCode;
		int AccNum, PremChans, BasicServ;
		
		System.out.print("Enter Customer Code: ");
		CusCode = read.nextLine();
		
		System.out.print("Enter Customer's Account: ");
		AccNum = read.nextInt();
		
		if (CusCode.equals("r") || CusCode.equals("R")) {

			System.out.print("Enter the number of your subscribed premium channels: ");
			PremChans = read.nextInt();
			
			System.out.println("\n" + "Customer's Account Number: " + AccNum);
			System.out.println("Your Bill Amount: P" + String.format("%.2f", ((4.50 + 20.50) + (7.50 * (double)PremChans))));
			
		} else if (CusCode.equals("b") || CusCode.equals("B")) {
			
			System.out.print("Enter the number of your basic service connections: ");
			BasicServ = read.nextInt();
			
			System.out.print("Enter the number of your subscribed premium channels: ");
			PremChans = read.nextInt();
			
				if (BasicServ <= 10) {
					
					System.out.println("\n" + "Customer's Account Number: " + AccNum);
					System.out.println("Your Bill Amount: P" + String.format("%.2f", ((4.50 + (50.90 * (double)PremChans)) + ((double)BasicServ * 75.00))));
			
				} else if (BasicServ > 10) {
					
					System.out.println("\n" + "Customer Account Number: " + AccNum);
					System.out.println("Your Bill Amount: P" + String.format("%.2f", (4.50 + (50.90 * (double)PremChans)) + ((((double)BasicServ - 10) * 5 + 750))));
					
				}
		}
	}

}
