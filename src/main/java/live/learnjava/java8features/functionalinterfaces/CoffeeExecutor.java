package live.learnjava.java8features.functionalinterfaces;

public class CoffeeExecutor {

	public void run(CoffeeAction action) {
		action.brew();
	}
	
}
