package filehandling;

import java.io.*;

public class SquentialStreamDemo {


    public static void main(String[] args) {
        try {


        FileInputStream fileInputStream = new FileInputStream("/C:/Users/Shraddha/IdeaProjects/untitled/src/filehandling/sample.txt");
        FileInputStream fileInputStream1 =new FileInputStream("/C:/Users/Shraddha/IdeaProjects/untitled/src/filehandling/sample3.txt");
            SequenceInputStream sequenceInputStream= new SequenceInputStream(fileInputStream,fileInputStream1);
            int i= sequenceInputStream.read();  //read
            while (i>0){
                System.out.print((char) i);
                i= sequenceInputStream.read();
            }
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
        try {


        FileOutputStream fileOutputStream1= new FileOutputStream("/C:/Users/Shraddha/IdeaProjects/untitled/src/filehandling/sample.txt");
        FileOutputStream fileOutputStream2= new FileOutputStream("C:/Users/Shraddha/IdeaProjects/untitled/src/filehandling/sample3.txt");
          ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
          String str= "I am Indian";
          byte[] arr= str.getBytes();
          byteArrayOutputStream.write(arr);
          byteArrayOutputStream.writeTo(fileOutputStream1);
          byteArrayOutputStream.writeTo(fileOutputStream2);

        } catch (IOException e){
            throw  new RuntimeException(e);
        }

    }
}
