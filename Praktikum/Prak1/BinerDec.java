import java.util.Scanner;

public class BinerDec{
 Scanner scan = new Scanner(System.in);;
 int angka;
 public static void main(String[] args) {
    BinerDec bil = new BinerDec();
    bil.KonversiNilai();
   }


 void KonversiNilai() {
  System.out.print("\nMasukkan Bilangan Biner :");
  angka = Integer.parseInt(scan.nextLine(), 2);
  System.out.println("Konversi Dalam bilangan decimal : " + angka);
 }
}
