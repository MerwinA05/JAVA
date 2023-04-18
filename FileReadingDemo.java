package Code;


	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class FileReadingDemo {
	    public static void main(String[] args) throws IOException {
	        String fileName = "example.txt";
	        FileInputStream fileInputStream = new FileInputStream(fileName);
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
	        String line = null;
	        while ((line = bufferedReader.readLine()) != null) 
	        {
	            System.out.println(line);
	        }
	        bufferedReader.close();
	    }
	}


