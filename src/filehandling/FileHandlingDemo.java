package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file=new File("C:/Users/Shraddha/IdeaProjects/untitled/src/filehandling/sample.txt");
        try
        {

            FileOutputStream obj =new FileOutputStream(file);

           // for string
            String str="Welcome";
            byte[]arr=str.getBytes();//string is converted into byte code
            obj.write(arr);

            //for number
            obj.write(88);   //ascii values are display

        }catch (IOException ex){
            throw new RuntimeException(ex);
        }

        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            int i= fileInputStream.read();
            while (i>0){
                System.out.println((char) i);
                i=fileInputStream.read();
            }
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

}
