package Scanner;

import java.util.Scanner;

public class Test1 {
	 public static void main(String[] args) { 
         Scanner s = new Scanner(System.in); 
         System.out.println("Input something"); 
         while (true) { 
                 String line = s.nextLine(); 
                 if (line.equals("exit")) break; 
                 System.out.println(">>>" + line); 
         } 
         s.close();
	 }
}
