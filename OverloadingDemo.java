package Code;


	public class OverloadingDemo {

	    public int add(int x, int y) {
	        return x + y;
	    }

	    public double add(double x, double y) {
	        return x + y;
	    }

	    public String add(String x, String y) {
	        return x + y;
	    }

	    public static void main(String[] args) {
	        OverloadingDemo demo = new OverloadingDemo();
	        System.out.println(demo.add(1, 2));            
	        System.out.println(demo.add(1.5, 2.5));       
	        System.out.println(demo.add("hello", "world"));
	    }
	}


