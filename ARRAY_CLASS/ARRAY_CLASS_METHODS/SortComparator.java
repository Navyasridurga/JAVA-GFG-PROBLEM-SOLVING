import java.util.Arrays;
import java.util.Comparator;
public class SortComparator {
    public static void main(String args[])
    {
        String names[]={"navya","kasa","sri","lavaya"};
        Arrays.sort(names,Comparator.naturalOrder());
        System.out.println(Arrays.toString(names));
    }

}
