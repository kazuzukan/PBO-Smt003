import java.util.*;

public class ReplaceWords{
    public static void main(String args[]){
        System.out.print("String kalimat utama\t> ");
        Scanner in1 = new Scanner(System.in);
        String string = in1.nextLine();
        System.out.print("String yang diganti\t> ");
        Scanner in2 = new Scanner(System.in);
        String replace = in2.nextLine();
        System.out.print("String pengganti\t> ");
        Scanner in3 = new Scanner(System.in);
        String replaceWith = in3.nextLine();

        string = string.replaceFirst(replace, replaceWith);

        System.out.print("Output\t> " + string);
    }
}