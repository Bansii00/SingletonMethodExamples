
public class EnumSingletonExamples {

	//How to create singleton pattern using Enum methods.
	public static void main(String[] args)
	{
	bc4 obj1 = bc4.INSTANCE;
	obj1.i=5;
	obj1.show();
	
	bc4 obj2 = bc4.INSTANCE;
	obj2.i=4;
	
	obj1.show();
	}
}




enum bc4 //special type of class. it has private constructor already.
{
	INSTANCE;
	int i;
	public void show()
	{
		System.out.println(i);
	}
}

		
//Advantages of Enum in singleton methods.
//even if your class is singleton then readObject() give you new object. and that's why Enum use method is readResolve() it will not create new object and it will use the current object.			
		
			
		


			