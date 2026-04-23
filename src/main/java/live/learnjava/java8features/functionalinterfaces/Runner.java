package live.learnjava.java8features.functionalinterfaces;

public class Runner {	
	
	int process(int a, int b, Operation op) {
		return op.apply(a, b);
	}
}
