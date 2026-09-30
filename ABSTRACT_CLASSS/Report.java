abstract class Report{
    abstract void  generate();
    abstract  void export();
}
class PDFReport extends Report{
    void generate(){
        System.out.println("Generating PDF report");
    }
    void export(){
        System.out.println("Exporting PDF report");
    }
    public static void main(String args[]){
        PDFReport r1=new PDFReport();
        r1.generate();
        r1.export();
    
    }
}