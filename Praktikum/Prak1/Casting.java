public class Casting {
     public static void main(String args[]) {
        double d = 12.0988; 
        float f = (float) d; 
        long l = (long) d; 
        int i = (int) d;
        short s = (short) d; 
        byte bt = (byte) d; 
        char c = (char) d; 
        System.out.println("Nilai d = " + d); 
        System.out.println("Konversi d ke c = " + c); 
        System.out.println("Konversi d ke bt = " + bt);
        System.out.println("Konversi d ke s = " + s);
        System.out.println("Konversi d ke i = " + i);
        System.out.println("Konversi d ke l = " + l);
        System.out.println("Konversi d ke f = " + f);

        System.out.println(" After Promotion ");

        s = bt;
        i = s;
        f = l;
        l = i;

        System.out.println("Konversi d ke c  = " + c); 
        System.out.println("Konversi d ke bt (short) = " + bt);
        System.out.println("Konversi d ke s (byte) = " + s);
        System.out.println("Konversi d ke i (short)= " + i);
        System.out.println("Konversi d ke l (int)= " + l);
        System.out.println("Konversi d ke f (long )= " + f);

     }
}