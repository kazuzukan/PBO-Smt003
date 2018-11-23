public class LetterCount{
    public static void main(String args[]){
        char[] matkul = {'p', 'e', 'm', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'n', 'b', 'e', 'r', 'b', 'a', 's', 'i', 's', 'o', 'b', 'j', 'e', 'k'};
        int aCount = 0;

        for (int i = 0; i < matkul.length; i++){
            if (matkul[i] == 'a');
                aCount++;
        }

        System.out.println("Jumlah huruf a = " + aCount);
    }
}