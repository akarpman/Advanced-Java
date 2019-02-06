//Andrew Karpman
//Homework 2 Question
//This runs a Stopwatch class that determines how long selection sort takes to sort 100k random numbers
package homework2;

import java.util.Random;
import java.util.Vector;
import homework2.StopWatch;

public class StopWatchMain {
	public static void sort(Vector<Integer> v) 
    { 
        int n = v.size(); 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (v.get(j) < v.get(min_idx))
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp1 = v.get(min_idx);
            int temp2 = v.get(i);
            int temp = temp1; 
            temp1 = temp2; 
            temp2 = temp; 
        } 
    } 
	public static void main(String[] args)
	{
		StopWatch time = new StopWatch();
		Vector<Integer> v = new Vector<Integer>();
		Random rand = new Random();
		int temp = 0;
		
		for(int i  = 0; i < 100000; i++) {
			
		temp = rand.nextInt(100);
		v.add(temp);
		//System.out.println(i + " ");
		}
		time.start();
		sort(v);
		time.stop();
		System.out.println("Time Elipsed was " + time.getElapsedTime());
		
	}

}
