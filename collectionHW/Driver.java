package collectionHW;

import java.util.ArrayList;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Point p = new Point(1,2);
		ArrayList <Point> Array= new ArrayList<Point>();
		Random rand = new Random();
		
		//CompareY y;
		for(int i  = 0; i < 100; i++) {
			Point p;
		p.x = rand.nextInt(100);
		p.y = rand.nextInt(100);
		Array.add(p);
		}
		//Array.sort(y.compareTo(Array._x, _y));

	}

}
