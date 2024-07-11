package com.javaex.ex01;

public class PointList {

	private Point[] pArray;
	private int crtPos; // 현재 위치

	public PointList() {
		// 메모리 올리고
		pArray = new Point[3];
		crtPos = 0;
	}

	// 메소드 gs

	// 메소드 일반
	public void add(Point point) {
		this.pArray[crtPos] = point;
		crtPos++;
	}

	public Point get(int index) {
		return pArray[index];
	}
 
	public int size() {
		return crtPos;
	}

}
