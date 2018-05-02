package com;

/*
    LE ( Lambda Expression ) ==> function
    ----------------------------------------
    greetVar1=()->System.out.println("Good Morning..");
    greetVar2=()->System.out.println("Good Noon..");			
    greetVar3=()->System.out.println("Good Evening..");
						
 
 */

interface Greeting {
	void greet();
}

//class MorningGreeting implements Greeting {
//	@Override
//	public void greet() {
//		System.out.println("Good Morning..");
//	}
//}

public class Ex1 {

	public static void doGreet(Greeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {
		
		//-------------------------------------------------------
//		MorningGreeting morningGreeting = new MorningGreeting();
//		doGreet(morningGreeting);
//		doGreet(new Greeting() {
//			@Override
//			public void greet() {
//				System.out.println("Good Noon");
//			}
//		});
//		doGreet(new Greeting() {
//			@Override
//			public void greet() {
//				System.out.println("Good Evening..");
//			}
//		});
		
		//-------------------------------------------------------
		
		doGreet(()->System.out.println("Good Evening.."));

	}

}
