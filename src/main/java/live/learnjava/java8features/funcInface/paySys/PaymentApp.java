package live.learnjava.java8features.funcInface.paySys;

public class PaymentApp {
	public static void main(String[] args) {
		PaymentEngine pe = new PaymentEngine();
		pe.processPayment(99.33, "PayPal", (amt, mthd)->System.out.println(mthd + ": " + "Amount: $" + amt + " sent"));
		pe.processPayment(201.88, "UPI", (amt, mthd)->System.out.println(mthd + ": " + "Amount: $" + amt + " sent"));
		pe.processPayment(301.56, "Credit Card", (amt, mthd)->System.out.println(mthd + ": " + "Amount: $" + amt + " sent"));
		
	}
}
