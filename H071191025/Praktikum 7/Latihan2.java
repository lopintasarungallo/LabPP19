import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Latihan2 {
    public static void main(String[] args) {
        // input batas
        Scanner sc = new Scanner(System.in);
        System.out.print("Batas Bawah = ");
        int angka1 = sc.nextInt();
        System.out.print("Batas Atas = ");
        int angka2 = sc.nextInt();
        System.out.printf("Bilangan yang bisa dibagi dengan digitnya sendiri dari (%d) - (%d) adalah : \n", angka1,
                angka2);

        int digit;
        ArrayList<Integer> hasil = new ArrayList<>();
        int batasBawah = angka2 > angka1 ? angka1 : angka2;
        int batasAtas = angka2 > angka1 ? angka2 : angka1;

        // perulangan membagi dengan digit
        for (int angka = batasBawah; angka <= batasAtas; angka++) {
            HashMap<Integer, Integer> number = new HashMap<>();
            // menentukan digit
            int ko = angka;
            int aka = 0;
            while (Math.abs(ko) > 0) {
                digit = Math.abs(ko) % 10;
                ko = Math.abs(ko) / 10;
                number.put(aka, digit);
                aka++;
            }
            ko = angka;
            int digitYes = 0;
            // mengecek pembagian digit
            for (int k = 0; k < number.size(); k++) {
                if (number.get(k) != 0 && ko % Math.abs(number.get(k)) == 0) {
                    digitYes++;
                }
            }
            if (digitYes == aka) {
                hasil.add(ko);
            }
        }
        // menukar output jika inputnya tertukar
        if (angka1 > angka2) {
            Collections.reverse(hasil);
            System.out.print(hasil);
        } else {
            System.out.print(hasil);
        }

    }
}