
public class countCharacters {

	public static void main(String[] args) {
		String str="Hello World";
		count(str);

	}
	public static void count(String str) {
		
		//create char array of given string
		char[]ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			String s="";
			
			//when the character is not space
			while(i<ch.length && ch[i]!=' ') {
				s+=ch[i];
				i++;
				
			}
			if(s.length()>0) {
				System.out.println(s+ "->" + s.length());
			}
		}
		
	}
}
