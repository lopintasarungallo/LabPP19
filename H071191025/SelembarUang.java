import java.util.Scanner;
class SelembarUang{
    public static void main(String[] args) {
c        Scanner sc = new Scanner(System.in);
        int U1=100000, U2=50000, U3=20000, U4=10000, U5=5000, U6=2000, U7=1000;

        int Sisa1, Sisa2, Sisa3, Sisa4, Sisa5, Sisa6;
        int uang1, uang2, uang3, uang4, uang5, uang6, uang7;
        System.out.print ("Masukkan jumlah uang : ");

        int uang = sc.nextInt();

        uang1 = uang/U1;
        Sisa1 = uang%U1;

        uang2 = Sisa1/U2;
        Sisa2 = Sisa1%U2;

        uang3= Sisa2/U3;
        Sisa3 = Sisa2%U3;

        uang4 = Sisa3/U4;
        Sisa4 = Sisa3%U4;

        uang5 = Sisa4/U5;
        Sisa5 = Sisa4%U5;

        uang6 = Sisa5/U6;
        Sisa6 = Sisa5%U6;

        uang7 = Sisa6/U7;

        System.out.println( "Jumlah Uang 100000 : "+ uang1 );
        System.out.println( "Jumlah Uang 50000 : "+ uang2 );
        System.out.println( "Jumlah Uang 20000 : "+ uang3 );
        System.out.println( "Jumlah Uang 10000 : "+ uang4 );
        System.out.println( "Jumlah Uang 5000 : "+ uang5 );
        System.out.println( "Jumlah Uang 2000 : "+ uang6 );
        System.out.println( "Jumlah Uang 1000 : "+ uang7 );
    }
}







