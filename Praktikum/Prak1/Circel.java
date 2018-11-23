import java.util.*;
import java.lang.Math;

public class Circel{
    double r;
    public static void main(String[] args) {
        Circel ling = new Circel();
        ling.Masukan();
        ling.cetak();
    }
    public void Masukan(){
        Scanner scan = new Scanner(System.in);
        System.out.print(" Masukan Jari - Jari : " );
        r = scan.nextDouble();
    }

    public double luasling(double r){
        return r * r * Math.PI;
    }
    public double kelling(double r){
        return 2 * r * Math.PI;
    }

    public void cetak(){
        System.out.println(" Keliling Lingkarang : " + kelling(r));
        System.out.println(" Luas Lingkarang : " + luasling(r));
    }
    
}