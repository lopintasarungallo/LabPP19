import java.util.Scanner;
    class TPratikum1{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double efisiensi = 14;
    int waktutempuh = sc.nextInt();
    int percepatan = sc.nextInt();
    double hasil = (percepatan*waktutempuh)/efisiensi;

    System.out.printf("Bensin yang digunakan = %.3f L", hasil);
    }
}

    
    
