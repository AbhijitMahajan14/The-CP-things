import java.lang.reflect.Method;

public class ReflationAPI {
	public static void main(String[] args) {
		Class meta=Class.forName("java.lang.String");
		Method[] methods=meta.getMethods();
		for(Method m:methods)
		{
			System.out.println(m.getName());
			if(m.getName().equals("setBalance"))
			{
				Object[] params= {2000};
//				Object[] params=newObject[m.getParameterCount()];
//				params[0]=2000;
				
				
			}
		}
		
	}
}
