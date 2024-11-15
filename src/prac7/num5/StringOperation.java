package prac7.num5;

public interface StringOperation {
    static int countchar(String str){
        return str.length();
    }
    static String getIndex(String str){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (i % 2 == 1){
                res.append(str.charAt(i));;
            }
        }
        return res.toString();
    }
    static String InvertedString(String str){
        StringBuilder res = new StringBuilder(str);
        res.reverse();
        return res.toString();
    }
}
