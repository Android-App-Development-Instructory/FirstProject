
package javabeginners;

import java.util.Scanner;

public class TemperatureExample {
    public static void main(String[] args) {
        
        double cel,farn;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter celcius: ");
        cel = sc.nextDouble();
        
        farn = 1.8 * cel + 32;
        
        System.out.println("Temperatue in Farenhit: "+farn);
        
    }
}
