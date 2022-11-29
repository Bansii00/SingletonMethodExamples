
public class DoubleCheckedLoginSingleton {




	public static void main(String[] args)
	
	{
		Thread t1 = new Thread(new Runnable() {
				
			public void run()
			{
				bc obj = bc.getInstance();

			}
		});
		

	

Thread t2 = new Thread(new Runnable() {
	
	public void run()
	{
		bc obj = bc.getInstance();

	}
});




t1.start();
try { Thread.sleep(10); } catch(Exception e) {}
t2.start();

		}
	

}

		class bc
		{
			public static bc obj;
			int i;
			private bc()
			{
				System.out.println("Instance created");
			}
			public static  bc getInstance()  // Double checked Locking.
			{
				if(obj == null)
				{
					synchronized (bc.class) 
					{
					
					if(obj == null)
				obj = new bc();
				}
			}
				return obj;
				
			}
		}
		
	
		
	


		
