package com.javaex.ex01;

public class CircleList {

	private Circle[] cArray;
	private int crtPos;

	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}

	public void add(Circle circle) {
		this.cArray[crtPos] = circle;
		crtPos++;
	}

	public Circle get(int index) {
		return cArray[index];
	}
 
	public int size() {
		return crtPos;
	}

}
