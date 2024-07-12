package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();

		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(1, 2);
		
//		boolean test = p01.equals(p03);
//		System.out.println(test);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		for(Point p : pSet) {
			System.out.println(p.hashCode());
		}
		
		

	}

}
