import java.util.*;

public class LatihanIF{
    public static void main(String[] args){
        boolean cek = false;
        Scanner masuk = new Scanner(System.in);
        byte nilai = (byte)masuk.nextInt();
        if (nilai<0){
            System.out.println("Negatif");
        }

        else if(nilai == 0){
            System.out.println("Nol");
        }

        else if(nilai % 2 == 0){
            System.out.println("Genap");
        }
        else
            System.out.println("Ganjil");

    }
}