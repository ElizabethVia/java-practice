
public class Assigment168 {

	public static void main(String[] args) {
		System.out.println(coverString("java methods", "me") ) ; //java [me]thods
		 System.out.println(coverString("apples", "pears") );
	  }
	public static String coverString(String main, String coverME) {
		
	    for(int i=0;i<coverME.length();i++){
	    	
	    	for(int j=0;j<main.length();j++) {	
	    	
	      if(main.contains(coverME)){
	        return main+"["+coverME+"]";
	        
	      }else if (!main.contains(coverME)){
	       } 
	      }
	      
	    }
	    return "["+main+"]";
	  }
	}

