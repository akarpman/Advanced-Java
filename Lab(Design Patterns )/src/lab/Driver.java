//Andrew Karpman
//Lab (Design Patterns)
//This program will ask the user how they want to receive the message "Hello Milky Way" via the Strategy Design
package lab;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Driver dr = new Driver();
		int temp = 0;
		System.out.println("Choose which way you want to recieve the your message.\n 1.File \n 2.Console");
		Scanner input = new Scanner(System.in);
		temp = input.nextInt();
		if(temp == 1) {
			//System.out.println("File selected");//extra bit used for testing
			dr.getMessage(new Files());
		}
		else if(temp == 2) {
			//System.out.println("Console selected");//extra bit used for testing
			dr.getMessage(new Console());
		}
		input.close();
	}
	public void getMessage(MessageManager msg2){
		msg2.getMessage();
	}
}
