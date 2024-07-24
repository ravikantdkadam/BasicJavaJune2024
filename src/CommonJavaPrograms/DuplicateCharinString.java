package CommonJavaPrograms;



public class DuplicateCharinString {

	public static void main(String[] args) {
		

        String name  ="seleniumsi";
        
        char inp[]= name.toCharArray();
        
    for(int i=0; i<name.length(); i++){
    	
    	for (int j=i+1; j<name.length();j++) 
    	{
    		
    		if(inp[i]==inp[j]) {
    			
    			 System.out.println("Duplicate charcter is :"+inp[j]);
    			 
    			 
    		}
    		
    		
    	}
            
         
            
            }

            
            
        }
        
        
        
     }

