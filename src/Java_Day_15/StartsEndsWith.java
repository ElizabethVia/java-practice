package Java_Day_15;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String word1="eclipse";
       //startsWith test if string starts with another string
       System.out.println(word1.startsWith("e"));//true
       System.out.println(word1.startsWith("ec"));//true
       System.out.println(word1.startsWith("ecli"));//true
       System.out.println(word1.startsWith("Ec"));//false
       System.out.println(word1.endsWith("e"));//true
       System.out.println(word1.endsWith("ipse"));//true
       System.out.println(word1.endsWith("java"));//false
                               //ECLIPSE           PSE
       System.out.println(word1.toUpperCase().endsWith("PSE"));
       
       //MS.==>male  Mrs.==>married female  Ms.==> single women  Dr.==>Doctor man or woman
       //==>Unknown status
       String name = "Mr. Jackson";
        if (name.startsWith("Mr.")) {
        	System.out.println("man");
        }else if(name.startsWith("Mrs")){
        
        System.out.println("married women");
        }else if(name.startsWith("Ms.")) {
        	System.out.println("some women");
        }else if(name.startsWith("Dr.")) {
        	System.out.println("Doctor");
        		
        	}else {
        		System.out.println();
        	}
        }
       
       
       
	}


