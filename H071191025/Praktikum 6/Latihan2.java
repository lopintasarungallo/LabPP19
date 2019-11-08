import java.util.Scanner;
class Latihan2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int batas = in.nextInt();
		String input;
		int jumlah = batas;
		for(int i=0; i<=batas; i++){
			input = in.nextLine();
			boolean test=true;
			char[] a= input.toCharArray();
			for(int j=0; j<a.length; j++){
				if(a[j]!=a[(a.length-j)-1]){
					test = false;
					break;
				}	
			}
			if(test==false){
				jumlah = jumlah - 1;
			}
		}
		
		System.out.print(jumlah);
		
	}
}