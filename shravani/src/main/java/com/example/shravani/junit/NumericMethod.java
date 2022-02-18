package com.example.shravani.junit;

public class NumericMethod {
	public int sum(int[] ab) {
		int sum=0;
		for(int i=0;i<ab.length;i++) {
			sum=sum+ab[i];
		}
		return sum;
	}
}
