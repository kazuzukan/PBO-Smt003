public class LatContinue{
    public static void main(String args[]){
        int a, b;
        for (a = 2; a < 20; a+=2){
            if(a%3 == 0)
                continue;
            System.out.print(a + "\t");
        }
    }
}