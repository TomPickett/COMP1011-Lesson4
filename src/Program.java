/**
 * 
 * @author Tom Pickett
 *
 */

import javax.swing.JOptionPane;


public class Program {

	public static void main(String[] args) {
		String firstNumber = "";
		String secondNumber = "";
		
		

		
		try {
			
			firstNumber = JOptionPane.showInputDialog("Enter first integer");
			System.out.println(firstNumber);
			secondNumber = JOptionPane.showInputDialog("Enter first integer");
			System.out.println(secondNumber);
			
			
			int number1 = Integer.parseInt(firstNumber);
			int number2 = Integer.parseInt(secondNumber);
			
			int sum = number1 + number2;
			
			JOptionPane.showMessageDialog(null, "The Sum is " + sum + "Sum of two integers", secondNumber, JOptionPane.PLAIN_MESSAGE);
			
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Incorrect Values Entered.");
			JOptionPane.showMessageDialog(null, "Incorrect Values Entered", "Entry Error", JOptionPane.ERROR_MESSAGE);
			
			System.out.println(e);
		}
	}
}
