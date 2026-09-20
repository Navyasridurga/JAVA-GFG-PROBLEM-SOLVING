public class HightTemparature {
    int temparature(int [] temp){
        int highest=temp[0];
        for(int i=1;i<temp.length;i++){

           if(temp[i]>highest){
            highest=temp[i];
           }
           
        }
        return highest;

    }
    public static void main(String args[]){
        int []temp={32,35,31,38,36};
        HightTemparature h1=new HightTemparature();
       int result= h1.temparature(temp);
       System.out.println(result);
        
    }
    
}
