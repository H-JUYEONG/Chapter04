package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

//		int no = (int) (Math.random() * 45) + 1;

//		System.out.println(no);

		Set<Integer> lotto = new HashSet<Integer>();

		while (lotto.size() < 6) {
			Integer no = (int) (Math.random() * 45) + 1;

			lotto.add(no);
		}

		for (Integer no : lotto) {
			System.out.print(no + "\t");
		}

	}

}
