import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        System.out.print("Masukkan jumlah deretan Fibonacci > ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println();

        int x0 = 0, x1 = 1, next = 0;
        for (int i = 0; i < input; i++){
            if (i == 0){
                System.out.print(x0 + " ");
                continue;
            }

            if (i == 1){
                System.out.print(x1 + " ");
                continue;
            }

            next = x0 + x1;
            System.out.print(next + " ");
            x0 = x1;
            x1 = next;
        }
    }
}