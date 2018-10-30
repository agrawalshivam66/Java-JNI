import java.io.*;
import java.util.*;
public class javatoc {

    public native int intMethod(int n);
    public native boolean booleanMethod(boolean bool);
    public native String stringMethod(String text);
    public native int intArrayMethod(int[] intArray);
   
    public static void main(String[] args) throws Exception{
        System.loadLibrary("javatoc");
        javatoc javatoc = new javatoc();
        int square = javatoc.intMethod(5);
        System.out.println("the square of 5 is "+ square);
        System.out.println("\n");
        System.out.println("------------");
        funName();
    }

    public static void funName() throws Exception{

	System.out.println("The Name of functions are -");
  Scanner sc = new Scanner(new File("javatoc.h"));
    while(sc.hasNext()){
        String s = sc.next();
        if ((s.trim()).equals("Method:")){
        System.out.println(sc.next());
    }
}
sc.close();

        }
    }
