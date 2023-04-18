package MethodOverLoading;



public class MethodOverLoading {

	public static void main(String[] args) {
		int result=add(1,2.0);
		System.out.println(result);

	}

	private static int add(int a) {
		return a;
		
	}
	private static int add(int a, int b) {
		return a+b;
		
	}
	private static int add(int a,double b) {
		return a+(int)b;
		
	}

}
