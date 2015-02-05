/**
 * 
 * @author Tom Pickett
 *
 */

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;


public class Program {

	public static void main(String[] args) {
		String firstNumber = "";
		String secondNumber = "";
		
		JFrame myWindow = new JFrame("My Window");
		myWindow.setLayout(new SpringLayout());
		
		// Add Icon
		Icon bug = new ImageIcon(Program.class.getResource("bug1.png"));

		
		// Add Label
		JLabel myLabel = new JLabel("My Label", bug, SwingConstants.LEFT);
		myLabel.setForeground(Color.WHITE);
		myLabel.setToolTipText("This is my Label");
		myLabel.setIcon(bug);
		myWindow.add(myLabel);
		
		//Add textfield
		JTextField myTextField = new JTextField("Enter your name", 20);
		myTextField.setLocation(0, 40);
		myWindow.add(myTextField);
		
		//Modify window properties
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(320, 480);
		myWindow.getContentPane().setBackground(Color.BLACK);
		myWindow.setLocationRelativeTo(null);
		myWindow.setResizable(false);
			
		myWindow.setVisible(true);
		
		
		try {
			
			firstNumber = JOptionPane.showInputDialog("Enter first integer");
			System.out.println(firstNumber);
			secondNumber = JOptionPane.showInputDialog("Enter first integer");
			System.out.println(secondNumber);
			
			
			int number1 = Integer.parseInt(firstNumber);
			int number2 = Integer.parseInt(secondNumber);
			
			int sum = number1 + number2;
			
			JOptionPane.showMessageDialog(null, "The Sum is " + sum + " Sum of two integers", secondNumber, JOptionPane.PLAIN_MESSAGE);
			
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Incorrect Values Entered.");
			JOptionPane.showMessageDialog(null, "Incorrect Values Entered", "Entry Error", JOptionPane.ERROR_MESSAGE);
			
			System.out.println(e);
		}
	}
}
