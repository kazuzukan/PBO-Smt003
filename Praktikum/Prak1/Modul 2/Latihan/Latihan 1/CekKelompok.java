import java.util.*;
import java.lang.Object;

class CekKelompok{
    public static void main(String args[]){
        System.out.print("Masukkan char > ");
        Scanner in = new Scanner(System.in);
        char input = in.next().charAt(0);
        if (Character.isUpperCase(input))
            System.out.println("Huruf besar");
        else if (Character.isLowerCase(input))
            System.out.println("Huruf kecil");
        else
            System.out.println("Karakter khusus");
    }
}