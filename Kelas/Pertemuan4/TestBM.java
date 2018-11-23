import java.util.Scanner;



public class TestBM{
    public static String kalimat;
    public static String pattern;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Masukan kalimat dasar : ");
        kalimat = in.next(); 
        System.out.println(" Masukan pattern : ");
        pattern = in.next();
        BoyerMoore bomo = new BoyerMoore(pattern);    
        int temp = bomo.search(kalimat);
        System.out.println(" Kalimat " + bomo.kalimat + " Ditemukan pada " + temp + " posision" );
    }
} 