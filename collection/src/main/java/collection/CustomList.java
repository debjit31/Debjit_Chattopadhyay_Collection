package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomList{ 
	private ArrayList<Integer> arr;
	public CustomList(ArrayList<Integer> arr)
	{
		this.arr = arr;
		for(int i = 1; i<=10; i++)
			arr.add(i);
	}
	public void fetch(int index) {
		
		System.out.println(arr.get(index));
		
	}
	public void add(int val) {
		arr.add(val);
	}
	public void remove(int pos) {
		arr.remove(pos);
		
	}
	public void display()
	{
		Iterator<Integer> h = arr.iterator();
		while (h.hasNext())
			System.out.println(h.next());
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		CustomList cl = new CustomList(arr);
		cl.fetch(3);
		cl.add(100);
		cl.remove(7);
		cl.display();	
	}
}
