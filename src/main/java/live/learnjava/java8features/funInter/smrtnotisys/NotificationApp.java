package live.learnjava.java8features.funInter.smrtnotisys;


public class NotificationApp {

	public static void main(String[] args) {
		NotificationEngine ns = new NotificationEngine();
		ns.sendNotification("You have passed", (msg) -> System.out.println("SMS: " + msg));
		ns.sendNotification("You should receive an email", (msg) -> System.out.println("EMAIL: " + msg));
		ns.sendNotification("Mobile message for you", (msg) -> System.out.println("PUSH: " + msg));
		
	}

}
