/* ===================================================================== 
    Nama : Risyad Pangestu
    NPM  : 140810170003
====================================================================== */

import java.util.*;
public class Balok extends Dimensi2 {
    public String namabangun = " Balok ";

    // Constructor
    public BalokHitung(){
        Scanner input = new Scanner (System.in);
        System.out.print("\n" + namabangun + "\n Masukan Panjang : " );
        sisi1 = input.nextDouble();

        System.out.print("\n Masukan Lebar : " );
        sisi2 = input.nextDouble();

        System.out.print("\n Masukan Tinggi : " );
        sisi3 = input.nextDouble();
    }

    public BalokHitung(double sisi1,Double sisi2, Double sisi3){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    /* ------------------------ OPERASI ----------------------------  */ 
    public Double balokLP(Double sisi1,double sisi2, double sisi3){
        return 2*(sisi1)+2*(sisi2)+2*(sisi3);
    }

    public Double balokVol(Double sisi1,double sisi2, double sisi3){
        return sisi1 * sisi2 * sisi3;
    }

    /* ------------------------ CETAK ------------------------------  */ 
    public String cetak() {
        return( 
            " Luas Permukaan : " + balokLP(sisi1,sisi2,sisi3) 
            + "\n Volume : " + balokVol(sisi1,sisi2,sisi3)
        );
    }

}