package OCAQuizes;

import java.util.Arrays;

public class Quize01 {

	public static void main(String[] args) {
		/*
	     
	     
	     1.  What's the result of the following code fragments?
	                                   0       1
	        int[][] arr=new int[][] { {1,2}, {3,4} };
	                arr[1] = arr[0];
	            System.out.println(arr[0]); we just print arr[0] ==[I@59f95c5d
	            
	            A. Compile Error                             B. [ 1, 2 ]
	            C. [ 3, 4 ]                                  C. hashcodes  (Correct)
	            
	               
	     
	     */
		int [] arr0= {1,2,3,4};
		int arr1[]=new int [2];
		int[] arr2=new int [] {1,2};
		
	    int[] arr= {1,2,3,};
	    System.out.println(arr);
	    //convert to String: Array.toString(variablename);
	    System.out.println(Arrays.toString(arr));
	        
	        
	    
	    
	    /*
	     
	     
	     2. which one of the following will give compile error?
	     
	        A. int[][] arr=new int[2][];
	        B. double[][] arr=new double[][] { {1,2}, {3,4} };
	        C. long[][] arr=new long[2][] { {1,2}, {3,4} }; (correct) is would be compile error
	        D. int[][] arr ={ {'A', 'B'}, {'C' , 'D' } };
	            
	     [index num of single dimentional array][index num of elemnts in 1D array
	     */
	        
	    int[][] arr3=new int[2][];
	    System.out.println(Arrays.deepToString(arr3));
	   // long[][] arr9=new long[2][] { {1,2}, {3,4} };error
	  //  we cannot inisialice size then assign the value
	    char a='l';
	    int a2='l';
	    long a3=a2;
	   // int a4=a3;
	    //byte<short <int <long < float < double.
	     int[][] arr00 ={ {'A', 'B'}, {'C' , 'D' } };//it works fine no complile error
	    float a09=10;
	    double b1=a09;
	   // int z = a09;//error
	    int z=(short)a09;//first ww need to convert it to short
	    /*
	     
	     
	     3. what's the result of the following code fragment?
	                int[][] arr= { {1,2,3}, {3,4} };
	            for(int i=0; i<2; i++) {
	                for(int j=0; j<2; j++) {
	                    System.out.println(arr[i][j]+" ");
	                }
	            }
	            
	            A.  1 2 3 3 4                             B. 1 2 3 4 (correct)
	            C.  1 2 3                                 D. Throws an Exception
	            E. Compile Error
	     
	     */
	    int[][] arrz1= { {1,2,3}, {3,4} };
        for(int i=0; i<2; i++) {//i=0, i=1;
            for(int j=0; j<2; j++) {//j=0, j=1;
                System.out.print(arrz1[i][j]+" ");//[0][0] [0][1]   [1][0]  [1][1]
            }                                       //it will print 1,2,3,4
        }
	    
	        
	    
	    
	    /*
	     
	      4. Which Three lines fail to compile?
	            1   int ivar = 100;
	            2   double dvar = 123;
	            3   float fvar = 200; 
	            4       ivar = fvar;//error because we cant store float to int
	            5       fvar = ivar;//compile
	            6       dvar = fvar;//compile
	            7       fvar = dvar;//error we cant store double to float
	            8       dvar = ivar; //compile
	            9       ivar = dvar;//error
	            
	        A. line 3, line 5, line 8                        B. line 4, line 7, line 9  (correct)
	        C. line 5, line 6, line 9                        D. line 4, line 5, line 8
	     
	     */
	    long a0=10l;
	    double g=10L;
	    float f1=10f;
	    double d1=10f;
	        
	    
	    
	    /*
	     5. Which code fragment, when inserted at line 3, enables the code to print 10:20?
	            public static void main(String[] args) {
	            
	                 line 3 **
	                 arr[0]=10;
	                 arr[1]=20;
	                 System.out.println(arr[0]+" "+ arr[1]); 
	            }
	            
	            A. int arr[2] ;                           B. int[] arr n = new int[2];
	            C. int[] arr;     arr = int[2];           D. int arr[] = new int[2];  (correct)
	 
	     
	     */
	   int [] array;
	   array=new int [2];
	    
	    arr[0]=10;
        arr[1]=20;
        System.out.println(arr[0]+" "+ arr[1]); 
	    
	    
	     /*
	            6.  What's the result?
	            public static void main(String[] args) {
	        
	                    System.out.println("Result A"+0+1);
	                    System.out.println("Result B"+(1)+(2));
	                    
	                }
	        A. ResultA01     ResultB12   (correct)                  B. ResultA01     ResultB3
	        C. ResultA1      ResultB3                      C. ResultA1      ResultB12
	      
	      */
        System.out.println("Result A"+0+1);
        System.out.println("Result B"+(1)+(2));
	        
	    
	    
	    
	      /*
	                7.  What's the result?
	                
	                public static void main(String[] args) {
	        
	                        System.out.println("5 + 2 = "+3+4);
	                        System.out.println("5 + 2 = "+(3+4));
	                        
	                    }
	            
	            A. 5 + 2 = 34     5 + 2 = 7  (correct)          B. 5 + 2 = 34    5 + 2 =34
	            C. 7 = 7        7 + 7                  D. 5 + 2 = 3 + 4     5 + 2 = 7
	       
	       
	       */
	    
	    
	    
	    
	      
	       /*
	          8. What's the result?
	          
	            public static void main(String[] args) {
	                    String str = " ";
	                        str.trim();
	                    System.out.println(str.equals("") +"   "+str.isEmpty());    
	                }
	                
	           A. false     true                    B. true    true
	           C. false     false  (correct)        D. true    false
	     
	     
	       */
        String str = " ";
        str.trim();
    System.out.println(str.equals("") +"   "+str.isEmpty()); 
	        
	    
	    
	        
	        /*
	            9. what's the result ?
	                    public static void main(String[] args) {
	                            int[][] arr=  { {1,2}, {3,4} };
	                            for(int i=arr.length-1; i>=0; i-- ) {
	                                for(int j=0; j<arr.length; j++) {
	                                    System.out.println(arr[i][j]+" ");
	                                }
	                            }
	                        }
	                        
	            A.  3 4 1 2 (correct)               B. 1 2 3 4
	            C.  4 3 2 1                         D. 2 1 3 4
	            
	         
	         */
    int[][] arry=  { {1,2}, {3,4} };
    for(int i=arry.length-1; i>=0; i-- ) {//i=1 i=0
        for(int j=0; j<arry.length; j++) {//j=0  j=1;
            System.out.println(arry[i][j]+" ");//[1][0]  [1][1]   [0][0]  [0][1]
        }                                      //   3       4        1       2
    }
	    
	    
	        
	        /*
	             10. Which statement is true about Java byte code?
	                  A.  it can run on any platform.
	            
	                  B. it can run on any platform only if it was compiled for that platform.
	            
	                  C. It can run on any platform that has the Java Runtime Environment.(correct)
	            
	                  D. It can run on any platform that has a Java compiler.
	                  
	         
	         */

	}

}
