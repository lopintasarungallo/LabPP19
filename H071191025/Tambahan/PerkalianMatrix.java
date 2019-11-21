import java.util.*;

class PerkalianMatrix {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        // input matrix 1
        System.out.println("Matrix 1 : ");
        System.out.print("Jumlas baris ==> ");
        int a = key.nextInt();
        System.out.print("Jumlas kolom ==> ");
        int b = key.nextInt();
        int matrix1[][] = new int[a][b];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix1[i][j] = key.nextInt();
            }
        }

        // input matrix 2
        System.out.println("Matrix 2 : ");
        System.out.print("Jumlah baris ==> ");
        int c = key.nextInt();
        System.out.print("Jumlas kolom ==> ");
        int d = key.nextInt();
        int matrix2[][] = new int [c][d]; key.nextLine();

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                matrix2[i][j] = key.nextInt();
            }
        }

        // input matrix 3
        System.out.println("Matrix 3 : ");
        System.out.print("Jumlah baris ==> ");
        int e = key.nextInt();
        System.out.print("Jumlas kolom ==> ");
        int f = key.nextInt();
        int matrix3[][] = new int [e][f]; key.nextLine();

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < f; j++) {
                matrix3[i][j] = key.nextInt();
            }
        }
        
        System.out.println("-----------------");
        // conditioning matrix 1 & 2
        if (b != c) {
            System.out.println("Matriks 1 X Matriks 2 ?");
            System.out.println("Matriks tidak dapat dikalikan");
        } else if (b == c) {
            int result12[][] = new int[a][d];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < d; j++) {
                    int z = 0;
                    for (int k = 0; k < b; k++) {
                        z += matrix1[i][k] * matrix2[k][j];
                    }
                    result12[i][j] = z;
                }
            }
            System.out.println("Matriks 1 X Matriks 2 ?");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.print(result12[i][j] + " ");
                }
                System.out.println();
            }
        }

        // conditioning matrix 1 & 3
        if (b != e) {
            System.out.println("Matriks 1 X Matriks 3 ?");
            System.out.println("Matriks tidak dapat dikalikan");
        } else if (b == e) {
            int result13[][] = new int[a][f];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < f; j++) {
                    int z = 0;
                    for (int k = 0; k < b; k++) {
                        z += matrix1[i][k] * matrix3[k][j];
                    }
                    result13[i][j] = z;
                }
            }
            System.out.println("Matriks 1 X Matriks 3 ?");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < f; j++) {
                    System.out.print(result13[i][j] + " ");
                }
                System.out.println();
            }
        }
        // conditioning matrix 2 & 3
        if (d != e) {
            System.out.println("Matriks 2 X Matriks 3 ?");
            System.out.println("Matriks tidak dapat dikalikan");
        } else if (d == e) {
            int result23[][] = new int[c][f];
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < f; j++) {
                    int z = 0;
                    for (int k = 0; k < d; k++) {
                        z += matrix2[i][k] * matrix3[k][j];
                    }
                    result23[i][j] = z;
                }
            }
            System.out.println("Matriks 2 X Matriks 3 ?");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < f; j++) {
                    System.out.print(result23[i][j] + " ");
                }
                System.out.println();
            }
        }
        // conditioning matrix 3 & 2
        if (f != c) {
            System.out.println("Matriks 3 X Matriks 2 ?");
            System.out.println("Matriks tidak dapat dikalikan");
        } else if (f == c) {
            int result32[][] = new int[e][d];
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < d; j++) {
                    int z = 0;
                    for (int k = 0; k < f; k++) {
                        z += matrix3[i][k] * matrix2[k][j];
                    }
                    result32[i][j] = z;
                }
            }
            System.out.println("Matriks 3 X Matriks 2 ?");
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.print(result32[i][j] + " ");
                }
                System.out.println();
            }
        }
        // conditioning matrix 3 & 1
        if (f != a) {
            System.out.println("Matriks 3 X Matriks 1 ?");
            System.out.println("Matriks tidak dapat dikalikan");
        } else if (f == a) {
            int result13[][] = new int[e][b];
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < b; j++) {
                    int z = 0;
                    for (int k = 0; k < f; k++) {
                        z += matrix3[i][k] * matrix1[k][j];
                    }
                    result13[i][j] = z;
                }
            }
            System.out.println("Matriks 3 X Matriks 1 ?");
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(result13[i][j] + " ");
                }
                System.out.println();
            }
        }
        key.close();
    }
}