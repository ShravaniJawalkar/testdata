package mapimplementation;



import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import java8features.Employee;

public class ConcurrentMapImpl {
public static void main(String[] args) {
	//map
	Map<Integer, Employee> hmap=new HashMap<>();
	hmap.put(1, new Employee(7, "kedar", "Capgi", 40000));
	hmap.put(2, new Employee(8, "mandar", "NIO", 60000));
	hmap.put(3, new Employee(9, "sarthak", "info", 49000));
	hmap.put(4, new Employee(10, "rohit", "VTC", 50000));
	//cmap
	ConcurrentHashMap<Integer, Employee> cmap=new ConcurrentHashMap<>();
	cmap.put(1, new Employee(7, "kedar", "Capgi", 40000));
	cmap.put(2, new Employee(8, "mandar", "NIO", 60000));
	cmap.put(3, new Employee(9, "sarthak", "info", 49000));
	cmap.put(4, new Employee(10, "rohit", "VTC", 50000));
	//hash table
	Hashtable<Integer, String> htable=new Hashtable<>();
	htable.put(1, "neha");
	htable.put(5, "vishnu");
	htable.put(4, "rekha");
	htable.put(3, "akshada");
	htable.put(2, "kartik");
	//syncrohmap
	
}
}
