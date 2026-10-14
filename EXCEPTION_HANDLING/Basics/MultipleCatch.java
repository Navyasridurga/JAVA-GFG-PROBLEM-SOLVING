public class MultipleCatch{

    public static void main (String args[]){
        int arr[]={10,20,30};
        try{
        System.out.println(arr[9]);
        int result=10/0;
        System.out.println(result);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Cannot be divide zero");
        System.out.println("array index out out bound");
    }

    }
}

    

