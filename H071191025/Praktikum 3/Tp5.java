import java.util.Scanner;
class Tp5{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        while(sc.hasNextLine()){
            double angka = sc.nextDouble();
            double angle = angka;
            String selamat = null;

            double jam=6, menit=0, detik=0;
            do{
                if(angle<0.0041){
                    break;
                } 
                if(angle>=15.0){
                    angle = angle - 15;
                    jam++;
                } else if (angle>=0.25 && angle < 15.0){
                    angle = angle - 0.25;
                    menit++; 
                } else if (angle>=0.0041 && angle < 0.25){
                    angle = angle - 0.0041;
                    detik++;
                }
                
                if(detik>=60){
                    detik = detik % 60;
                    menit++;

                }

                if(menit>60){
                    menit = menit % 60;
                    jam++;
                }

                if(jam>=24){
                    jam = jam%24;
                }

            } while(angka!=0);

            if(jam>=5&&jam<10){
                selamat = " Selamat Pagi ";
            } else if (jam>=0 && jam < 15){
                selamat = " Selamat Siang ";
            } else if (jam>=15 && jam < 18){
                selamat = " Selamat Sore ";
            } else if (jam>=18 && jam < 24){
                selamat = " Selamat Malam ";
            }
            System.out.printf("%s\n%.0f:%.0f:%.0f\n",selamat, jam, menit, detik);
            } 


        }
    }