package hierarchical;

public class HierarchicalDemo {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println("------------Person Details -----------");
		System.out.println(p1);
		
		Person p;
		p = new Person("aditi", "Pune");
		System.out.println("Person Details :"+ p);
		
		p= new Employee("anuj", "mumbai", 2345, 45678, "comp");
		System.out.println("Employee Details : " + p );
		
		p=new Student("vaishali", "Pune","BE", 45);
		System.out.println("Students Details : "+p);
		
		
	}

}
