
package Code;

public class GetName 
{

	    public static void main(String[] args) 
	    {
	        GetName obj = new GetName();
	         Class<? extends GetName> cls = obj.getClass();
	        String className = cls.getName();
	        System.out.println("The name of the class is: " + className);
	    }
	

}
