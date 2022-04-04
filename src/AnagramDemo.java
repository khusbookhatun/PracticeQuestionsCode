import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		String str1="racenjjf";
		String str2="care";
		anagramCheck(str1,str2);

	}
	public static void anagramCheck(String str1,String str2) {
		
		//if(str1.length()==str2.length()) 
			
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		//return Arrays.equals(ch1, ch2);
			if (ch1==ch2) {
				System.out.println("yes its anagram");
			}
			else {
				System.out.println("noooooooooo");
			}
	
	}
}

