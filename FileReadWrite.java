package fileio;

import java.lang.*;
import java.io.*;

public class FileReadWrite {
  
    private File file;
    private FileWriter writer;
    private FileReader reader;
    private BufferedReader bfr;

    public void writeFile(String s)
    {
      try
       {
         file=new File("fileio/History.txt");
         file.createdNewFile()
         writer= new FileWriter(file, true);
         writer.write(s+"\r"+"n\");
         writer.flush();
         writer.close();
       }
       catch(IOException ioe)
       {
         ioe.printStackTrace();
       }
}

public void readFile()
{
 try
  {
    reader= new FileReader(file);
    bfr= new BufferedReader(reader);
    String text= " ", temp;

    while(( temp=bfr.readLine())!=0)
    {
      text=text+temp+"\n"+"\r";
    }

    System.out.println(text);
    reader.close();
  }
   catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
}