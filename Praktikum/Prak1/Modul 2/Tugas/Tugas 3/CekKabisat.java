import java.util.*;

public class CekKabisat{
    public static void main(String args[]){
        System.out.println("Masukkan tahun (1900-2016) : ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input >= 1900 || input <= 2016){
            if (input % 4 == 0)
                System.out.print(input + " adalah tahun kabisat");
            else
                System.out.print(input + " bukan tahun kabisat");
        }

        else{
            if (input < 1900)
                System.out.print("Maaf, tahun input dibawah 1900");
            else
                System.out.print("Maaf, tahun input diatas 2016");
        }
    }
}