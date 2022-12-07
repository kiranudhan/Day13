package generic.com;

public class PrintArray {
	public static <E> void toPrint(E[] inputArray) {
		for(E element:inputArray) {
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray= {1 , 2, 3, 4 ,5 ,6};
		Double[] doubleArray= {12.3,14.5,15.6,78.6};
		Character[] charArray= {'a','b','c','d'};
		 
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);
	}

	/*
	 * public static void toPrint(Integer[] intArray) { for(int element:intArray) {
	 * System.out.print(element+" "); } System.out.println(); } public static void
	 * toPrint(Double[] doubleArray) { for(double element:doubleArray) {
	 * System.out.print(element +" "); } System.out.println(); } public static void
	 * toPrint(Character[] charArray) { for(char element:charArray) {
	 * System.out.print(element+" "); } System.out.println(); }
	 */

}
