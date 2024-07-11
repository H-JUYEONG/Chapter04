package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {

		MyList pList = new MyList();

		Point p01 = new Point(2, 2);
		Point p02 = new Point(14, 14);
		Point p03 = new Point(122, 122);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		Point p = (Point) pList.get(1);
		System.out.println(p.toString());
		//////////////////////////////////

		MyList cList = new MyList();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(15);
		Circle c03 = new Circle(115);

		cList.add(c01);
		cList.add(c02);
		cList.add(c03); // 다른 자료형도 담을수 있다.(단점)

		Circle c = (Circle) cList.get(0);
		System.out.println(c.toString());

	}

}
