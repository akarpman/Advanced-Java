import java.util.Scanner;
public class main {

	public static int countLetters(String s)
	{
		int value = 0;
		while (value != s.length())
		{
			value++;
		}
		return value;
	}
	
	public static void main(String[] args) {
		System.out.printf("Type your String");
		

		Scanner reader = new Scanner(System.in);  // Reading from System.in
		//System.out.println("Enter a number: ");
		String n = reader.nextLine(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		System.out.println(countLetters(n));
		return;

	}

}
