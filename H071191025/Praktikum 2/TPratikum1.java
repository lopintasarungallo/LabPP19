import java.util.Scanner;
class TPratikum1{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = 0;
        int bilanganGenap = 0;
        int bilanganGanjil = 0;
        int bilanganPositif = 0;
        int bilanganNegatif = 0;
            
            String aa = sc.next();
            try{
                a = Integer.parseInt(aa);
            }catch(NumberFormatException ex){
                System.out.println("Inputan tidak falid");
            }

            if(a>0){
                bilanganPositif++;
            }else if(a<0){
                bilanganNegatif++;
            }
            
            if (a%2==0){
                bilanganGenap++;
            }else if (a%2!=0){
                bilanganGanjil++;
            }else if (a==0){
                System.out.println("Inputan Tidak Valid");
            }


            int b = sc.nextInt();
            if(b>0){
                bilanganPositif++;
            }else if (a<0){
                bilanganNegatif++;
            }else if (a==0){
                System.out.println("Inputan Tidak Valid");
            }
            if (b%2==0){
                bilanganGenap++;
            }else if (b%2!=0){
                bilanganGanjil++;
            }else if (a==0){
                System.out.println("Inputan Tidak Valid");
            }
            int c = sc.nextInt();
            if(c>0){
                bilanganPositif++;
            }else if (c<0){
                bilanganNegatif++;
            }else if (a==0){
                System.out.println("Inputan Tidak Valid");
            }
            if (c%2==0){
                bilanganGenap++;
            }else if (c%2!=0){
                bilanganGanjil++;
            }else if (a==0){
                System.out.println("Inputan Tidak Valid");
            }
            int d = sc.nextInt();
            if(d>0){
                bilanganPositif++;
            }else if (d<0){
                bilanganNegatif++;
            }else if (a==0){
                System.out.println("Inputan Tidak Valid");
            }
            if (d%2==0){
                bilanganGenap++;
            }else if (d%2!=0){
                bilanganGanjil++;
            }else if (a==0){
                System.out.println("Inputan Tidak Valid");
            }
            int e = sc.nextInt();
            if(e>0){
                bilanganPositif++;
            }else if (e<0){
                bilanganNegatif++;
            }else if (a==0){
                System.out.println("Inputan Tidak Valid");
            }
            
            if (e%2==0){
                bilanganGenap++;
            }else if (e%2!=0){
                bilanganGanjil++;
            }else if (a==0){
                System.out.println("Inputan Tidak Valid");
            }
        
        
        System.out.println(bilanganPositif + " bilangan positif ");
        System.out.println(bilanganNegatif + " bilangan negatif ");
        System.out.println(bilanganGanjil + " bilangan ganjil ");
        System.out.println(bilanganGenap + " bilangan genap ");
    }
}