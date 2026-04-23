package live.learnjava.java8features.funcInface.paySys;

@FunctionalInterface
public interface PaymentService {
	void processPayment(double amount, String serviceMethod);
}
