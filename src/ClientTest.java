import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClientTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/* BillpugSingletonExamples  Singleton =  BillpugSingletonExamples.getInstance();
		 BillpugSingletonExamples  Singleton1 =  BillpugSingletonExamples.getInstance();

		 
		 
		 System.out.println(Singleton.hashCode());
		 System.out.println(Singleton1.hashCode());*/
		
		
		
		ReflectionSingletonExamples singleton = ReflectionSingletonExamples.getInstance();
		ReflectionSingletonExamples singleton1= null;
		
		 Constructor<?> [] constructors = ReflectionSingletonExamples .class. getDeclaredConstructors();
		 for(Constructor<?> constructor : constructors ) {
			 constructor.setAccessible(true);
			 
			Object object= constructor.newInstance();
			singleton1 = (ReflectionSingletonExamples )object;
			
			break;
		 }
		 
		 
		 
		 System.out.println(singleton.hashCode());
		 System.out.println(singleton1.hashCode());
				 {
			 
				 }
		 

	}

}
