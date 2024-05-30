 

import java.io.*;
import java.util.*;

public  class CarAppQ{
    public static void main(String[] args)throws IOException
    {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("sampledata.txt"));
        Scanner in = new Scanner(System.in);
        Scanner inLine = new Scanner(System.in);
    
        
        Queue CarAppQ=new Queue();
        while((line = reader.readLine()) != null)
        {
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            
            
            String bookID = tokenizer.nextToken();
            String bookName = tokenizer.nextToken();
            String phone = tokenizer.nextToken();
            String carType = tokenizer.nextToken();
            String serviceType = tokenizer.nextToken();
        
            
            Carwash c=new Carwash(bookID,bookName,phone,carType,serviceType);
            CarAppQ.enqueue(c);
        
            
        }
            reader.close();
             Carwash c = (Carwash)CarAppQ.getFront();
                while(c != null)
                {
                    System.out.println(c.toString());
                    c = (Carwash)CarAppQ.getNext();
                }    

        }
    }