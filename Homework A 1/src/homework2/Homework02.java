//Andrew Karpman
//Homework 2 Parts 1 and 2
//Part 1 just displays Java in texts of Js and As.  Part 2 calculates e to the 25th decimal place.

package homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework02 { 
	public static void main(String[] args) {
		System.out.println("\n -----Part 1----- \n");
		System.out.println("     J       A     V       V     A");
		System.out.println(" ");
		System.out.println("     J      A A     V     V     A A");
		System.out.println(" ");
		System.out.println("J    J     AAAAA     V   V     AAAAA");
		System.out.println(" ");
		System.out.println("  J J     A     A      V      A     A");
		System.out.println("\n -----Part 2----- \n");
		 	BigDecimal one = new BigDecimal(1);
	        BigDecimal e = new BigDecimal(1.0);
	        BigDecimal divisor = new BigDecimal(1.0);
	        for (int i =  1; i <= 1000; i++) {
	            divisor = divisor.multiply(new BigDecimal(i));
	            e = e.add(one.divide(divisor, 25, RoundingMode.HALF_EVEN));//100 digits will make the first row show change.  500 will show the second
	            if (i%100 == 0)
	            System.out.println("e = " + e);

	        }
	    
	        
	    

	       
	    

	}

}
