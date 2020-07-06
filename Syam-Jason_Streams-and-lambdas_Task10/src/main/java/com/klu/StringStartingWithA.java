package com.klu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class StringStartingWithA {
	public static List<String> sample(List<String> funcStr){
		List<String> resultStr = funcStr.stream()
				.filter(s -> s.startsWith("a"))
				.filter(s -> s.length() == 3)
				.collect(Collectors.toList());
		return resultStr;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> arr = new ArrayList<String>(n);
		for(int i = 0; i < n; i++) {
			String z = sc.next();
			arr.add(z);
        }
        List<String> finalstr = new ArrayList<String>();
       	finalstr = sample(arr); 
       	for(String i : finalstr)  
       		System.out.println(i);  
       	sc.close();
	}
}