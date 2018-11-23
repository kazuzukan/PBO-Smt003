public class Array1 {
    public static void main(String args[]){
        System.out.println("140810170003 Risyad Pangestu");
        int nilai[] = new int[3];
        nilai[0] = 70;
        nilai[1] = 80;
        nilai[2] = 65;

        double ratarata = 0.0;

        for(int i = 0; i<nilai.length; i++)
            ratarata += nilai[i];
        ratarata /= nilai.length;

        System.out.println("Nilai rata-rata =" + ratarata);
    }
}