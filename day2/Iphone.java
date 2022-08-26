package week3.day2;

public class Iphone implements Mobile{

	public void sendSMS() {
		System.out.println("SendSMS");
	}

	public void dialNumber() {
		System.out.println("Dial number");
	}

	public void switchOn() {
		
		System.out.println("switch on ");
	}

	public static void main(String[] args) {
		Iphone obj = new Iphone();
		obj.dialNumber();
		obj.sendSMS();
		obj.switchOn();

	}

	
}
