package PatternClasses.MatcherClasses;

import java.util.regex.*;

public class Problem5 {

    public static void displayNumbers(String input) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println(
                "Number: " + m.group()
                + ", Length: " + m.group().length()
            );
        }
    }

    public static int countNumbers(String input) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(input);

        int count = 0;

        while (m.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Navya123Sri234Durga123";

        displayNumbers(input);

        int total = countNumbers(input);
        System.out.println("Total groups: " + total);
    }
}