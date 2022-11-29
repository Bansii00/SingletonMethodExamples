
public class SingletonExamples {

	//Eager Singleton methods.
	//The singleton pattern is implemented by creating a class with a method that creates a new instance of the class if one does not exist. 

//If an instance already exists, it simply returns a reference to that object. 

//To make sure that the object cannot be instantiated any other way, the constructor is made private.

	public static void main(String[] args) 
	{

		
		
		Abc obj1= Abc.getInstance();
		Abc obj2 = Abc.getInstance();
		}

}
class Abc
{
	static Abc obj=new Abc();
	private Abc()
	{
	
	}
	public static Abc getInstance() {
		return null;
	}
}
