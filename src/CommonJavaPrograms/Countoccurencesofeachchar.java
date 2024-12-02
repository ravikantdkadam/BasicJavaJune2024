package CommonJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class Countoccurencesofeachchar {

	public static void main(String[] args) {
		
		String s= "INDIA IS MY COUNTRY";
		
	
		
		char arr[]= s.toCharArray();
		
		
		Map<Character,Integer> charmap= new HashMap<Character,Integer>();
		
		
		for (char c:arr) {
			
			if(charmap.containsKey(c)) 
			{
			charmap.put(c, charmap.get(c)+1);
		     }
			else {
				
			charmap.put(c, 1);
			}
			}
		
		System.out.println(s +" :"+charmap);
		
		
	}

}
