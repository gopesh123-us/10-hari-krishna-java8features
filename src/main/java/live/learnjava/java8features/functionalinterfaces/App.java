package live.learnjava.java8features.functionalinterfaces;

public class App {
	public static void main(String[] args) {
		System.out.println("Demo - Funtional Interface");
		Runner aOp = new Runner();
		int result = aOp.process(4,5, (a,b)-> a+b);
		System.out.println(result);
	}		
}
