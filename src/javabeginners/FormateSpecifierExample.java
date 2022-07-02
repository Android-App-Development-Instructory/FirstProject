
package javabeginners;

public class FormateSpecifierExample {
    
    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        short s = 32677;
        int  i = 123445;
        float f = 20.2f;
        double d = 10.27657659785765;
        
        System.out.printf("Boolean b = %b\n",b);
        System.out.printf("Char c = %c\n",c);
        System.out.printf("Short s = %d\n",s);
        System.out.printf("Int i = %d\n",i);
        System.out.printf("Float f = %.3f\n",f);
        System.out.printf("Doble d = %.2f\n",d);
        
    }
    
    
}
