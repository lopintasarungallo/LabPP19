import java.util.Scanner;
class TPratikum2{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int detik = sc.nextInt();
        int jam = detik/3600;
        int sisaDetik = detik%3600;
        int menit = sisaDetik/60;
        int detikk = sisaDetik%60;

        System.out.println(jam + ":" + menit + ":" + detikk);
    
    }
}