package filehandling;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class PdfGeneration {
    public static void main(String[] args) {
        Document document=new Document();
        try{
            PdfWriter writer= PdfWriter.getInstance(document,new FileOutputStream("hello Word.pdf" ));
            document.open();
            document.add(new Paragraph("Hello Word Pdf"));
            document.close();
            writer.close();
        }catch (DocumentException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
