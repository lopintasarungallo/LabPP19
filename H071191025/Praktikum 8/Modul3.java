import java.io.*;
import java.util.Scanner;

class RL8Tugas3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nama file
		String filename = sc.next() + ".txt";

		// Banyak inputan
		int n = sc.nextInt();

		// Init
		String name[] = new String[n];
		String id[] = new String[n];
		int year[] = new int[n];
        for (int i = 0; i < n; i++) {
			// Nama: kalo ada spasi pake underscore (replace underscore jadi spasi)
			// Nama: Max 20
			String nameTemp = sc.next().replaceAll("_", " ");
			name[i] = nameTemp.substring(0, Math.min(nameTemp.length(), 20));
			// NIM: Max 10
			id[i] = sc.next().substring(0, 10);
			// Angkatan
			year[i] = sc.nextInt();
		}

		// Buka file
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(filename);
			PrintWriter writer = new PrintWriter(out);

			// Tulis file
			writer.println("+----------------------+------------+----------+");
			writer.println("| Nama                 | NIM        | Angkatan |");
			writer.println("+----------------------+------------+----------+");
			for (int i = 0; i < n; i++)
				writer.printf("| %-20s | %-10s | %-8d |\n", name[i], id[i], year[i]);
			writer.println("+----------------------+------------+----------+");

			// Selesai
			writer.flush();
			System.out.println("Berhasil");
		} catch (IOException e) {
			System.out.println("Gagal");
		} finally {try {
            if (out != null) out.close();
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
}