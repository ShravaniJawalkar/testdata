package com.example.shravani.basicspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("QuickSort")
public class QuickSort implements SortAlgorithm {

	@Override
	public String getSortAlgorith() {
		return "this is quicksort";
		
	}

}
