package example;

public class Messages {

	public static String getHelloWorldMessage() {
		return "Hello World!";
	}
	
	public static String getGoodbyeWorldMessage() {
		return "Goodbye World!";
	}
	
	public static String getNumbers(int toNumber) {
		String str = "";
		for (int i = 1; i < toNumber; i++) {
			str += i + " ";
		}
		return str;
	}
	
}
