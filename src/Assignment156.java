
public class Assignment156 {
	 public int  count_appearance(String[] arr,String t)
	  {
	    
	    int count=0;
	    for(String str:arr){
	      if( str==t){
	        count++;
	      }
	    }
	    return count;
	    
	   
	  } //end  count_appearance
	  public static void main(String[]args){
	   String[] str={"a","foo","bar","foo","bla"};
	   String st="foo";
	  count_appearance(str, st);  
	  }

}