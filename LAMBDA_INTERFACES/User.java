import java.util.function.Predicate;
import java.util.*;
public class User{
    String name,role;
    User(String a,String b){
        name=a;
        role=b;
    }
        String getRole(){
            return role;
        }
        String getName(){
            return name;
        }
        public String toString(){
            return "user name:"+name+",Role:"+role;
        }
        public static void main(String args[]){
            List<User>users=new ArrayList<>();
            users.add(new User("John","admin"));
            users.add(new User("Peter","member"));
            List admins=process(users,(User u)->u.getRole().equals("admin"));   
            System.out.println(admins);
        }
public static List<User> process(List<User> users, Predicate<User> predicate) {

    List<User> result = new ArrayList<>();

    for (User user : users) {

        if (predicate.test(user)) {
            result.add(user);
        }

    }

    return result;  // for loop bayata undali
}
}