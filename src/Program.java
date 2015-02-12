/**
 * 
 

/**
 * @author Tom Pickett
 *
 */
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.*;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyWindow myWindow = new MyWindow();
		
		myWindow.setVisible(true);
		
		
		
		
		
		/*
		String firstNumber = "";
		String secondNumber = "";
		
		JFrame myWindow = new JFrame("myWindow");
		myWindow.setLayout(new FlowLayout());
		
		// Add Icon
		Icon bug = new ImageIcon(Program.class.getResource("bug1.png"));
		
		// Add label
		JLabel myLabel = new JLabel("My Label", bug, SwingConstants.LEFT);
		myLabel.setForeground(Color.WHITE);
		myLabel.setToolTipText("This is my Label");
		myLabel.setHorizontalAlignment(SwingConstants.LEFT);
		myLabel.setLocation(0, 0);
		myWindow.add(myLabel);
		
		// Add TextField
		JTextField myTextField = new JTextField("Enter your name", 20);
		myTextField.setLocation(0, 40);
		myWindow.add(myTextField);
		
		// FIX THIS ERROR TOM
		//myTextField.addActionListener(textFieldHandler);
		
		
		
		
		// Modify my window properties
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(320, 480);
		myWindow.getContentPane().setBackground(Color.BLACK);
		myWindow.setLocationRelativeTo(null);
		myWindow.setResizable(false);
	
		myWindow.setVisible(true);
		*/
		
		/*
		try {
			
			firstNumber = JOptionPane.showInputDialog("Enter First Integer");
			System.out.println(firstNumber);
			secondNumber = JOptionPane.showInputDialog("Enter Second Integer");
			System.out.println(secondNumber);
			
			int number1 = Integer.parseInt(firstNumber);
			int number2 = Integer.parseInt(secondNumber);	
			
			int sum = number1 + number2;
			
			JOptionPane.showMessageDialog(null, "The Sum is " + sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Incorrect Values Entered", "Entry Error", JOptionPane.ERROR_MESSAGE);
			System.out.println(e);
		}
		
		*/
		
	

	}
	
	public void textFieldHandler() {
		
	}

}
