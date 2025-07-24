package com.ycw.ch16.step01;

public class LamdaExam {

	public static void main(String[] args) {
		NoArgNoReturn imp = new Imp() {
			@Override
			public void test() {
				System.out.println("print from test().");
			}
		};
		imp.test();
	

	/*
	 NoArgNoReturn imp = new Imp();
	 imp.test();
	 imp = new NoArgNoReturn(){
	 	public void test(){
		System.out.println("print from test().");
		}
	};
	imp.test();
	 */
	imp = () -> {
		String msg = "1: print from test()";
		System.out.println(msg);
	};
	imp.test();
	
	imp = () -> System.out.println("3: print from test()");
	imp.test();
	}
}
