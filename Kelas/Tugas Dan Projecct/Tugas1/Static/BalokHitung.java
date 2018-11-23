
/* ===================================================================== 
    Nama : Risyad Pangestu
    NPM  : 140810170003
====================================================================== */

import java.util.*;
public class BalokHitung extends Dimensi2 {
    public static String namabangun = " Balok ";

    // Constructor
    public BalokHitung(){
        System.out.print("\n" + namabangun + "\n Masukan Panjang : " );
        Scanner input = new Scanner (System.in);
        sisi1 = input.nextDouble();

        System.out.print(" Masukan Lebar : " );
        sisi2 = input.nextDouble();

        System.out.print("Masukan Tinggi : " );
        sisi3 = input.nextDouble();
    }

    public BalokHitung(double sisi1, Double sisi2, Double sisi3){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    /* ------------------------ OPERASI ----------------------------  */ 
    public static Double balokLP(Double sisi1, double sisi2, double sisi3){
        return (2*(sisi1*sisi2)+2*(sisi2*sisi3)+2*(sisi3*sisi1));
    }

    public static Double balokVol(Double sisi1,double sisi2, double sisi3){
        return sisi1 * sisi2 * sisi3;
    }

    /* ------------------------ CETAK ------------------------------  */ 
    public static String cetak() {
        return( 
            " Luas Permukaan : " + balokLP(sisi1,sisi2,sisi3) 
            + "\n Volume : " + balokVol(sisi1,sisi2,sisi3)
        );
    }

}