import java.util.Scanner;

class Latihan1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.nextLine();
        String stringPertama = " ";
        String stringKedua  = " ";

        if (a.length()%2 != 0){
            for (int i = 0; i < a.length()/2; i++) {
                stringPertama += a.charAt(i);
            }
            for (int i = a.length()/2; i < a.length(); i++) {
                stringKedua += a.charAt(i);
            } 
        } else {
            for (int i = 0; i < a.length()/2; i++) {
               stringKedua += a.charAt(i);
            }
            for (int i = a.length()/2; i < a.length(); i++) {
                stringPertama += a.charAt(i);
            }
        }
        String balik = " ";
        for (int i = a.length()/2; i >= a.length(); i--) {
            balik += a.charAt(i);
        }
        stringKedua = balik;
        char [] ls = stringPertama.toCharArray();
        for (int i = 0; i < ls.length; i++) {
            ls [i] = (char) (ls[i] + 3);
        }
        String stringKetiga = new String(ls);
            stringPertama = stringKetiga;
        

        System.out.println(stringPertama.toUpperCase() + stringKedua.toUpperCase());
    }
}