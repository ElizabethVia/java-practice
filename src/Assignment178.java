
public class Assignment178 {

	public static void main(String[] args) {
		// mergR();
	}

	 public static int[] mergR(int[] a,int[] b) {
		 int [] c=new int[a.length+b.length];
		   
		    int count=0;
		    for(int i=0;i<a.length;i++){
		    c[i]=a[i];
		    	count++;
		    	
		    }
		   for(int j=0;j<b.length;j++){
		     c[count++]=b[j];
			  
			   
		   }
		  
		  return c;
		    
		  }//end mergR
}
