import java.util.Arrays;

public class MissingNumberDemo {

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,6};
		int misisngNumber=getMissingNumber(array,6);
		System.out.println(misisngNumber);

	}

	private static int getMissingNumber(int[] array, int n) {
		
		int totalSum=(n*(n+1)/2);
		int actaulSum=0;
		for (int i : array) {
			
			actaulSum+=i;
			
		}
		
		return totalSum-actaulSum;
	}

}
