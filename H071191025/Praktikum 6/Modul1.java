import java.util.Scanner;
class Modul1{
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		String inputan = in.nextLine();
		String oct = String.format("%o", (inputan.length()));
		char[] a = inputan.toCharArray();
		System.out.println();
		System.out.print("#");
		String hex = String.format("%x", (a.length)*(a.length));
		System.out.print(hex);
		char tidaksama = ' ';
		String kalimat;

		// menghilangkan spasi
		inputan = inputan.replaceAll(" ", "");
		a = inputan.toCharArray();
		
		// memotong dan mengubah jadi huruf kapital
		for(int i = 0 ; i<(a.length/2); i++){
			kalimat = String.valueOf(a[i]);
			System.out.print(kalimat.toUpperCase());
		}
		for(int i =(a.length/2) - 2 ; i>=0; i--){
			kalimat = String.valueOf(a[i]);;
			System.out.print(kalimat.toUpperCase());
		}
		
		
		System.out.print(oct);
		char[] awal=hex.toCharArray();
		if(awal[0]<='9') {
			System.out.print("!");
		}else{
			System.out.print("?");
		}
			
	}
}