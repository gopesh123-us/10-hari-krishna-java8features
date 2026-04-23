package live.learnjava.java8features.funInter.smrtnotisys;

public class NotificationEngine {
	public void sendNotification(String msg, NotificationService ns) {
		ns.sendMessage(msg);
	}
}
