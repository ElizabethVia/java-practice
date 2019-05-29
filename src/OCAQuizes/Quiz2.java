package OCAQuizes;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		   
		   1. What's the result of the following code fragment? 

      String[][] arr= { { "A","B","C" }, { "D", "E" } };
      
             for(int i=0; i < arr.length; i++) {
             
                for(int j=0; j<arr[i].length; j++) {
                
                
                    System.out.print( arr[ i ][ j ] ) ;
                    
                        if(arr[ i ][ j ].equals("B")) {
                               break;
                                     }
                                     
                                     
                                  }
                                  
                            }
                            
		 
		 		A. ACDE					     		B. ABC
		 		C. ABDE	(correct)							D. Compile Error
		 		
		 */	
		  String[][] arr= { { "A","B","C" }, { "D", "E" } };
	     //            i<2
          for(int i=0; i < arr.length; i++) {//i=0;  i=1
                    //     j<3
             for(int j=0; j<arr[i].length; j++) {//0: j=0, j+1 , j=2  1: j=0 , j=1
             
             
                 System.out.print( arr[ i ][ j ] ) ;//[0][0]  A   [0][1] B
                 //i=0    AB
                 //i=1[i][0]D  [1][1]
                     if(arr[ i ][ j ].equals("B")) {
                            break;
                                  }
                                  
                                  
                               }
          }
	

		
		
		
		/*
		 		2. what is the result? 

              String[][] arr= { {"A","B","C"}, {"D","E"} };
              
                for(int i=0; i<arr.length; i++) {
                
                    for(int j=0; j<arr[i].length; j++) {
                    
                         if(arr[i][j].equals("B")) {
                                   break;
                                     }
                                     
                      System.out.print(arr[i][j]);
                           }
               }
                	
             A. ADE	(Correct)							B. ABDE      
		 		C. ACDE 							D. Compile Error
		 		
		 */
		System.out.println();
		int[] arr2= {1,2,3,4,5};
		for( int each:arr2) {
			if (each==3)continue; 
				
				System.out.println(each);
		}
				
		//return 
		/*
		 * System.out.println();
		 *  for(int i=0;i<2;i++) { 
		 *  for(int each:arr2) {
		 * System.out.println(each);
		 *  if(each==3)return;//123 } }
		 */
		
		
		/*
	     3. What's the result of the given code fragment? 

                         int wd=0;
     		String[] days= {"sun","mon","wed","sat"};
     		
               for(int i=0; i<days.length; i++) {
               
                   switch (days[i]) {
                           case "sat": 
                           case "sun": 
                                         wd -=1;
                                         break;
                           case "mon": 
                                          wd++;
                           case "wed": 
                                         wd += 2; 
                                 }              
                                                                       
                            }
                                  
                    System.out.println(wd);
                    
         A. 0 									B. 4
         C. compile error						D. 3   (correct)        
	 
	 */
		System.out.println();
        int wd=0;
		String[] days= {"sun","mon","wed","sat"};
		
         for(int i=0; i<days.length; i++) {
         
             switch (days[i]) {//i=0: 0-1=-1  i=1:-1+1+2=2
                               //i=2: 2+2=4   i=3: 4-1=3
                     case "sat": 
                     case "sun": 
                                   wd -=1;
                                   break;
                     case "mon": 
                                    wd++;
                     case "wed": 
                                   wd += 2; //wd=wd+2;
                           }              
                                                                 
                      }
                            
              System.out.println(wd);
		
		boolean a=false;
		//switch(a){}; compile error
		
		
		
		
		
		/*
		 
		 4. what's the result of the given code fragment?

               int[] num1=new int[3];
               int[] num2= {1,2,3,4,5};
                    num1=num2;
          for(int i=0; i<num1.length; i++) {
                     System.out.print(num1[i]);
                 }
             
          A. 000								B. 12345(correct)
          C. Compile Error					D. 123
		 
		 
		 
		 */ //default: byte=0;, short=0,int=0, long=0, double=0.0, float=0.0; boolean=false;
//            default value of all wrapper classes and string =null;
        int[] num1=new int[3]; //[0,0,0]
        int[] num2= {1,2,3,4,5};
             num1=num2;
   for(int i=0; i<num1.length; i++) {
              System.out.print(num1[i]);
          }
		
		
		
		/*
		 	5. Given the code fragent:

                   int[] arr1 = {1,2,3,4,5};
                        for(  XXX ) {
                      System.out.print(arr1[e]);
                        }

				Which option can replace xxx to enable the code to print 135 ?
				
		 A. int e = 0;  e < 5;  e += 2                B. int e = 1;  e <= 5;  e += 1
		 C. int e = 0;  e <= 4;  e++                  D. int e = 1;  e  <  5;  e +=2
		 
		 
		 */
		
		
		
		
		/*
		   6. Which statement is true about the switch statement?

				A. It must contain the default section.
				
				B. The break statement, at the end of each case block, is mandatory.
				
				C. Its case label literals can be changed at run time.
				
				D. Its expression must evaluate to a single value.
		 
		 
		 */
		
		
		
		
		
		/*
		 7. Given the code fragment: 

                 int x=100;
                 int a=x++;
                 int b=++x;
                 int c=x++;

           int d=(a<b) ? (a < c) ? a : ( b<c )? b : c;
            System.out.println(d);

			what's the result?
			
			A.  Compilation fails                        B. 100
			C. 101 										 D. 102
			
		 */
		
		
		
		
		
		/*
		   8. Which method signature do you use at line 1?
		   
		   public static void main(String[] args) {
		   
					int[] numbers= {1, 2, 3, 4, 5};
					int max =findMax(numbers);
					
				}
				
				 		line 1     {
					int max =0;
					return max;
							
				}
				
				A.  static int findMax (int[] numbers)
				B.  public int findMax (int[] numbers)
				C.  static int[] findMax (int max)
				D.  static int findMax (int numbers)
		   		
		   
		 */
		
		
		/*
		 	9. What's the result of the following code fragment?
		 				public static void main(String[] args) {
								int num = 10;
								add10(num);
								System.out.println(num);
								
							}
							public static void add10(int num) {
								num=num+10;
										
							}
		 	
			A. 0							B. 10
			C. compile error				D. 20

		 
		 */
		
		

	}
}
		

	






