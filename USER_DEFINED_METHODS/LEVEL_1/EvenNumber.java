class EvenNumber{
    void printEvenNumber(){
        for(int i=2;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        EvenNumber e1=new EvenNumber();
        e1.printEvenNumber();
    }
}