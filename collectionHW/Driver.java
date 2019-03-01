package collectionHW;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		Point points [] = new Point[100];
		for(int i  = 0; i < 100; i++) {
			points[i] = new Point((int)(Math.random()*100),(int)(Math.random()*100));
		}
		System.out.println("----------------------------------------------------------------------------------------------------" + "\nPart 1");
		Arrays.sort(points);
		for(int i  = 0; i < 100; i++)
			System.out.println(points[i].x + " " + points[i].y);
		System.out.println("----------------------------------------------------------------------------------------------------" + "\nPart 2");
		Arrays.sort(points,new CompareY());
		for(int i  = 0; i < 100; i++)
			System.out.println(points[i].x + " " + points[i].y);
	}

}
