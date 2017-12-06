package com.dzpykj.common.utils;

import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class PDFUtil {
    public static void main(String[] args) {  
        try {  
            OutputStream file = new FileOutputStream(new File("F:\\Test.pdf"));
  
            Document document = new Document();
            PdfWriter.getInstance(document, file);
            document.open();
            document.add(new Paragraph("Hello ChaiXY"));
            String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:SSS").format(new Date());
            System.out.println(dateStr);
            document.add(new Paragraph(dateStr));
            document.close();
            file.close();
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
