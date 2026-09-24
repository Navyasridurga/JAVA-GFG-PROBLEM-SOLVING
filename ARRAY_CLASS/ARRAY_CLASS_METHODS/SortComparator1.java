import java.util.Arrays;
import java.util.Comparator;
public class SortComparator1 {
    public static void   main(String args[]){
        String names[]={"navya","sri","durga","kasa"};
        Arrays.sort(names,1,4,Comparator.reverseOrder());
        System.out.println(Arrays.toString(names));

    }
    
}
