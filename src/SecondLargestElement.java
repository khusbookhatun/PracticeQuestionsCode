import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		 int arr[]= {23,1,2,4,78};
		 Arrays.sort(arr);
		 System.out.println("first highest elelment in the array:"+arr[arr.length-1]);
		 System.out.println("second highest element in the array:"+arr[arr.length-2]);

	}

}
