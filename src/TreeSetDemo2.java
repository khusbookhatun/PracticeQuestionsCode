import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet<>(new MyCamparator2());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("ABCD");
		System.out.println(t);
	}

}

	class MyCamparator2 implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			
			String s1=o1.toString();
			String s2=o2.toString();
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2)
				return -1;
			if(l1>l2)
				return +1;
			else
				return s2.compareTo(s1);
		}
		
		
	}