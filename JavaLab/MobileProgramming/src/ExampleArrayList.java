public class ExampleArrayList {

	private int[] data;
	private int index;
	
	/**
	 * 생성자 size만큼 배열 생성
	 * @param _size
	 */
	public ExampleArrayList(int _size) {
		
		data = new int[_size];
		index = 0;
	}
	
	public void add(int addData) {
		
		if(data.length == index) {
			System.out.println("Array add " + addData + " >> ERROR: Array is fulled");
			return ;
		}
		data[index++] = addData;
	}
	
	int get(int ind) {
		return data[ind];
	}
	
	int size() {
		return index;
	}

}