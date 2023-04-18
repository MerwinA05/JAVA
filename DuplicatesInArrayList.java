package String;

import java.util.ArrayList;
import java.util.Arrays;


public class DuplicatesInArrayList {

	public static void main(String[] args) {
		String s="malayalam";
		ArrayList<Character> a=new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			a.add(s.charAt(i));
		}
		
		char[] c=new char[a.size()];
		for(int i=0; i<a.size(); i++) {
			c[i]=a.get(i);
		}
		Arrays.sort(c);
		int x=0;
		for(int i=1; i<c.length; i++) {
			if(c[i]==c[x]) {
				
			}
			else {
				System.out.println(c[i]);
			}
			x++;
		}

	}

}
