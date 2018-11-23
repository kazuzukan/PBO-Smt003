public class Average{
    public static void main(String args[]){
        String MK[] = {"RPL", "BD", "PBO"};
        String mhs[] = {"Ahmad", "Adang", "Dani","Edi"};
        int nilai[][] = new int[4][3];

        nilai[0][0] = 81;
        nilai[0][1] = 90;
        nilai[0][2] = 62;
        nilai[1][0] = 50;
        nilai[1][1] = 83;
        nilai[1][2] = 87;
        nilai[2][0] = 89;
        nilai[2][1] = 55;
        nilai[2][2] = 65;
        nilai[3][0] = 77;
        nilai[3][1] = 70;
        nilai[3][2] = 92;

        System.out.print("NRP\tNama\t");
        for(int i = 0; i < MK.length; i++){
            System.out.print(MK[i] + "\t");
        }
        System.out.println();
        for(int i = 0; i < mhs.length; i++){
            System.out.print(i + "\t" + mhs[i] + "\t");
            for(int j = 0; j < nilai[i].length; j++){
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }
    }
}