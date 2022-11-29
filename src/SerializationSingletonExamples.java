import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationSingletonExamples  implements Serializable
{
private static final long serialversionUID = 1L;

private static SerializationSingletonExamples singletonExamples = new SerializationSingletonExamples();

private SerializationSingletonExamples()
{
	
}


public static SerializationSingletonExamples getInstance()
{
	return singletonExamples;
}


public static void main(String[] args)
{
	SerializationSingletonExamples singleton = SerializationSingletonExamples.getInstance();
			try {
				ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SerializationSingletonExamples.txt"));
				out.writeObject(singletonExamples);
				out.close();
				
				ObjectInput in = new ObjectInputStream(new FileInputStream("SerializationSingletonExamples.txt"));
				SerializationSingletonExamples singleton1 = (SerializationSingletonExamples) in.readObject();
				in.close();
				
				System.out.println(singleton.hashCode());
				System.out.println(singleton1.hashCode());
				
			
			}
	catch(Exception e)
	{
		
	}
			}
}
