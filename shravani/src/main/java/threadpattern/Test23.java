package threadpattern;

import java.util.*;
public class Test23 {
	public static void main(String[] args)
	{
	
	for(int i=0; i<3; i++) {
	    switch(i) {
	        case 0 : break;
	        case 1 : System.out.println("one");
	        case 2 : System.out.println("two");
	        case 3 : System.out.println("three");
	    }
	}
	System.out.println("done");
	Map<String,String> s=new HashMap<>();
	s.put("S", "89868965");
	s.put("k", "9978876767");
	
		s.entrySet().forEach(e->System.out.println(e.getKey().hashCode()));
}}
