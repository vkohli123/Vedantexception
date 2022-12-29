import java.io.*;
import java.util.Scanner;
class GFG{
    static int x;
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    x= sc.nextInt();
    if (x == 0) {
        try {
            throw new VedantException("This is Vedant exception");

        } catch (VedantException ve) {
            System.out.println("Caught the Vedant exception");
            // Print the message from MyException object
            System.out.println(ve.getMessage());
        }
    }else{
        System.out.println(25/x);
    }
}
}
