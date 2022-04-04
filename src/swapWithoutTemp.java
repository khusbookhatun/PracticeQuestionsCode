
public class swapWithoutTemp {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("before swaping a="+a);
		System.out.println("before swaping b="+b);
		swap(a,b);

	}
	
	public static void swap(int a,int b) {
		
		a=a*b;//200
		b=a/b;//10
		a=a/b;//20
		System.out.println("after swaping a="+a);
		System.out.println("after swaping b="+b);
		
	}

}
