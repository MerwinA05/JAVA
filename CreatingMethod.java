package Code;

public class CreatingMethod
{     
	    public static int add(int a, int b)
	    {
	        int sum = a + b;
	        return sum;
	    }
	    
	    public static void printString(String str)
	    {
	        System.out.println(str);
	    }
	    
	    public static void main(String[] args)
	    {
	        int result =add(3, 4);
	        System.out.println("Result of add method: " + result);
	        printString("Hello, world!");
	    }
	

}
