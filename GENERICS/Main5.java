interface Converter<T>{
    void  convert(T value);

    
}
class CelciusConverter implements Converter<Double>{
    @Override
    public void convert(Double value){
        double fahrenheit=(value*9/5)+32;
        System.out.println("value:"+fahrenheit);

    }

} 
public class Main5{
    public static void main(String args[]){
        CelciusConverter c1=new CelciusConverter();
        c1.convert(45.2);
        
    }
}