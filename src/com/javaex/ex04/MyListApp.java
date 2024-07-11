package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();

		Point p01 = new Point(2, 2);
		Point p02 = new Point(12, 13);
		Point p03 = new Point(22, 22);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		System.out.println(pList.size());

		Point p1 = pList.get(1);
		System.out.println(p1.getY());

		Point p2 = pList.get(2);
		System.out.println(p2.getY());
		
		System.out.println(pList.toString());
		/*
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));

			// Point pp = pList.get(i);
			// System.out.println(pp.toString());
		}*/

	}

}
