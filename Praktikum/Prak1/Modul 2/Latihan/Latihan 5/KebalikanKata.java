import java.util.*;

public class KebalikanKata{
    public static void main(String args[]){
        System.out.print("Masukan kata : ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char[] inputChar = input.toCharArray();

        System.out.print("Kebalikan kata : ");
        for(int i = inputChar.length-1; i>=0; i-- ){
            System.out.print(inputChar[i]);
        }


    }
}