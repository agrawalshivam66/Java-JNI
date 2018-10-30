import java.io.*;
import java.util.*;
public class javatoc {


   
    public static void main(String[] args) throws Exception{
        funName();
    }

    public static void funName() throws Exception{
	
  Scanner sc = new Scanner(new File("cfile.c"));
    while(sc.hasNext()){
        String s = sc.next();
        if ((s.trim()).equals("Method:")){
        System.out.println(sc.next());
    }
}
sc.close();

        }
    }
