import java.util.*;

class Nomor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o = 0;
        int p = 0;

        int matrix[][] = new int[n][n];

        // input element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // segitiga atas
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    o++;
                }
            }
        }
        
        // segitiga bawah
        // membalik matriks untuk di cek dengan posisi yang sama
        // dengan segitiga atas
        // dengan cara transpose > balik 180 > transpose > balik 180
        for (int i = 0; i < n; i++) { 
            for (int j = i; j < n; j++) { 
                int t = matrix[i][j]; 
                matrix[i][j] = matrix[j][i]; 
                matrix[j][i] = t; 
            } 
        }

        for (int i = 0; i < n; i++) { 
            for (int j = 0, k = n - 1; j < k; j++, k--) { 
                int t = matrix[j][i]; 
                matrix[j][i] = matrix[k][i]; 
                matrix[k][i] = t; 
            } 
        } 

        for (int i = 0; i < n; i++) { 
            for (int j = i; j < n; j++) { 
                int t = matrix[i][j]; 
                matrix[i][j] = matrix[j][i]; 
                matrix[j][i] = t; 
            } 
        }

        for (int i = 0; i < n; i++) { 
            for (int j = 0, k = n - 1; j < k; j++, k--) { 
                int t = matrix[j][i]; 
                matrix[j][i] = matrix[k][i]; 
                matrix[k][i] = t; 
            } 
        }

        // pengecekan matriks segitiga bawah
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    p++;
                }
            }
        }

        System.out.println("-------");
        if (o != 0 && p != 0) {
            System.out.println("Bukan matriks segitiga atas atau bawah");
        } else if (o == 0) {
            System.out.println("Matriks segitiga atas");
        } else if (p == 0) {
            System.out.println("Matriks segitiga bawah");
            }    
        sc.close();
    }   
}