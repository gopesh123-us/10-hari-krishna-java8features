package live.learnjava.java8features.gptLessons;

public class PaymentApp {
	public static void main(String[] args) {
		PaymentEngine pe = new PaymentEngine();
		pe.processPayment(1000.55, (a) -> System.out.println("Processing " + a + " using UPI Gateway"));
		pe.processPayment(5000.99, (a) -> System.out.println("Processing " + a + " using PayPal Network"));
		pe.processPayment(9655.33, (a) -> System.out.println("Processing " + a + " using Credit Card Gateway"));
	}
}
