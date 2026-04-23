package live.learnjava.java8features.funcInface.paySys;

public class PaymentEngine {
	public void processPayment(double amount, String serviceMethod, PaymentService ps) {
		ps.processPayment(amount, serviceMethod);
	}
}
