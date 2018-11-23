import java.util.*;
import java.math.*;

public class AkarKuadrat{
    public static void main(String args[]){
        int a, b, c, d;
        double x1, x2;
        Scanner in_a = new Scanner(System.in);
        a = in_a.nextInt();
        Scanner in_b = new Scanner(System.in);
        b = in_b.nextInt();
        Scanner in_c = new Scanner(System.in);
        c = in_c.nextInt();

        d = b * b - (4 * a * c);

        if(d == 0){
            x1 = (-b) / (2 * a);
            x2 = x1;
        }

        else if (d > 0){
            x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-b) - Math.sqrt(d)) / (2 * a);
        }

        else{
            x1 = ((-b) / 2 * a) + (Math.sqrt(d) / (2 * a));
            x2 = ((-b) / 2 * a) - (Math.sqrt(d) / (2 * a));
        }

        System.out.println("Determinan = " + d);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}