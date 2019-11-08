import java.util.HashMap;
import java.util.Scanner;
class MorseCode{
    public static void main(String[] args) {
        Scanner dn = new Scanner (System.in);
        String morse = dn.nextLine();
        HashMap<String, Character> code = new HashMap<>();

        String[] space = morse.split("\\s");

        code.put(".-", 'A');
        code.put("-...", 'B');
        code.put("-.-.", 'C');
        code.put("-..", 'D');
        code.put(".", 'E');
        code.put("..-.", 'F');
        code.put("--.", 'G');
        code.put("....", 'H');
        code.put("..", 'I');
        code.put(".---", 'J');
        code.put("-.-", 'K');
        code.put(".-..", 'L');
        code.put("--", 'M');
        code.put("-.", 'N');
        code.put("---", 'O');
        code.put(".--.", 'P');
        code.put("--.-", 'Q');
        code.put(".-.", 'R');
        code.put("...", 'S');
        code.put("-", 'T');
        code.put("..-", 'U');
        code.put("...-", 'V');
        code.put(".--", 'W');
        code.put("-..-", 'X');
        code.put("-.--", 'Y');
        code.put("--..", 'Z');

        for(String tes : space){
            code.get(tes);
            System.out.print(code.get(tes));
        }
    }
}