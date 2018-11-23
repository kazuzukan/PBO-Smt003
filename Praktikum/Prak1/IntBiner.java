import java.util.Scanner;
 
public class IntBiner {
 int num;
 public static void main(String args[]) {
    IntBiner obj = new IntBiner();
    obj.dptkanNilai();
    obj.konversi();
   }

 void dptkanNilai() {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nMasukkan Bilangan Desimal :");
    num = scan.nextInt();
 }
 
 void konversi() {
  String binary = Integer.toBinaryString(num);
  System.out.println("Bilangan binernya adalah : " + binary);
 }
}
 
