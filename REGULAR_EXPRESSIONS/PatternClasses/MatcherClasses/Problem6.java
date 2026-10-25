package PatternClasses.MatcherClasses;
import java.util.regex.*;
public class Problem6{
    public static void displayNumbers(String input){
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(input);
            while(m.find()){
                System.out.println(m.group());
            }
        }
        public static int largestNumber(String input){
            Pattern p=Pattern.compile("[0-9]+");
            Matcher m=p.matcher(input);
            int max=0;
            while(m.find()){
                int number=Integer.parseInt(m.group()){
                    if(number>max){
                        max=number;
                    }
                }
                return max;
            }
        }
    public static void main(String args[]){
        String input="AB45CD123EF9GH78";
        displayNumbers(input);
        int largest=largestNumber(input);
        System.out.println(largest);
    }
    }
    
   

