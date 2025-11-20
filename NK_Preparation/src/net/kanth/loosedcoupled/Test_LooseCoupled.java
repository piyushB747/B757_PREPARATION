package net.kanth.loosedcoupled;

interface Notifier {
	public abstract void sendMessage(String message);
}

class EmailNotifier implements Notifier {
	@Override
	public void sendMessage(String message) {
		System.out.println("Sending Email: " + message);

	}
}
class SmsNotifier implements Notifier{
	@Override
	public void sendMessage(String message) {
		System.out.println("Sending SMS: " + message);		
	}
}
class MessageService{
	private final Notifier notifer;

	public MessageService(Notifier notifer) {
		super();
		this.notifer = notifer;
	}	
	
	public void sendMessage(String message) {
		this.notifer.sendMessage(message);
	}
}
public class Test_LooseCoupled {
	public static void main(String[] args) {
		Notifier n1 = new EmailNotifier();;;;
		MessageService m1 = new MessageService(n1);
		m1.sendMessage("I am the best in the world");
	}
}
