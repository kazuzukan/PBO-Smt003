import java.util.Scanner;

  public class BMS{
  public static String kalimat;
  public static String pattern;
  private int[] table;

public BMS(String pattern){
  int BASE = 256;
  this.pattern = pattern;

  table = new int[BASE];
  for (int i =0; i<BASE; i++)
  table[i] = -1;
  for (int j = 0; j<pattern.length(); j++ )
  table[pattern.charAt(j)] = j;
}

public int search(String Kalimat){
  int pjgkalimat = kalimat.length(); 
  int pjgpattern = pattern.length();
  int skip;
  for (int i=0; i<=pjgkalimat-pjgpattern; i+=skip){
     skip = 0;
  for (int j=pjgpattern-1; j>=0; j--){
     if (pattern.charAt(j) != kalimat.charAt(i+j)){
    skip = Math.max(1, j-table[kalimat.charAt(i+j)]);
    break;
  }
 }
   if (skip == 0) return i;
}
return pjgkalimat; 
}

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println(" Masukan kalimat dasar : ");
  kalimat = in.next(); 
  System.out.println(" Masukan pattern : ");
  pattern = in.next();
  BMS bomo = new BMS(pattern); 
  int temp = bomo.search(kalimat);
  if (temp < kalimat.length()){
            System.out.println(" Kalimat " + pattern + " Ditemukan pada posision index : " + temp  );
        }
        else 
            System.out.println(" Pattern : " + pattern+ " tidak ditemukan pada kalimat : " + kalimat);
    }
}