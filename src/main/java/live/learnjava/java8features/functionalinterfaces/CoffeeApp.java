package live.learnjava.java8features.functionalinterfaces;

public class CoffeeApp {
	public static void main(String[] args) {
		CoffeeExecutor executor = new CoffeeExecutor();
		executor.run(()->System.out.println("Coffee Ready"));
	}
}
