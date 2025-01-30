package StreamAPI;

interface IMessage
{
	void printMEssage();
}

class HelloMessenger
{
	public HelloMessenger()
	{
		System.out.println("Hello from instance");
	}
	public static void displayMessage()
	{
		System.out.println("Hello World");
	}
}
public class ReferencingDemo 
{

	public static void main(String[] args) 
	{
//		HelloMessenger messenger=new HelloMessenger();
//		
//		IMessage message=messenger::displayMessage;
//		message.printMEssage();

		//in case of using static method
		IMessage message=HelloMessenger::displayMessage;
		message.printMEssage();
		
		
		
		/////////////////////////////////////////////for constructor calling
		IMessage message=HelloMessenger::new;
		message.printMEssage();
	}

}
