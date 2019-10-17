import java.util.Scanner;
class Latihan4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sama = false;
        int n = sc.nextInt();
        int[] array = new int[n];

        for ( int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        boolean hasSameValue = false;
        int j, batas = n - 1;
        for ( int i = 0; i < array.length; i++){
            j = 1;
            j+= i;
            for ( int a = 0; a < batas; a++){
                if ( array[i] == array[j] || array[j] == array[i]){
                    sama = true;
                    hasSameValue = true;
                    System.out.printf("Terdapat angka yang sama yaitu %d yang terletak di Index %d,%d\n", array[i],i,j);
                    break;
                } else if ( array[i] != array[j]) {
                    sama = false;
                }
                j++;
            }
            batas--;
        }
        if(!hasSameValue){
            System.out.println( "tidak ada nilai yang sama");
        }

        
        
    }
}