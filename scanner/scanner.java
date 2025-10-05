package scanner;

import java.util.Scanner;


public class scanner {

  public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("what's ur name? ");
        String name = scanner.nextLine();
        
        System.out.printf("Hello %s. How old are you? ",name);
        
        int age = scanner.nextInt();

        System.out.printf("%d is a good age for coding. ",age);
        
        scanner.close();
  }
}
