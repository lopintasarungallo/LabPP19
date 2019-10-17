import java.util.Scanner;
class Latihan6{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [][] array = new int [n][n];

        for ( int i = 0; i < n ; i++){
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
                
            }
        }
        for (int i = 1; i < array.length-1; i++) {
            for (int j = 1; j < array.length-1; j++) {
                if(array[i][j]==0){
                    if(array[i][j]!= array[i][j-1] && array[i][j] != array[i][j+1] && array [i][j] != array[i-1][j] && array[i][j] != array[i+1][j]){
                        System.out.println(i+ "," +j);

                    }
                }
                
            }
            
        }        
    }
}