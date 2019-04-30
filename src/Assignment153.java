import java.util.Scanner;

public class Assignment153 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    String[] words = new String[size];
    for(int i=0; i < size; i++){
      words[i] = scan.next();
    }
    printUniqueWords(words);
  }
  
  public static void printUniqueWords(String[] words){
    //WRITE YOUR CODE HERE
    String temp = "";
    boolean unique;
    for(int i = 0; i < words.length; i++){
      unique = true;
      temp = words[i];
      for(int j  = 0; j <words.length;j++){
        if(i==j){
          
        }
        else if(temp.equals(words[j])){
          unique = false;
          
          
        }
        
      }if(unique == true){
        System.out.println(temp);
      }
    }
    
  }
}




