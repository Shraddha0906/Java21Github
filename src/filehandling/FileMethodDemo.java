package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethodDemo {
    public static void main(String[] args) {
        File file= new File("Sample3.txt");
        try{


        if (file.exists()){
            System.out.println("File is already created");
        }
            else{
                Boolean f= file.createNewFile();
            System.out.println(f);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(file.isFile());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.compareTo(new File("sample12.txt")));
        System.out.println(file.getParent());
    }
}
