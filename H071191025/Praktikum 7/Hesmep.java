import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hesmep {
    static HashMap <Integer, ArrayList<String>> mmad =  new HashMap<>();
    static Scanner inf = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            showFilm();
            System.out.println("(a)dd or (r)emove or (d)etail or (s)earch or (e)xit");
            String str = inf.nextLine();

            if (str.equals("a")) {
                int b = inf.nextInt();
                inf.nextLine();
                add(b);
            } else if (str.equals("r")) {
                int c = inf.nextInt();
                rem(c);
            } else if (str.equals("d")) {
                int d = inf.nextInt();
                detail(d);
            } else if (str.equals("s")){
                String e = inf.nextLine();
                System.out.printf("hasil pencarian dari %s :", e);
                System.out.println();
                search(e);
            } else if (str.equals("e")){
                run = false;
            }
        }
    }
    
    public static void detail(int idx){
        System.out.println("judul\t:" + mmad.get(idx).get(0));
        System.out.println("Rilis\t:" + mmad.get(idx).get(1));
        System.out.println("Durasi\t:" + mmad.get(idx).get(2));
        System.out.println("Genre\t:" + mmad.get(idx).get(3));
        System.out.println("Sinopsis:" + mmad.get(idx).get(4));
        System.out.println("cast\t:" + mmad.get(idx).get(5));
    }

    public static void rem(int idx) {
        mmad.remove(idx);
    }
    
    public static void showFilm(){
        mmad.forEach((k, v) -> {
            System.out.println(k+". "+v.get(0));
        });
    }
    
    public static void judul(int idx){
        System.out.println(mmad.get(idx).get(0));
    }
    
    public static void add(int idx){
        ArrayList<String> film = new ArrayList<>();
        System.out.print("Judul: ");
		String title = inf.nextLine();
		System.out.print("Rilis: ");
		String release = inf.nextLine();
		System.out.print("Durasi: ");
		String duration = inf.nextLine();
		System.out.print("Genre: ");
		String jenre = inf.nextLine();
		System.out.print("Sinopsis: ");
		String synopsis = inf.nextLine();
		System.out.print("Cast: ");
        String casting = inf.nextLine();

        film.add(title);
        film.add(release);
        film.add(duration);
        film.add(jenre);
        film.add(synopsis);
        film.add(casting);
        mmad.put(idx, film);    
    } public static void search(String idxx) {
        ArrayList<Integer> movvie = new ArrayList<>();
        try{
            mmad.forEach((k, v) -> {
                if (v.get(0).toLowerCase().contains(idxx.toLowerCase())) {
                    movvie.add(k);
                }
            });
            for (Integer idx : movvie) {
                judul(idx);
            }
        } catch (IndexOutOfBoundsException e){
            System.out.printf("cannot search movie %s\n" , idxx);
        }
    }

}