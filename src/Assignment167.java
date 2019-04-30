
public class Assignment167 {

	public static void main(String[] args) {
		
		  System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    String unique="";
	    for(int i=0;i<str.length();i++){
	     char temp = str.charAt(i);
	    
	    if(!unique.contains(""+temp)){
	      unique+=temp;
	    
	        }
	      }
	      return unique;
	      }
	    }

