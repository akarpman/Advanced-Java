package collectionHW;

import java.util.LinkedHashSet;

public class Part2 {

	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<>(); //{"George", "Jim", "John", "Kevin", "Michael"};
		set1.add("George");
		set1.add("Jim");
		set1.add("John");
		set1.add("Kevin");
		set1.add("Michael");
		System.out.println("Set 1");
		for (String s: set1) {System.out.print(s.toUpperCase() + " ");}
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("George");
		set2.add("Katie");
		set2.add("Kevin");
		set2.add("Michelle");
		set2.add("Ryan");
		System.out.println("\nSet 2");
		for (String s: set2) {System.out.print(s.toUpperCase() + " ");}
		LinkedHashSet<String> set3 = new LinkedHashSet<>();
		
		set3.addAll(set1);//a copy of set1 to use for the questions
		System.out.println("\nUnion of Set1 and Set2");
		set3.addAll(set2);System.out.println("After adding set2 to set1, set1 is " + set3);
		
		set3.clear();
		set3.addAll(set1);//restores set3 with set1's content
		System.out.println("\nDifference of Set1 and Set2");
		set3.removeAll(set2);System.out.println("After removing set2 from set1, set1 is " + set3);
		
		set3.clear();
		set3.addAll(set1);//restores set3 with set1's content
		System.out.println("\nIntersection of Set1 and Set2");
		set3.retainAll(set2);  System.out.println("After removing common elements in set2 " + "from set1, set1 is " + set3);
	}

}
