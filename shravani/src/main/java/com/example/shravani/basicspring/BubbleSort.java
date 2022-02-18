package com.example.shravani.basicspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm{

	@Override
	public String getSortAlgorith() {
		return "this is bubble sort";
	}

}
