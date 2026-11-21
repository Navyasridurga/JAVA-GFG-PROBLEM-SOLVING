class Box1<T>{
    private  T data;

public void setData(T data){
    this.data=data;
}
public T getData(){
    return data;
}

public static void main(String args[]){
Box1<Integer> b1=new Box1<>();
b1.setData(10);
System.out.println(b1.getData());
Box1 <String> b2=new Box1<>();
b2.setData("Geeks for Geeks");
System.out.println(b2.getData());

}
}