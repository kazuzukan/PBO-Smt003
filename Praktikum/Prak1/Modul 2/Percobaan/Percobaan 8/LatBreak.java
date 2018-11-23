class LatBreak{
    public static void main(String args[]){
        int i = 0;
        do {
            System.out.println("Anak ayam " + i + " turun");
            i++;
            if(i > 10)
                break;
        } while (true);
    } 
}