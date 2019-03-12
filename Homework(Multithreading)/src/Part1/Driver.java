//Andrew Karpman
//MultiThread HW Part1
//creates 1k threads that increment an Integer wrapper class sum by 1
package Part1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		for(int i = 0; i< 1000;i++) {//never actually reaches 1k because some numbers repeat like the slides suggested
		Thread t = new Thread(s);
		t.start();
		System.out.println(s.sum);
		}
	}

}
