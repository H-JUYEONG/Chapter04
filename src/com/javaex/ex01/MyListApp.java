package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		/*
		// 배열로 관리
		// 미리 갯수를 결정해야한다.
		Point[] pArray = new Point[3];

		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);

		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;

		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].toString());
			
		}
		*/
		 
		PointList pList = new PointList();
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		Point p = pList.get(1);
		System.out.println(p.toString());
		System.out.println(pList.size());
		
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("------------------------");
				
		//////////////////////////////////////
		
		CircleList cList = new CircleList();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		Circle c03 = new Circle(100);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		Circle c = cList.get(0);
		System.out.println(c.toString());
		System.out.println(cList.size());
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
		}
	}

}
