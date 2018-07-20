package org.bm.exam;

public class Exam<T extends Number> {
	private T mark; // field parameter
	private String name;

	public Exam(T mark, String name) { // constructor parameter
		this.mark = mark;
		this.name = name;
	}

	public T getMark() { // method parameter
		return mark;
	}

	public int roundMark() {
		return Math.round(mark.floatValue()); //class Number method
	}
	
	public boolean equalsToMark(Exam<?> obj){ // method parameter
		return roundMark() == obj.roundMark();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
