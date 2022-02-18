package java8features;

import java.util.*;

public class Features {
	public static void main(String args[]) {
		List<Employee> e = new ArrayList<>();
		e.add(new Employee(1, "priyanka", "TCS", 23000));
		e.add(new Employee(2, "suchita", "Acce", 23000));
		e.add(new Employee(3, "ritika", "Infosys", 23000));
		e.add(new Employee(4, "ketan", "IBM", 23000));
		e.add(new Employee(5, "sanjay", "Oracle", 23000));
		e.add(new Employee(6, "ram", "Cogni", 23000));
		Collections.sort(e);
		e.forEach(k -> System.out
				.println(k.getId() + "\t" + k.getName() + "\t" + k.getOrganization() + "\t" + k.getSalary()));
		Comparator<Employee> c = new Comparator<Employee>() {
			@Override
			public int compare(Employee e0, Employee e1) {

				return e0.getName().compareTo(e1.getName());
			}
		};
		Collections.sort(e, c);
		e.forEach(k -> System.out
				.println(k.getId() + "\t" + k.getName() + "\t" + k.getOrganization() + "\t" + k.getSalary()));
		Employee e1 = new Employee(7, "kedar", "Capgi", 40000);
		Employee e2 = new Employee(8, "mandar", "NIO", 60000);
		Employee e3 = new Employee(9, "sarthak", "info", 49000);
		Employee e4 = new Employee(7, "kedar", "Capgi", 40000);
		Employee e5 = new Employee(10, "rohit", "VTC", 50000);
		Employee e6 = e1;
		System.out.println(e6 == e1);
		System.out.println(e1.equals(e4));
		System.out.println("" + e1.hashCode());
		System.out.println("" + e2.hashCode());
		System.out.println("" + e3.hashCode());
		System.out.println("" + e4.hashCode());
		System.out.println("" + e5.hashCode());
		System.out.println("" + e6.hashCode());
		HashSet<Employee> hmap = new HashSet<Employee>();
		hmap.add(e1);
		hmap.add(e2);
		hmap.add(e3);
		hmap.add(e4);
		hmap.add(e5);
		hmap.add(e6);
		hmap.forEach(h -> System.out.println(h.getId() + "\t" + h.getName() + "\t" + h.getOrganization()));
		ImmutableClass i=new ImmutableClass(78);
		int k=i.getId();
		System.out.println(k);
		
	HashMap<Employee,Employee> hset=new HashMap<>();
	hset.put(e5, e6);
	Employee emp=hset.get(e5);
	}
}
