abstract class DataExporter{
    abstract void prepareData();
    abstract void exportData();
    abstract String getFileExtension();
    void showExportStatus(){
        System.out.println("Export operation completed");
    }
}
class CSVEporter extends DataExporter{
    void prepareData(){
        System.out.println("Preparing data for csv");

    }
    void exportData(){
        System.out.println("Exporting data to csv");
    }
    String  getFileExtension(){
        return "csv";
    }

public static void main(String args[]){
    CSVEporter c1=new CSVEporter();
    c1.prepareData();
    c1.exportData();
    c1.showExportStatus();
    System.out.println(c1.getFileExtension());
}
}



