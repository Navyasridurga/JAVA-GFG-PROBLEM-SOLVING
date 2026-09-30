public class CodeProject {
    private String projectName;
    private  String language ;
    private int linesOfCode;

    public void setProjectName(String projectName){
        this.projectName=projectName;
    }
    public String getProjectName(){
        return projectName;
    }
    public void setLanguage(String language){
        this.language=language;
    }
    public String getLanguage(){
        return language;

    }
    public void setlinesOfcode(int linesOfCode){
       
        if(linesOfCode>=100){
            
            System.out.println("accept");
        }
        else{
            System.out.println("Poject is too small");
        }
         this.linesOfCode=linesOfCode;

        
    }
    public int getlinesOfCode(){
        return linesOfCode;
    }

    
}
