package example;

import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// message box
		JOptionPane.showMessageDialog(null, "This is an example message!");
		
		// console logs
		System.err.println("This is an error message.");
		System.out.println("Hello World!");
		System.out.println("Output message!");
		
		JOptionPane.showMessageDialog(null, "The current date is " + (new Date()));
		
	}

}
