import java.io.*;
import java.util.*;
public class cfg {


   
    public static void main(String[] args) throws Exception{
        funName();
    }

    public static void funName() throws Exception{
        int count = 0;
        String lines[] = new String[100];

	// parsing file to find the number of lines and storing lines
  Scanner sc = new Scanner(new File("cfile.cpp"));
    while(sc.hasNext()){
        count++;
        String s = sc.nextLine();
        lines[count]=s.trim();
    }
    sc.close();

       for(int i=1;i<=count;i++){
        System.out.println(lines[i]);
    }

    // initializing and declaring the matrix to 0
    int m[][] = new int[count][count];

    for(int i=0;i<count;i++){
        for (int j=1;j<count;j++)
        {
            m[i][j]=0;
        }
    }
      




        }
    }
