import java.util.*;

public class SwapFamilyName{
    public static void main(String args[]){
        System.out.print("String nama pertama\t> ");
        Scanner input1 = new Scanner(System.in);
        String nama1 = input1.nextLine();
        System.out.print("String nama kedua\t> ");
        Scanner input2 = new Scanner(System.in);
        String nama2 = input2.nextLine();

        String[] nama1Splitted = nama1.split("\\s+");
        String[] nama2Splitted = nama2.split("\\s+");

        String temp = nama1Splitted[nama1Splitted.length-1];
        nama1Splitted[nama1Splitted.length-1] = nama2Splitted[nama2Splitted.length-1];
        nama2Splitted[nama2Splitted.length-1] = temp;

        System.out.print("String nama pertama\t> ");
        for(String split : nama1Splitted){
            System.out.print(split + " ");
        }
        System.out.print("\nString nama kedua\t> ");
        for(String split : nama2Splitted){
            System.out.print(split + " ");
        }
    }
}