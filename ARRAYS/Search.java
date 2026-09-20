public class Search {
    String search(int prodId[]){

        for(int i=0;i<prodId.length;i++){
            if(prodId[i]==302){
                return "dorikindi atma lingam dorikindi";
            }
        }
        
            
                return "dorakaledu";
            }
        public static void main(String[] args) {
       int prodId[]={101,205,302,450,501};
       Search s1=new Search(); 
       System.out.println(s1.search(prodId));
    }
    
}
