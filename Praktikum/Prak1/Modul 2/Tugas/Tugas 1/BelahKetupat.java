import java.util.*;

public class BelahKetupat{
    public static void main(String args[]){
        System.out.print("Input radius > ");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        int space = radius - 1;

        for (int i = 1; i <= radius; i++){
            for (int j = 1; j <= space; j++){
                System.out.print("0 ");
            }
            space--;
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("* ");                
            }
            for (int j = 1; j <= space+1; j++){
                System.out.print("0 ");
            }
            System.out.println();
        }
        space = 1;
        for (int i = 1; i <= radius - 1; i++){
            for (int j = 1; j <= space; j++){
                System.out.print("0 ");
            }
            space++;
            for (int j = 1; j <= 2 * (radius - i) - 1; j++){
                System.out.print("* ");
            }
            for (int j = 1; j <= space-1; j++){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}