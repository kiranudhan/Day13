package generic.com;

public class GenericClass<T> {
	private T[] inputArray;
	
	public GenericClass(T[] inputArray) {
		this.inputArray=inputArray;
	}
	
	public void toPrint() {
		GenericClass.toPrint(this.inputArray);
	}
	
	public static <E> void toPrint(E[] inputArray) {
		for(E element : inputArray) {
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray= {1 , 2, 3, 4 ,5 ,6};
		Double[] doubleArray= {12.3,14.5,15.6,78.6};
		Character[] charArray= {'a','b','c','d'};
         new GenericClass(intArray).toPrint();
        GenericClass.toPrint(doubleArray);
        GenericClass.toPrint(charArray);
	}

}
