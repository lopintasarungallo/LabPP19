import java.util.Scanner;
class TPratikum2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("** menu **");
        System.out.println("1. Mencari Luas bangun datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan menu yang diinginkan");
        int a = sc.nextInt();

        switch (a){
            case 1  : 
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-Layang");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
                int b = sc.nextInt();
                
                switch (b){
                    case 1 :
                        System.out.println("input sisi");
                        int sisi = sc.nextInt();
                        System.out.println("luas persegi = " + (sisi*sisi));
                         break;
                    case 2 :
                        System.out.println("input panjang ");
                        int panjang = sc.nextInt();
                        System.out.println("input lebar");
                        int lebar = sc.nextInt();
                        System.out.println("luas persegi panjang =" + (panjang*lebar));
                        break;
                    case 3 :
                        System.out.println("input alas");
                        int alas = sc.nextInt();
                        System.out.println("input tinggi");
                        int tinggi = sc.nextInt();
                        System.out.println("luas segitiga = " + (alas*tinggi));
                        break;
                    case 4 :
                        System.out.println("input r");
                        int r = sc.nextInt();
                        System.out.println("luas lingkaran =" + (Math.PI*Math.pow(r,2)));
                        break;
                    case 5 :
                        System.out.println("input alas");
                        int alass = sc.nextInt();
                        System.out.println("input tinggi");
                        int tiinggi = sc.nextInt();
                        System.out.println("luas jajar genjang =" + (alass*tiinggi)/2);
                        break;
                    case 6 :
                        System.out.println("input sisi yang lebih panjang");
                        int sisiYangLebihPanjang = sc.nextInt();
                        System.out.println("input sisa yang lebih pendek");
                        int sisiYangLebihPendek = sc.nextInt();
                        System.out.println("input tinggi");
                        int tinggii = sc.nextInt();
                        System.out.println("luas trapesium = " + ((sisiYangLebihPanjang+sisiYangLebihPendek)*tinggii)/2);
                        break;
                    case 7 :
                        System.out.println("input diagonal1");
                        int diagonal1 = sc.nextInt();
                        System.out.println("input diagonal2");
                        int diagonal2 = sc.nextInt();
                        System.out.println("luas belah ketupat = " + (diagonal1*diagonal2)/2);
                        break;
                    case 8 :
                        System.out.println("input d1");
                        int d1 = sc.nextInt();
                        System.out.println("input d2");
                        int d2 = sc.nextInt();
                        System.out.println("luasLayang-layang = " + (d1*d2)/2);
                        break;
                    default:
                        break;
                }
                case 2 :
                    System.out.println("1. kubus");
                    System.out.println("2. balok");
                    System.out.println("3. tabung");
                    System.out.println("4. limas segiempat");
                    System.out.println("5. limas segitiga");
                    System.out.println("6. prisma segitiga");
                    System.out.println("7. kerucut");
                    System.out.println("8. bola");
                    System.out.println("9. prisma segienam beraturan");

                    int c = sc.nextInt();
                    switch (c){
                        case 1 :
                            System.out.println("input sisi");
                            int sisi = sc.nextInt();
                            System.out.println("volume kubus = " + (sisi*sisi*sisi));
                            break;
                        case 2 :
                            System.out.println("input panjang");
                            int panjang = sc.nextInt();
                            System.out.println("input lebar");
                            int lebar = sc.nextInt();
                            System.out.println("input tinggi");
                            int tinggi = sc.nextInt();
                            System.out.println("volume balok = " + (panjang*lebar*tinggi));
                            break;
                        case 3 :
                            System.out.println("input r");
                            int r = sc.nextInt();
                            System.out.println("input tinggi");
                            int tinnggi = sc.nextInt();
                            System.out.println("volume tabung = " + (Math.PI*Math.pow(r,2)*tinnggi));
                            break;
                        case 4 :
                            System.out.println("input luas alas");
                            int luasAlas = sc.nextInt();
                            System.out.println("input tiinggi");
                            int tiinggi = sc.nextInt();
                            System.out.println("volume luas segiempat = " + (luasAlas*tiinggi)/3);
                            break;
                        case 5 :
                            System.out.println("input luass alass");
                            int luassAlass = sc.nextInt();
                            System.out.println("input tinggiii");
                            int tinggiii = sc.nextInt();
                            System.out.println("volume limas segitiga = " + (luassAlass*tinggiii)/3);
                            break;
                        case 6 :
                            System.out.println("input L alasss");
                            int lAlasss = sc.nextInt();
                            System.out.println("input tinggi1");
                            int tinggi1 = sc.nextInt();
                            System.out.println("volume prisma segitiga = " + (lAlasss*tinggi1));
                            break;
                        case 7 :
                            System.out.println("input r");
                            int r1 = sc.nextInt();
                            System.out.println("input tinggi2");
                            int tinggi2 = sc.nextInt();
                            System.out.println("volume kerucut = " + (Math.PI*Math.pow(r1,2)*tinggi2));
                            break;
                        case 8 :
                            System.out.println("input r");
                            int r2 = sc.nextInt();
                            System.out.println("volume bola = " + (4*Math.PI*Math.pow(r2,3))/3);
                            break;
                        case 9 :
                            System.out.println("input S");
                            int S2 = sc.nextInt();
                            System.out.println("input tprisma");
                            int tPrisma = sc.nextInt();
                            System.out.println("volume prisma segienam beraturan = " + (3*Math.pow(S2,2)*Math.sqrt(3)*tPrisma)/2);
                            break;
                    }
                            break;
                        }
                }
            }


        