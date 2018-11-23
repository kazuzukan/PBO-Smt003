import java.util.*;

public class SwapLetter{
    public static void main(String args[]){
        System.out.print("Masukkan string > ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] inputSplitted = input.split("\\s+");
        char first = input.charAt(0), last = input.charAt(input.length()-1);

        for(String split : inputSplitted){
            System.out.print(split.replaceFirst(String.valueOf(split.charAt(0)), String.valueOf(last)) + " ");
        }
    }
}