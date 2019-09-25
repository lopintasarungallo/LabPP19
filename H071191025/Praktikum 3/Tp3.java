import java.util.Scanner;
class Tp3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = 0;
        int b = 1;
        int d;
        int x = sc.nextInt();
        System.out.print(a + " " + b + " ");

        for (int i=0; i<x-2 ; i++){
            System.out.print((a + b)+" ");
            d = a;
            a = b;
            b = d + b;

        } 
    }
}

