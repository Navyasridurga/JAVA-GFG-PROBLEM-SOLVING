abstract class FileProcessor {
    abstract void readFile();
    abstract void processFile();
    abstract void closeFile();

    
}
public class CSVFileprocessor extends FileProcessor{
    void readFile(){
        System.out.println("Reading CSV File");

    }
    void processFile(){
        System.out.println("processing csv file");
    }
    void closeFile(){
        System.out.println("File closed");
    }

    public static void main(String args[]){
      CSVFileprocessor c1=new CSVFileprocessor();
        c1.readFile();
        c1.processFile();
        c1.closeFile();
        
    }
}
