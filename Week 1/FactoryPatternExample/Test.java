package FactoryPatternExample;
//The Document is product
interface Document {
    void open();
    void edit();
    void save();
    void close();
}
// Creating concrete Products 
class WordDocument implements Document{
    public void open(){
        System.out.println("Opening Word Document");
    }
    public void edit(){
        System.out.println("Doing some changes to the Word document");
    }
    public void save(){
        System.out.println("Saving Word Document");
    }
    public void close(){
        System.out.println("Closing Word Document");
    }
}
class PdfDocument implements Document{
    public void open(){
        System.out.println("Opening PDF Document");
    }
    public void edit(){
        System.out.println("Doing some changes to the PDF document");
    }
    public void save(){
        System.out.println("Saving PDF Document");
    }
    public void close(){
        System.out.println("Closing PDF Document");
    }
}
class ExcelDocument implements Document{
    public void open(){
        System.out.println("Opening Excel Document");
    }
    public void edit(){
        System.out.println("Doing some changes to the Excel document");
    }
    public void save(){
        System.out.println("Saving Excel Document");
    }
    public void close(){
        System.out.println("Closing Excel Document");
    }
}
// Creating Factory 
abstract class DocumentFactory {
    public abstract Document createDocument();
    
}
class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new WordDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new ExcelDocument();
    }
}


public class Test {
    public static void main(String[] args) {
        DocumentFactory wordFact = new WordDocumentFactory();
        Document wordDocument = wordFact.createDocument();
        DocumentFactory pdfFact = new PdfDocumentFactory();
        Document pdfDocument = pdfFact.createDocument();
        DocumentFactory excelFact = new ExcelDocumentFactory();
        Document excelDocument = excelFact.createDocument();
        wordDocument.open();
        wordDocument.edit();
        wordDocument.save();
        wordDocument.close();
        System.out.println();
        pdfDocument.open();
        pdfDocument.edit();
        pdfDocument.save();
        pdfDocument.close();
        System.out.println();
        excelDocument.open();
        excelDocument.edit();
        excelDocument.save();
        excelDocument.close();
    }
}
