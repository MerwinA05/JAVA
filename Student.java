package Code;



	public class Student {
	    private String name;
	    private int rollNo;
	    
	    public Student() {
	        // default constructor
	        name = "John Doe";
	        rollNo = 0;
	    }
	    
	    public Student(String name) {
	        // constructor with one parameter
	        this.name = name;
	        rollNo = 0;
	    }
	    
	    public Student(String name, int rollNo) {
	        // constructor with two parameters
	        this.name = name;
	        this.rollNo = rollNo;
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        Student s1 = new Student();                   
	        Student s2 = new Student("Alice");             
	        Student s3 = new Student("Bob", 123);         
	        System.out.println(s1.getName() + " " + s1.getRollNo());   
	        System.out.println(s2.getName() + " " + s2.getRollNo());   
	        System.out.println(s3.getName() + " " + s3.getRollNo());   
	    }

		private int getRollNo() {
			// TODO Auto-generated method stub
			return rollNo;
		}

		private String getName() {
			// TODO Auto-generated method stub
			return name;
		}

		
	}


