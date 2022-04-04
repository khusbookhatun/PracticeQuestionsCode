
public class Employee implements Comparable {
	private String name;
	private int eid;
	
	public Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	@Override
	public String toString() {
		return "name=" + name + ", eid=" + eid ;
	}


	@Override
	public int compareTo(Object o) {
		
		int eid1=this.getEid();
		Employee e=(Employee)o;
		int eid2=e.getEid();
		if(eid1<eid2)
			return -1;
		if(eid1>eid2)
			return +1;
		else 
			
		return 0;
	}
	
}
