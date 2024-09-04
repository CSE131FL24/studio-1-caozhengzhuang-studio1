package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for year?");
		int n1 = in.nextInt();
		boolean leapyear = n1 % 4 == 0 && n1 % 100 != 0 || n1 % 400 == 0;
		System.out.print(leapyear);
	}

}
