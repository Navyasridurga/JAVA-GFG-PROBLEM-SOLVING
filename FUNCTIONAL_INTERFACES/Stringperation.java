/**
 * StringOperation
 */
interface StringOperation {
String convert(String text);
    
}
public class Stringperation{
    public static void main(String[] args) {
        StringOperation s=(text)->text.toUpperCase();
        System.out.println(s.convert("navya"));

    }
}