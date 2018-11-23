import java.util.*;

public class CheckPrime{
    public static void main(String[] args){
        System.out.print("Masukkan bilangan > ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println();

        if (input != 0){
            if (input == 2 || input == 3){
                System.out.print(input + " adalah bilangan prima");
            }
            else if (input % 2 != 0 && input % 3 != 0)
                System.out.print(input + " adalah bilangan prima");
            else
                System.out.print(input + " bukan bilangan prima");
        } else {
            System.out.print(input + " bukan bilangan prima");
        }
    }
}