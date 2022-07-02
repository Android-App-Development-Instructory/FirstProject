
package javabeginners;

import java.util.Scanner;

/**
 * @Author
 * MD. AL-AMIN
 * Junior Software Engineer @Rokomari.com
 * Android APP Development Instructor @Instructory
 */

public class JavaBeginners {

    public static void main(String[] args) {
       
        
       int number1,number2;
       
       String name;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Plase type your name: ");
       name = sc.nextLine();
       
       System.out.println("Welcome, "+name);
       
       System.out.print("Plase 1st number: ");
       number1 = sc.nextInt();
       
       System.out.print("Plase 2nd number: ");
       number2 = sc.nextInt();
       
       System.out.println("Summation is: "+ (number1 + number2));
    }
    
}
