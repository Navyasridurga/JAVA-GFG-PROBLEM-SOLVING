import java.util.*;
class Employees{
    public static void main(String args[]){
        List<Integer> ls=Collections.synchronizedList(new ArrayList<>());
        ls.add(101);
        ls.add(102);
        ls.add(103);
        ls.add(104);
        ls.add(101);
      System.out.println(ls);
      System.out.println(ls.size());
      System.out.println("Is 101 exits:"+ls.contains(101));

}
}