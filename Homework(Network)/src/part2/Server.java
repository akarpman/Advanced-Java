package part2;

import java.io.*;
import java.net.*;
import java.util.*;

import javafx.stage.Stage;

public class Server {
	public static void main(String args[]) throws UnknownHostException, IOException {
		ServerSocket server = new ServerSocket(1234);
		int number, temp,count = 0;
		File file = new File ("Counter.dat");
		RandomAccessFile ran = new RandomAccessFile(file,"rw");
		if(!file.exists())
		ran.write(count);
		ran.seek(8);
		count = ran.read();
		System.out.println("Server is online");
		while (true) {
			Socket ss = server.accept();
			ran.write(count++);
			PrintStream p = new PrintStream(ss.getOutputStream());
			p.println(count);
			
			Scanner sc = new Scanner(ss.getInputStream());
			number = sc.nextInt();
			temp = number * 2;
			PrintStream p2 = new PrintStream(ss.getOutputStream());
			p2.println(temp);
		}
	}
}
