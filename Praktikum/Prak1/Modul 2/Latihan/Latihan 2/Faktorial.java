import java.util.*;

public class Faktorial{
    public static void main(String args[]){
        System.out.print("Masukkan angka > ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println("n\tn!");
        System.out.println("---------------------");
        for(int i = 1; i <= input; i++){
            System.out.println(i + "\t" + faktorial(i));
        }
        System.out.println("---------------------");
    }

    public static int faktorial(int n){
        int hasil = 1;
        for(int i = 1; i < n; i++){
            hasil = hasil * (i+1);
        } return hasil;
    }
        
}