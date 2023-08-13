package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
      FileReader filereader = null;
        try {
             fileWriter=new FileWriter("Sample1.txt");
            fileWriter.write("I am in pune");
            System.out.print("File Write Successfully");
        }catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
        try {
            filereader = new FileReader("Sample1.txt");
            int i=filereader.read();
            while(i>0){
                System.out.print((char) i);
                i = filereader.read();
            }

        }catch (IOException e){
          throw new RuntimeException(e);
        }finally {
            try{
                filereader.close();
            }catch (IOException e){
                throw  new RuntimeException(e);
            }

        }
  }

}
