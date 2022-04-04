import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> t= new TreeSet<>(new MyCamparator());
		t.add("Raja Kumari");
		t.add("Khusboo Khatun");
		t.add("Shobha Rani");
		t.add("Roja");
		System.out.println(t);
	}
}
	class MyCamparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			 String s1=o1.toString();
			 String s2=o2.toString(); 
			 return s2.compareTo(s1);
		}
		
		
	}