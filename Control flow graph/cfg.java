import java.io.*;
import java.util.*;
public class cfg {


   
    public static void main(String[] args) throws Exception{
        funName();
    }

    public static void funName() throws Exception{
        int count = 0;
	
  Scanner sc = new Scanner(new File("cfile.cpp"));
    while(sc.hasNext()){
        count++;
        String s = sc.nextLine();
        System.out.print(count);
        System.out.println(" "+s);
    }
sc.close();

        }
    }
