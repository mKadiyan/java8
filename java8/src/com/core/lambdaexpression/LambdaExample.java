package com.core.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
	public static void main(String[] args) {
		String[] strs = {"A","B","C"};
		Display display = new Display();
		List<String> list = Arrays.asList(strs);
		list.forEach(display::display);
	}
	
	
	static class Display
	{
		public void display(String s)
		{
			System.out.println(s);
		}
	}
}
