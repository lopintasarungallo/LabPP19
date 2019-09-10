import java.util.Scanner;
class TPratikum3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float h = input.nextFloat();
        float a = input.nextFloat();
        float b = input.nextFloat();

        double sudut = Math.tan(Math.toRadians(a));
        double alas = sudut*h;
        double sudut2 = Math.tan(Math.toRadians(b));
        double alas2 = sudut2*h;
        double panjang = alas-alas2;

        System.out.printf("Panjang Kapal = %.2f m", panjang); 
    }
}
