package prac14.num_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checkplus {
    public static void main(String[] args) {
        String text1 = "(1 + 8) – 9 / 4";
        String text2 = "6 / 5 – 2 * 9";
        String regex = "\\d+(?!\\s*\\+)";
        System.out.println("Text 1 is valid: " + checkExpression(text1, regex));
        System.out.println("Text 2 is valid: " + checkExpression(text2, regex));
    }
    public static boolean checkExpression(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}

