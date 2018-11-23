import java.util.*;

public class Latihanbentuk3D{
    

    public static void menuPilihan(){
        int sisi, pjg, lbr,tgg;
        System.out.print("menu pilihan:  \n1.Persegi \n2.Persegi Panjang \n3.balok ");
        System.out.print("\npilih menu : ");
        Scanner in = new Scanner(System.in);
        int pil = in.nextInt();
        System.out.println(pil);
        switch (pil){
            case 1 :
            sisi = inputData("sisi");
            System.out.print(persegiKel(sisi));
            System.out.print(persegiLuas(sisi));
            System.out.print("\n");
            break;
        
            case 2 :
            pjg = inputData("panjang");
            lbr = inputData("lebar");
            System.out.println(persegiPjgKel(pjg,lbr));
            System.out.println(persegiPjgLuas(pjg,lbr));
            System.out.print("\n");
            break;
                
            case 3 :
            pjg = inputData("panjang");
            lbr = inputData("lebar");
            tgg = inputData("tinggi");
            System.out.println(persegiPjgKel(pjg,lbr));
            System.out.println(persegiPjgLuas(pjg,lbr));
            System.out.print("\n");
            break;
        }
        
    }
    
    /* --- BUAT INPUT --- */
    public static int inputData(String temp){
        System.out.print("Masukan "+temp+" : ");
        Scanner in = new Scanner(System.in);
        int sisi = in.nextInt();
        return sisi;
    }
    
    /* --- PERSEGI --- */
    public static int persegiKel(int sisi){
        System.out.print("\n Keliling Persegi adalah : ");
        return sisi * 4;
    }
    
    public static int persegiLuas(int sisi){
        System.out.print("\n Luas Persegi adalah : ");
        return sisi * sisi;
    }
    
    /* --- PERSEGI PANJANG --- */
    public static int persegiPjgKel(int pjg, int lbr){
        return 2*(pjg + lbr);
    }
    public static int persegiPjgLuas(int pjg, int lbr){
        return pjg*lbr;
    }
    
     /* --- BALOK --- */
}