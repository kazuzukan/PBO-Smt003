import java.util.Scanner;
public class BoyerMoore{
    public static String kalimat;
    public static String pattern;
    private int[] table;
    int m;
    public static int skip;

    public BoyerMoore(String pattern){
        int BASE = 256;
        this.pattern = pattern;
        table = new int[BASE];
        for (int i=0; i<5; i++){
            table[i] = m;
            System.out.println("loop ke - " + i + " adalah : " + table[i]);
        }
        System.out.println(" Ini loop ke bagian 2");
        for (int j = 0; j<pattern.length(); j++ ){
            table[pattern.charAt(j)] = j;
            System.out.println("loop ke - " + j + " adalah : "+ pattern.charAt(j));
        }
    }

    public int search(String Kalimat){
        int pjgkalimat = kalimat.length(); 
        int pjgpattern = pattern.length();
        int skip;
        for (int i=0; i<=pjgkalimat-pjgpattern; i+=skip){
            skip = 0;
            System.out.println(" loop aha ke - " + i);
            for (int j=pjgpattern-1; j>=0; j--){
                System.out.println(" loop aja ke - " + j);
                System.out.print("cek : " + (pjgpattern-1)+ "  ");
                if (pattern.charAt(j) != kalimat.charAt(i+j)){
                    System.out.println(pattern.charAt(j) + " = " + kalimat.charAt(i+j));
                    skip = Math.max(1, j-table[kalimat.charAt(i+j)]);
                    System.out.println(j-table[kalimat.charAt(i+j)]);
                    System.out.println(skip);
                    break;
                }
                System.out.println(pattern.charAt(j) + " = " + kalimat.charAt(i+j));
                System.out.println("heereeeevboasasaor!");
                System.out.println(skip);
            }
            if (skip == 0) return i;
            System.out.println(" here! ");
        }
        System.out.println("paingbawah!");
        System.out.println(pjgkalimat);
        return pjgkalimat;  
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Masukan kalimat dasar : ");
        kalimat = in.next(); 
        System.out.println(" Masukan pattern : ");
        pattern = in.next();
        BoyerMoore bomo = new BoyerMoore(pattern);    
        int temp = bomo.search(kalimat);
        if (temp < kalimat.length()){
            System.out.println(" Kalimat " + pattern + " Ditemukan pada " + temp + " posision" );
        }
        else 
            System.out.println(" Pattern : " + pattern+ " tidak ditemukan pada kalimat : " + kalimat);
        
    }
}