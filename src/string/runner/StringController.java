package string.runner;

import string.view.StringView;
/**
 * StringController for the third Java project.
 * @author gsla6260
 *
 */
public class StringController
{
	private StringView myView;
	
	/**
	 * Creates a StringController object, initializing all values as needed.
	 */
	public StringController()
	{
		myView = new StringView();
	}
	/**
	 * Starts the code starting with the displayRuntimeError method.
	 */
	public void start()
	{
		//myView.displayRuntimeError();
//		String temp = myView.sendParameterMethod();
//		myView.usePassedValue(temp);
		
		//myView.usePassedValue(myView.sendParameterMethod());
		//Uses sendParameterMethod again.
//		myView.moreInteractive("Grayson", myView.sendParameterMethod());
		myView.testStringMethods();
	}
}
