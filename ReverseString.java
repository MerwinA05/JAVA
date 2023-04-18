package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		
		String str="";
		for(int i=s.length()-1; i>=0; i--) {
			str=str+s.charAt(i);
		}
		
		System.out.println(str);
		
		
		/*char[]c=s.toCharArray();
		String str="";
		for(int i=c.length-1; i>=0; i--) {
			str=str+c[i];
		}
		System.out.println(str);*/
		
		
		sc.close();
		
	}

}
