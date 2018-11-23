import java.util.*;
import java.lang.Math;

public class CeltoFah{
    float suhu;
    float fahrein;
    
    public static void main(String[] args) {
        CeltoFah cel = new CeltoFah();
        cel.Masukan();
        cel.konversi();
    }
    public void Masukan(){
        Scanner scan = new Scanner(System.in);
        System.out.print(" Input Suhu (Celcius) : " );
        suhu = scan.nextFloat();
    }

   public void konversi(){
    System.out.println(" -- KONVERSI CELCIUS TO FAHREINHEIT -- " );
    fahrein = ((suhu * 9)/5) + 32;
    System.out.println(suhu + " Celcius To Fahreinheit = " + fahrein );
   }    
}