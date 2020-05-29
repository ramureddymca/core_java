package threads;

import java.util.List;

public class MyListGeneric<T> {

	public List<T> values;
	
	void add(T vale) {
		values.add(vale);
	}
	
	void remove(T value) {
		values.remove(value);
	}
	void get(int index) {
		values.get(index);
	}
	public static void main(String[] args) {
		MyListGeneric<String> myListString = new MyListGeneric<String>();
		myListString.add("Value 1");
		myListString.add("Value 2");

		MyListGeneric<Integer> myListInteger = new MyListGeneric<Integer>();
		myListInteger.add(1);
		myListInteger.add(2);
	}
}
