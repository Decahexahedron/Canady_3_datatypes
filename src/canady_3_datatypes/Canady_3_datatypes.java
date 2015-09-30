package canady_3_datatypes;
/**
 *
 * @author Decahexahedrpm
 */
public class Canady_3_datatypes {

    public static void main(String[] args) {
        //this is a comment
        //we will use many comments to explain our code
        //this program explores some of the primitive data types
        int i = 0;
        float a = 1.1111f;
        double b = 0.01;
        short c = 123;
        char d1 = ';';
        char d2 = 'a';
        char d3 = 42;
        char d4 = 145;
        String e = "Words";
        boolean f = true;
        boolean g = i % 2 == 0;
        
        /*
        here we will look at some mathematical operators
        */
        
        // + this adds two numbers and more
        // - this subtracts two numbers and more
        // * this multiplies two numbers and more
        // / this divides two numbers and more
        // % this is modulo, it shows the remainder
        
        System.out.println(i + " is an integer");
        System.out.println(a + " is a float");
        System.out.println(b + " is a double");
        System.out.println(c + " is a short");
        System.out.println(d1 + " is a char");
        System.out.println(d2 + " is a char");
        System.out.println(d3 + " is a char");
        System.out.println(d4 + " is a char");
        System.out.println(e + " is a string");
        System.out.println(f + " is a boolean");
        System.out.println(g + " is a boolean");
            for(i = -123; i < 123; i++){
                System.out.println((char) i);
            }
        // a number value for char
        // maps to a character
        i = 7;
        a = 0;
        e = "ninja";
        System.out.println(i + a + " is an integer plus a float");
        System.out.println(e + i + " is a string plus an integer");
        System.out.println(a + b + " is a float plus a double");
        System.out.println(b + c + " is a double plus a short");
        System.out.println(c + " is a short");
        
    }
    
}
