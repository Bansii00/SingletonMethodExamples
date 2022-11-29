
public class ReflectionSingletonExamples {


   private static ReflectionSingletonExamples  INSTANCE = null;
   
   private ReflectionSingletonExamples()
   {
	   
   }
   
   public static ReflectionSingletonExamples getInstance()
   {
	if (INSTANCE == null)
	{
		INSTANCE = new  ReflectionSingletonExamples();
	}
	 return INSTANCE;
	}
  

}
