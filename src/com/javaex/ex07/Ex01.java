package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		HashSet<Integer> iSet = new HashSet<Integer>();

		// int i = new Integer(3); // 자동 언박싱
		Integer i01 = new Integer(3);
		Integer i02 = 6; // 자동박싱
		Integer i03 = new Integer(9);

		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);

		System.out.println(iSet.size());
		System.out.println(iSet.toString());
		
		for(Integer no :iSet) {
			System.out.println(no);
		}

	}
}
