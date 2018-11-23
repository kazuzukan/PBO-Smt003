import java.util.*;

public class SearchElementInArray{
    public static void main(String args[]){
        System.out.print("Angka yang ingin dicari > ");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        boolean found = false;
        int loc1 = 0, loc2 = 0;
        int[][] arrayOfInts = {{32, 87, 3, 589}, {12, 1076, 2000, 8}, {622, 127, 77, 955}};
        for(int i = 0; i < arrayOfInts.length; i++){
            if(found) break;
            loc1 = i;
            for (int j = 0; j < arrayOfInts[i].length; j++){
                if (arrayOfInts[i][j] == key){
                    found = true;
                    loc2 = j;
                    break;
                }
            }
        }

        System.out.println();

        if (found){
            System.out.println("Found at " + loc1 + ", " + loc2);
        }

        else{
            System.out.println("Not found");
        }
    }
}