import java.util.Random;
import java.util.Scanner;

class Modul2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String SerialNumber = generateSerial (n,m);
        System.out.println(SerialNumber);
    }
    public static String generateSerial( int n, int m ) {
        Random angka = new Random();
        String lopss = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                lopss += (char)(angka.nextInt(9) + '0');
            }
            if (i<n-1){
                lopss += '-';
            }
        }
        return lopss;
    }
}