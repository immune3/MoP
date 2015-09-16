
public class TestArrayList {

	public static void main(String[] args) {
		
		ExampleArrayList elist = new ExampleArrayList(10);
		
		
		elist.add(5);
		elist.add(3);
		elist.add(7);
		elist.add(9);
		elist.add(11);
		elist.add(11);
		
		// Get size and display.
		int count = elist.size();
		System.out.println("Size: " + count);

		// Loop through elements.
		for (int i = 0; i < elist.size(); i++) {
		    int value = elist.get(i);
		    System.out.println("Element: " + value);
		}
		

	}

}
