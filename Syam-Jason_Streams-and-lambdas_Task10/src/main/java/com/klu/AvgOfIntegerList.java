package com.klu;

import java.util.ArrayList;
import java.util.Scanner;

public class AvgOfIntegerList {
	private static int sum;
	private static void Average(int sum, int n) {
		final double average = sum / n;
		System.out.println(average);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		for(int i = 0; i < n; i++) {
			int z = sc.nextInt();
			arr.add(z);
			sum += z;
		}
		Average(sum, n);
		sc.close();
	}

}