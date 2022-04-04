import java.util.Comparator;
import java.util.TreeSet;

public class CompComp {

	public static void main(String[] args) {
		Employee e1= new Employee("nag",100);
		Employee e2= new Employee("bala",200);
		Employee e3= new Employee("chiru",50);
		Employee e4= new Employee("venki",150);
		Employee e5= new Employee("nag",100);
		
		TreeSet t= new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		TreeSet t1= new TreeSet(new MyComparator3());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}

}
	class MyComparator3 implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Employee e1= (Employee)o1;
			Employee e2=(Employee)o2;
			String s1=e1.getName();
			String s2=e2.getName();
			return s1.compareTo(s2);
		}
		
		
	}
