package collectionHW;

import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Part3 {

	public static void main(String[] args) throws Exception {
		Set<Character> set = new TreeSet<>();
		System.out.println("Please type in the file you wish to access");
		Scanner inputFile = new Scanner(System.in);
		int vowelCount = 0;
		int constantCount = 0;
		File file = new File(inputFile.nextLine());
		if(!file.exists()) {
			System.out.println("That file does not exist!");
			System.exit(1);
		}
		inputFile.close();
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			String word = input.next().toUpperCase();
			for(int i = 0; i < word.length();i++) {
				if(set.contains(word.charAt(i))) {
					
					vowelCount++;
				}
				else if (word.charAt(i) > 'A' && word.charAt(i) <= 'Z')
					constantCount++;
			}
		}
		input.close();
		System.out.println("Vowel Count is: " + vowelCount + "\nConstant Count is: " + constantCount);
		System.out.println("Set of Vowels contains" + set.toString());
		
			
		

	}

}
