import java.util.Scanner;
class Kelipatan{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int b = p.nextInt();
        boolean kelipatan = a%b == 0 || b%a == 0;

        System.out.println("apakah " + a + " kelipatan dari " + b + kelipatan);

        }
    }