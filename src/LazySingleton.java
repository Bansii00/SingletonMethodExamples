
public class LazySingleton {

	public static void main(String[] args)
	{
Ab1 obj = Ab1.getInstance();
Ab1 obj1 = Ab1.getInstance();

	}

}


class Ab1
{
	public static Ab1 obj;
	int i;
	private Ab1()
	{
		System.out.println("Instance created");
	}
	public static Ab1 getInstance()
	{
		if(obj == null)
		{
		obj = new Ab1();
		}
		return obj;
		
	}
}