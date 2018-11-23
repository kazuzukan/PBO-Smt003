/* ===================================================================== 
    Nama : Risyad Pangestu
    NPM  : 140810170003
====================================================================== */

import java.util.*;
public class Bentuk {
    public Double sisi1, sisi2ti, sisi3;
    private String namabangun;
    private int jmldim;
    
    public Bentuk(){
        this.namabangun = " kosong ";
        this.jmldim = 0;
    }

    public Bentuk(String namabangun, int jmldim){
        this.namabangun = namabangun;
        this.jmldim = jmldim;
    }

    /* ----------------------- BASIC INPUT -------------------------  */
    public static double inputData(String temp){
        System.out.print("Masukan "+temp+" : ");
        Scanner in = new Scanner(System.in);
        Double sisi1 = in.nextDouble();
        return sisi1;
    }

    /* ------------------------ OPERASI ----------------------------  */ 
    public static double persegiKel(Double sisi1){
        System.out.print("\n Keliling Persegi adalah : ");
        return sisi1 * 4;
    }

    /* ------------------------ CETAK ------------------------------  */ 
    public void cetak() {
        System.out.println(this.namabangun);
        double sisi1 = inputData(" Sisi 1");
        System.out.print(persegiKel(sisi1));
    }


   
}