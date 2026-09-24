import java.util.Arrays;
public class Product_Price_Search {
    public static void main(String args[]){
        int [] prices={1200,450,890,2300,750,1500};
        int price_product=890;
        System.out.println(Arrays.binarySearch(prices,price_product));
        
    }
    
}
