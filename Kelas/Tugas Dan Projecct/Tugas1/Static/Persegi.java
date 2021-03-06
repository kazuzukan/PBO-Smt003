/* ===================================================================== 
    Nama : Risyad Pangestu
    NPM  : 140810170003
====================================================================== */

import java.util.*;
public class Persegi extends Dimensi2 {
    private static String namabangun = " Persegi ";
    
    // Constructor
    public Persegi(){
        System.out.print("\n" + namabangun + "\n Masukan sisi : " );
        Scanner input = new Scanner (System.in);
        sisi1 = input.nextDouble();
    }

    public Persegi(double sisi1){
        this.sisi1 = sisi1;
    }

    /* ------------------------ OPERASI ----------------------------  */ 
    public static Double persegiKel(Double sisi1){
        return sisi1 * 4;
    }

    public static Double persegiLuas(Double sisi1){
        return sisi1 * sisi1;
    }

    /* ------------------------ CETAK ------------------------------  */ 
    public static String cetak() {
        return( 
            " Keliling : " + persegiKel(sisi1) 
            + "\n Luas : " + persegiLuas(sisi1)
        );
    }

}