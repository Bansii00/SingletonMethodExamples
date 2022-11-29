
public class SynchronizedSingleton {

	//How to achieve synchronized blocks using threads.
	public static void main(String[] args)
	
	{
		Thread t1 = new Thread(new Runnable() {
				
			public void run()
			{
				Ab obj = Ab.getInstance();

			}
		});
		

	

Thread t2 = new Thread(new Runnable() {
	
	public void run()
	{
		Ab obj = Ab.getInstance();

	}
});




t1.start();
t2.start();

		}
	

}

		class Ab
		{
			public static Ab obj;
			int i;
			private Ab()
			{
				System.out.println("Instance created");
			}
			public static synchronized Ab getInstance()
			{
				if(obj == null)
				{
				obj = new Ab();
				}
				return obj;
				
			}
		}
		
	
		
	


		
