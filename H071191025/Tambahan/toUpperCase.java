import java.util.*;

class toUpperCase {
    static String LowerToUpper(String s){
        String result = " ";
        char ch = ' '; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >='a' && s.charAt(i)<='z'){
                ch = (char)(s.charAt(i) - 32 );
            } else {
                ch = (char)(s.charAt(i));
            }
            result += ch;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String text = sc.nextLine();
        System.out.println(LowerToUpper(text));
    }
}