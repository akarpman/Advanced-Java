package labs;

public class main {

	public static void main(String[] args) {
		Integer [] arr = new Integer[10];
		GenericStack<Integer> gen = new GenericStack<Integer>(arr);
		for(int i = 0; i<10;i++)
		gen.push(i);
		System.out.println(gen.toString());
		System.out.println(gen.pop());
		System.out.println(gen.toString());
		System.out.println(gen.isEmpty());
		gen.doubleSize(arr.length,arr);
		gen.doubleSize(arr.length,arr);
		

	}

}
