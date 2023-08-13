package filehandling;

import java.io.*;

public class BufferOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("C:/Users/Shraddha/IdeaProjects/untitled/src/filehandling/sample.txt");
        try
            {
                FileOutputStream obj =new FileOutputStream(file);
                BufferedOutputStream bufferOutputStream = new BufferedOutputStream(obj);
                String str="Welcome";
                bufferOutputStream.write(str.getBytes());
                bufferOutputStream.close();
                obj.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            int i= bufferedInputStream.read();
            while (i > 0) {

                System.out.println((char) i);
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();

        }catch (IOException e){
            throw  new RuntimeException(e);
        }

            }
}
