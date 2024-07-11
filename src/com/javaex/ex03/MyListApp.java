package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {

		MyList<Point> pList = new MyList<Point>();

		Point p01 = new Point(2, 2);
		Point p02 = new Point(22, 22);
		Point p03 = new Point(222, 222);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
 
		Point p = pList.get(1);
		System.out.println(p.toString());

		/////////////////////////////////

		MyList<Circle> cList = new MyList<Circle>();

		Circle c01 = new Circle(3);
		Circle c02 = new Circle(33);
		Circle c03 = new Circle(333);

		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		Circle c = cList.get(0);

		System.out.println(c.toString());

	}

}
