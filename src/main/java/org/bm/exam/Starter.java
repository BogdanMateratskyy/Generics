package org.bm.exam;

public class Starter {

	public static void main(String[] args) {
		Exam<Double> md1 = new Exam<Double>(4.71D, "one"); // 4.8
		Exam<Double> md2 = new Exam<Double>(4.75D, "two"); // 4.8
		System.out.println(md1.equalsToMark(md2));
		
		Exam<Integer> mi = new Exam<Integer>(4, "three");
		System.out.println(mi.equalsToMark(md1)); 
		
	}
}
