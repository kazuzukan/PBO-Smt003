import java.util.*;

public class MenuTugas1{

    // Field
    public static int pilih;

    // Method    
    public  MenuTugas1(){
        MenuPilihan();
    }

    public static void  MenuPilihan(){
        do{
            System.out.print(" \n- Hitung Kuy - \n1.Persegi \n2.Persegi Panjang \n3.Balok \n0.Exit ");
            System.out.print("\n Masukan Pilihan : ");
            Scanner inputdat = new Scanner(System.in);
            int pilih = inputdat.nextInt();
            switch(pilih){
                case 0 :
                    System.out.print(" BYE CAPT!");
                    System.out.print("\n");
                    System.exit(0);
                    break;

                case 1 : 
                    Persegi p1 = new Persegi();
                    System.out.print(p1.cetak());
                    System.out.print("\n");
                    break;
                
                case 2 :
                    PersegiPan p2 = new PersegiPan();
                    System.out.print(p2.cetak());
                    System.out.print("\n");
                    break;

               case 3 :
                    BalokHitung p3 = new BalokHitung();
                    System.out.print(p3.cetak());
                    System.out.print("\n");
                    break;

               default :
                    System.out.print(" Salah pilih ! ayoo Ulangi");
                    System.out.print("\n");
            }
        } while(pilih < 1);
    }   
}