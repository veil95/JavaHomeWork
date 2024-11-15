package prac8;

public class Palindrom_num8 {
    public static boolean IsPolindrome(String word, int start, int end){
        if (start >= end){
            return true;
        }
        if (word.charAt(end) != word.charAt(start)){
            return false;
        }
        return IsPolindrome(word,start + 1,end - 1);
    }
    public static void main(String [] args){
        String word = "racecar";  // Слово для проверки
        if (IsPolindrome(word, 0, word.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
