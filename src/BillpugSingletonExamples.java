
public class BillpugSingletonExamples {

	
	
     private BillpugSingletonExamples()
     {
     }
     
     private static class SingletonHolder
     {
    	 private static final  BillpugSingletonExamples  INSTANCE = new  BillpugSingletonExamples();
     }
    
     public static  BillpugSingletonExamples getInstance()
     {
		return SingletonHolder.INSTANCE;
    	 
     }
	}


