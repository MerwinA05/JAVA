package Loop;

public class Armstrong {

	public static void main(String[] args) 
	{
		num(371);
	}
    public static void num(int a)
    {
    	int a1=a;
    	int a2=a;
    	int sum=0;
    	int count=0;
    	int ld;
    	while(a>0)
    	{
    	   count++;
    	   a=a/10;
    	}
    	while(a1>0)
    	{
    		ld=a1%10;
    		sum= sum+power(ld,count);
    		a1=a1/10;
    	}
    	if(sum==a2)
    	{
    		System.out.println("The no is Armstrong no");
    	}
    	else
    	{
    		System.out.println("The no is not a Armstrong no");
    	}
    }
	private static int power(int a, int b)
	{
		int c=1;
		for(int i=b;i>0;i--)
		{
			c=c*a;
		}
		return c;
	}
}
