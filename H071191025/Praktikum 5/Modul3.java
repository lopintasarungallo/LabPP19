import java.util.Scanner;
class Modul3{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int usia = sc.nextInt();

    tahun(usia);
    bulan(usia);
    tahun(usia);

    System.out.println(tahun(usia) + " tahun ");
    System.out.println(bulan(usia) + " bulan ");
    System.out.println(hari(usia) + " hari ");

    }
    static int tahun(int usia){
        int tahun = usia/365;
        return tahun;
    }
    static int bulan(int usia){
        int bulan = (usia%365)/30;
        return bulan;
    }
    static int hari (int usia){
        int hari = (usia%365)%30;
        return hari;
    }
}