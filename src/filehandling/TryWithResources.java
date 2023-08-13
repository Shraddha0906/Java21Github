package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {


    File file= new File("C:\\Users\\Shraddha\\IdeaProjects\\untitled\\src\\filehandling\\sample3.txt");
    try(FileOutputStream obj= new FileOutputStream(file)) {
        String str="welcome";
        obj.write(str.getBytes());

    }catch (IOException e){
        throw  new RuntimeException(e);
    }
    try (FileInputStream obj1=new FileInputStream(file)){
        int i= obj1.read();
        while (i>0){
            System.out.print((char) i);
            i= obj1.read();
        }
    }catch (IOException e){
        throw new RuntimeException(e);

    }
}
}