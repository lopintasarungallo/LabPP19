import java.util.Scanner;
class Modul1{
    
    // Menghitung FPB
    static int menghitungFPB (int a, int b){
        int x;
        while (b !=0){
            x = a % b;
            a = b;
            b =x;
        }
        return a;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 0 ){
            System.out.println("inputan tidak valid");
            return;
        }
        int b = sc.nextInt();
        if (b <= 0){
        System.out.println("inputan tidak valid");
           return;
        }
        System.out.println("FPB dari " + a + " dan " + b + " = " + menghitungFPB(a,b)) ;

    }
}
