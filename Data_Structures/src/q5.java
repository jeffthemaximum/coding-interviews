
public class q5 {

	static int dupFinder(int numbers[]){
		// get initial variables
		int length = numbers.length;
		int arraySum = 0;
		int expectedSum = 0;
		
		//get sum of numbers array
		for (int i = 0; i < length; i++) {
			arraySum += numbers[i];
			if (i != length - 1) {
				expectedSum += numbers[i];
			}
		}
		return arraySum - expectedSum;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[]{0,1,2,3,4,5,2};
		int dup = dupFinder(numbers);
		System.out.println(dup);
	}

}
