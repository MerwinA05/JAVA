package Loop;

public class Fibonacci 
{
        public static void main(String[] args) 
        {
	    int n = 10;  // number of terms in the series
        int a = 0, b = 1;
	    System.out.println(a);
	    System.out.println(b);
        for (int i = 2; i < n; i++) 
        {
	        int c = a + b;
	        System.out.println(c);
            a = b;
            b = c;
	    }
	    }
	

}
