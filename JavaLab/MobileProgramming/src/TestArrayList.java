
public class TestArrayList {

	public static void main(String[] args) {
		
		ExampleArrayList arrayList = new ExampleArrayList(5);
		
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(7);
		arrayList.add(9);
		arrayList.add(11);
		arrayList.add(11);
		
		// Get size and display.
		int count = arrayList.size();
		System.out.println("Count: " + count);

		// Loop through elements.
		for (int i = 0; i < arrayList.size(); i++) {
		    int value = arrayList.get(i);
		    System.out.println("Element: " + value);
		}
		

	}

}
