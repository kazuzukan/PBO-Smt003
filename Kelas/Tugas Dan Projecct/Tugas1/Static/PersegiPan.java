/* ===================================================================== 
    Nama : Risyad Pangestu
    NPM  : 140810170003

    class Persegi Panjang
====================================================================== */

import java.util.*;
public class PersegiPan extends Dimensi2 {
    public String namabangun = " Persegi Panjang ";
    
    // Constructor
    public PersegiPan (){
        Scanner input = new Scanner (System.in);
        System.out.print("\n" + namabangun + "\n Masukan Panjang : " );
        sisi1 = input.nextDouble();
        System.out.print(" Masukan Lebar: " );
        sisi2 = input.nextDouble();
    }

    public PersegiPan (double sisi1, double sisi2){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    /* ------------------------ OPERASI ----------------------------  */ 
    public static Double persegipanKel(Double sisi1, Double sisi2){
        return 2*(sisi1 + sisi2);
    }

    public static Double persegipanLuas(Double sisi1, Double sisi2){
        return sisi1 * sisi2;
    }

    /* ------------------------ CETAK ------------------------------  */ 
    public static String cetak() {
        return( 
            " Keliling : " + persegipanKel(sisi1,sisi2) 
            + "\n Luas : " + persegipanLuas(sisi1,sisi2) + "\n" 
        );
    }

}