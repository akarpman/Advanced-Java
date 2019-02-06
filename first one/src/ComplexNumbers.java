import java.util.Scanner;

public class ComplexNumbers {
	private double real;
	private double imaginary;
	ComplexNumbers(){};
	ComplexNumbers(double r, double im){
		real = r; 
		imaginary = im;
	};
	public void add(ComplexNumbers num)
	{
		ComplexNumbers cCalc = new ComplexNumbers();
		 cCalc.add(num);
		
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
	  class ComlpexCalculator{
		public void add(ComplexNumbers num)
		{
			double temp = real + num.getReal();
			double temp2 = real + num.getImaginary();
			//num.toString();
			real = temp;
			imaginary = temp2;
			System.out.println(real + " + " + imaginary + "i");
		}
	}
	  
//create getters
}
public static void main(String[] args) {
	System.out.printf("Type your Complex Num");
	

	Scanner reader = new Scanner(System.in);  // Reading from System.in
	//System.out.println("Enter a number: ");
	double n1 = reader.nextDouble();
	double n2 = reader.nextDouble();
	ComplexNumbers com = new ComplexNumbers(n1,n2);
	//reader.close();
	com.add(new ComplexNumbers(2,1));
	
	//System.out.println(countLetters(n));
	return;

}
