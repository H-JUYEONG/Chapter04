package com.javaex.ex09;

import java.util.Objects;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {

	}

	// 메소드 gs
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	} 

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
