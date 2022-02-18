package mapimplementation;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String k="";
	for(int i=s.length()-1;i>=0;i--) {
		k=k+s.charAt(i);
	}
	System.out.println(k);
	sc.close();
}
}
