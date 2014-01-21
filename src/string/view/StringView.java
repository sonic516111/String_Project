package string.view;

import javax.swing.JOptionPane;

public class StringView
{
	public void displayRuntimeError()
	{
		int tempNumber;
		String tempString;
		
		JOptionPane.showMessageDialog(null, "Let's crash the program!!!");
		tempString = JOptionPane.showInputDialog("Type in your favorite number!");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showMessageDialog(null, "Your favorite number is " + tempNumber);
	}
	
	public void usePassedValue(String currentValue)
	{
		//Types in what I typed in earlier.
		JOptionPane.showMessageDialog(null, "You typed in this earlier: " + currentValue);
	}
	
	public String sendParameterMethod()
	{
		//When using a variable in a method you must first assign it a value.
		String temp = null;
		
		JOptionPane.showMessageDialog(null, "Let's pass values!!!");
		temp = JOptionPane.showInputDialog("Type in your favorite words");
		
		return temp;
	}
	
	public void moreInteractive(String userName, String funnyPhrase)
	{
		//Sends my name along with what I typed in sendParameterMethod into here.
		JOptionPane.showMessageDialog(null, "Hi there, we are going to use two parameters");
		JOptionPane.showMessageDialog(null, userName + " thinks that " + "\n" + funnyPhrase + " is funny");
		
	}
	
	public void testStringMethods()
	{
		//You will need to call your methods in here
		testSubstring();
	}
	
	private void testSubstring()
	{
		String lettersCapital = "this is all capitalized";
		JOptionPane.showMessageDialog(null, lettersCapital.toUpperCase());
		
	}
}
