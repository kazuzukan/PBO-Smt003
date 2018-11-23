class LatihanBreak{
    public static void main(String args[]){
        Tanda:
        for (byte i = 1; i <= 3; i++){
            for(byte j = 1; j <= 3; j++){
                if (i%2 == 0)
                    //System.out.print("0");
                    break Tanda;
                else   
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("masih ada dehhh");
    }
}