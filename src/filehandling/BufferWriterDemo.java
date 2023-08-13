package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
        FileReader fileReader= null;
        try {
            fileWriter= new FileWriter("Sample1.txt");   //Character stream
            fileWriter.write("I am in Pune");
            System.out.println("File Write Successfully");

        }catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();

            }catch (IOException e){
                throw  new RuntimeException(e);
            }
        }

        try{
            fileReader= new FileReader("Sample1.txt");
           int i =  fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i=fileReader.read();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
            }catch (IOException e){
                throw  new RuntimeException(e);

            }
        }

    }
}