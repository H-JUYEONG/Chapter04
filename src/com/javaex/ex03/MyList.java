package com.javaex.ex03;

public class MyList<T> { // T는 Point를 받기 위한 매개변수 같은 존재

	// 필드
	private T[] oArray;
	private int crtPos; // 현재 위치

	// 생성자
	public MyList() {
		// 메모리 올리고
		oArray = (T[]) new Object[3];
		crtPos = 0;
	} 

	public void add(T obj) {
		this.oArray[crtPos] = obj;
		crtPos++;
	}

	public T get(int index) {
		return oArray[index];
	}

	public int size() {
		return crtPos;
	}

}
