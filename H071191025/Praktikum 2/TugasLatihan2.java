import java.util.Scanner;
class TugasLatihan2{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int jam1 = sc.nextInt();
        int menit1 = sc.nextInt();
        int jam2 = sc.nextInt();
        int menit2 = sc.nextInt();
        int jam = (23-jam1)+jam2;
        int menit = (60-menit1)+menit2;
        if(menit>=60){
            menit=menit%60;
            jam++; 
        }
        if(jam>=24){
            jam=jam%24;
        }
        System.out.prinln(jam);
        System.out.println(menit);
    }
        
}