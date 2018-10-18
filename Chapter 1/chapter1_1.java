import java.util.Scanner;

public class chapter1_1 {
  public static void main(String [] args){
    //determine if a string uses unique characters without using additonal data structures
    Scanner ki = new Scanner(System.in);  // Reading from System.in
    System.out.print("Enter a String: ");
    String input = ki.next();
    boolean isUnique = true;
    for(int x=0; x<input.length(); x++){
      for(int y=0; y<input.length(); y++){
        if(x!=y && input.charAt(x) == input.charAt(y))
          isUnique = false;
      }
    }
    
    if(isUnique){
    System.out.println("\""+ input + "\" IS unique");
    } else{
    System.out.println("\"" + input +"\" is NOT unique");
    }
  }
  
  
  
}