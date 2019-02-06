package homework2;

import java.util.Random;
import java.util.Vector;
public class StopWatch {
	private long startTime;
	private long stopTime;
	
	StopWatch(){
		startTime = System.currentTimeMillis();
	}
	public long getStartTime(){return startTime; }
	
	public long getStopTime(){return stopTime; }
	
	public void start(){
		startTime = System.currentTimeMillis();
		System.out.println("Starting Time in Milliseconds is: " + System.currentTimeMillis());
	}
	public void stop() {
		stopTime = System.currentTimeMillis();
		System.out.println("Finishing Time in Milliseconds is: " + System.currentTimeMillis());
	}
	public double getElapsedTime() {
		return (stopTime - startTime);
	}
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<Integer>();
		Random rand = new Random();
		int temp = 0;
		for(int i  = 0; i < 100000; i++) {
		temp = rand.nextInt(100);
		v.add(temp);
		}
		
	}

}
