import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapDemo2 {

	public static void main(String[] args) {
		
		HashMap<String,Integer>m=new HashMap<>();
		m.put("chairanjeevi", 700);
		m.put("bala", 800);
		m.put("Venkatesh", 200);
		m.put("nagarjuna", 500);
		
		System.out.println(m);
		
		Set s=m.keySet();
		System.out.println(s);
		
		Collection c=m.values();
		System.out.println(c);
		
		Set s1=m.entrySet();
		Iterator itr=s1.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"............."+m1.getValue());
			if(m1.getKey().equals("nagarjuna")) {
				m1.setValue(1000);
			}
		}
		
		System.out.println(m);

	}

}
