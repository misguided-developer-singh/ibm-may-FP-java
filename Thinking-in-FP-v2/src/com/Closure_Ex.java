package com;

interface Learn {
	void doLearn();
}

public class Closure_Ex {

	public static Learn doTeach(String sub) {
		String notes = sub + "-notes";
		return () -> {
			System.out.println("learning with " + notes);
		};
	}

	public static void main(String[] args) {
		Learn learn = doTeach("java8");
		
		learn.doLearn();
		learn.doLearn();
	}

}
