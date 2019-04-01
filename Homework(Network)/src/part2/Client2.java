package part2;

import java.io.*;
import java.net.*;
import java.util.*;

import javafx.stage.Stage;

public class Client2 {
	public static void main(String args[]) throws UnknownHostException, IOException {
		int number,temp,count;
		Socket s = new Socket("localhost",1234);
		Scanner sc2 = new Scanner(s.getInputStream());
		temp = sc2.nextInt();
		System.out.println("You are visitor number: " + temp);
		
		Scanner sc = new Scanner(System.in);
		
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("Choose a number");
		number = sc.nextInt();
		PrintStream p2 = new PrintStream(s.getOutputStream());
		p2.println(number);
		temp = sc1.nextInt();
		System.out.println(temp);
	}
}
