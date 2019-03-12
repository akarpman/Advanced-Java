//Andrew Karpman
//MultiThread HW part1
//code that increments sum 1k times by creating 1k threads that add 1 in random order
package hw;

public class Counter implements Runnable {
	Integer sum;
	Counter(){ sum = 0;}
	@Override
	public synchronized void run() {
		sum++;
		System.out.println(sum + " ");
	}
	//Driver part starts here
	public static void main(String[] args) {
		Counter c = new Counter();
		Sum s = new Sum();
		System.out.println("Not Synchronized");
		for(int i = 0; i < 1000; i++)
		{
			new Thread(s).start();
		}
		
		System.out.println("Synchronized: Noted the delay from the previous one");
		for(int i = 0; i < 1000; i++)
		{
			new Thread(c).start();
		}
		
	}

	
}
