import java.util.Scanner;
public class Shopping_Cart {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int product;
    String items[]=new String[5];
    int index=0;
    String user;
    do{
        System.out.println("Do you want another Product");
        System.out.println("yes or no");
        user=sc.next();
        
        if(user.equals("yes")){
            System.out.println("select the product");
            System.out.println("These are the following items");
            System.out.println("1.Vegetables,2.Books,3.snacks");
            System.out.println("enter number");
        

        product=sc.nextInt();
        switch(product){
            case 1:
               // System.out.println("vegetables");
               items[index]="Vegetables";
               index++;

            break;
            case 2:
                //System.out.println("Books");
                items[index]="Books";
                index++;
            break;
            case 3:
                //System.out.println("snacks");
                items[index]="snacks";
                index++;
            break;
            default:
                System.out.println("Invalid Product");

        }
        }
      
    }
    while(user.equals("yes"));
    System.out.println("Your cart");
    for(int i=0;i<index;i++){
        System.out.println(items[i]);
    }
            System.out.println("Thank you so much for visiting");
        }
    }

    


    
        
  

