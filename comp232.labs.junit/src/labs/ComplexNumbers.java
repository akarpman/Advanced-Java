//Andrew Karpman
//Lab 01
//Create a Complex Number

package labs;

import java.util.Scanner;

public class ComplexNumbers {
	private double real;
	private double imaginary;
	ComplexNumbers(){};
	ComplexNumbers(double r, double im){
		real = r; 
		imaginary = im;
	};
	public int add(ComplexNumbers num)
	{
		ComplexCalculator cCalc = new ComplexCalculator();
		if (real == 0 || imaginary == 0)
		{
			throw new IllegalArgumentException("The Real or Imaginary must not be 0");
		}
		 cCalc.add(num);
		 return (int)(real + imaginary);

	}
	public double getReal()
	  {
		  return real;
	  }
	  public double getImaginary()
	  {
		  return imaginary;
	  }
	//12 + 2i
	  class ComplexCalculator{
		public void add(ComplexNumbers num)
		{
			double temp = real + num.getReal();
			double temp2 = imaginary + num.getImaginary();
			//num.toString();
			real = temp;
			imaginary = temp2;
			System.out.println(real + " + " + imaginary + "i");
			
		}
	}

//create getters
	  public static void main(String[] args) {
			System.out.printf("Please type your Complex Number without the i or + EX: 12 2 = 12.0 + 2.0i: ");


			Scanner reader = new Scanner(System.in);  // Reading from System.in
			double n1 = reader.nextDouble();//takes in the next to numbers the user types in
			double n2 = reader.nextDouble();
			ComplexNumbers com = new ComplexNumbers(n1,n2);
			com.add(new ComplexNumbers(0,0));
			return;
		}
}


