class GenericBox<T>{
    private T data;

 
public  GenericBox( T data){
    this.data=data;
}
public void setData(T data){
    this.data=data;
}
public T getData(){
    return data;
}
}
 class GenericBoxDemo{
    public static void main(String args[]){
        GenericBox<String>g1=new GenericBox<>("navya");
        GenericBox<Integer>g2=new GenericBox<>(100);
        System.out.println(g1.getData());
        System.out.println(g2.getData());
        g1.setData("sri");
        System.out.println(g1.getData());



    }
}

