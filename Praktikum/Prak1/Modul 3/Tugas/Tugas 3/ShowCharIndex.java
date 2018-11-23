import java.util.*;

public class ShowCharIndex{
    public static void main(String args[]){
        System.out.print("Masukkan kalimat > ");
        Scanner in = new Scanner(System.in);
        String kalimat = in.nextLine();
        kalimat = kalimat.trim();
        System.out.println();
        System.out.print("Masukkan huruf > ");
        Scanner charKey = new Scanner(System.in);
        char key = charKey.next().charAt(0);
        char[] kalimatChar = kalimat.toCharArray();
        int index = 0;
        boolean found = false;

        for (int i = 0; i < kalimatChar.length; i++){
            if (kalimatChar[i] == key){
                index = i;
                found = true;
                break;
            }
        }
        if(found)
            System.out.print("Karakter \'" + key + "' terdapat di index " + index);
        else
            System.out.print("Tidak ditemukan");
    }
}