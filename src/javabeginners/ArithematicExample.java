
package javabeginners;

import java.util.Scanner;

public class ArithematicExample {
    
    public static void main(String[] args) {
        
        int num1, num2, result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st Number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter 2nd Number: ");
        num2 = sc.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum = "+result);
        
        result = num1 - num2;
        System.out.println("Sub = "+result);
        
        result = num1 * num2;
        System.out.println("Multi = "+result);
        
        result = num1 / num2;
        System.out.println("Div = "+result);
        
        result = num1 % num2;
        System.out.println("Reminder = "+result);
        
    }
}
