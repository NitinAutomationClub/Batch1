package day2;

public class Test {
// Demo code for Class Object and Method
	// We call method by using object
	
	public void walk()
	{
		System.out.println("i AM WALING NOW");
	}
	
	public void eatDinner()
	{
		System.out.println("Eating Rice in Dinner");
	}	//End Eat method
	
	public void run()
	{
		System.out.println("Running");
	
	}

	public static void main(String[] args) {
		/*Syntax for object
		
		Classname object=new Classname();
		*/
		
		Test obj=new Test();
		
		
		// We call method by using object
		obj.eatDinner();
		obj.run();
		
		
	}
		
	}// Ending Class 
