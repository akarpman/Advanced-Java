//Andrew Karpman
//MultiThread HW Part1
//The sum class
package Part1;

public class Sum implements Runnable{

	Integer sum;
	Sum(){
		sum = 0;
	}

	@Override
	public void run() {
		sum++;
		
	}

}
