
package javabeginners;

public class UnaryExample {
    public static void main(String[] args) {
        int x = 20;
        int y;
        int result;
        
        result = +x; 
        System.out.println("X = "+result);
        
        result = -x;
        System.out.println("X = "+result);
        
        
        
        y = x++; // x = x+1; post-increment
        
        System.out.println("Y = "+y);
        
        y = x;
        
        System.out.println("Y = "+y);
        
        y = ++x; // x = x+1 pre-increment
        
        System.out.println("Y = "+y);
    }
}
