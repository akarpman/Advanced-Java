package homework4;

import java.util.ArrayList;

public class Part1 {
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> newList = new ArrayList<E>();
		for (int i = 0; i < list.size(); i++) {
			list.sort(list);
			newList.add(list.get(i));
		if (list.get(i) == list.get(i+1))// clones the array}
		for (int i = 0; i < list.size(); i++)
			for (int j = 1; j < list.size(); j++)
				if (list.get(i) == list.get(j)) {// checks for duplicates
					newList.remove(list.get(j));
					list.remove(list.get(j));
					//list.add(list.get(i));
					}// removes them
		System.out.println(newList.toString());
		return newList;
	}

	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++)
			if (list[i] == key)
				return 1;
			else
				return -1;
		return 0;

	}
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++)
			if (list[i] == key)
				return 1;
			else
				return -1;
		return 0;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		Integer arr[] = new Integer[10];
		Integer value = (Integer)10;
		Integer five = 5;
		System.out.println(list.toString());
		removeDuplicates(list);
		System.out.println(linearSearch(arr,five));
		System.out.println(linearSearch(arr,arr[1]));
		System.out.println(binarySearch(arr,arr[0]));
		System.out.println(list.toString());

	}

}
