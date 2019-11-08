import java.io.*;
import java.util.Scanner;

class Modul1 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("Latihan.txt");
            out = new FileOutputStream("Latihan-1.txt");
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage()); // file not found
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    in.close();
                }
                System.out.println("Berhasil");
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}