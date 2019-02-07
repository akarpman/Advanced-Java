package labs;

public class GenericStack<E> {
	private Integer list[];

	GenericStack(Integer[]arr){
		//list = new Integer [10];
			list = new Integer [arr.length];
		
	}
	public void doubleSize(int oldsize,Integer[]arr) {
		arr = new Integer[oldsize * 2];
		for(int i = 0; i < list.length; i++) {
			arr[i] = list[i];
			System.out.println(arr[i]);
		}
		list = new Integer [arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
	}
	public int getSize() {
		return list.length;
		
	}

	@SuppressWarnings("unchecked")
	public E peek() {
		//return list.get(getSize() - 1);
		return (E) list.toString();
	}

	public void push(E o) {
		list[(int) o] = (Integer) o;
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		E o = (E) list[list.length - 1];
		list[list.length - 1] = null;
		return o;
	}

	public boolean isEmpty() {
		if(list.length == 0)
		return true;
		else
			return false;
		
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
