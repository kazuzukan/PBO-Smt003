class LatihanPerulangan{
    public static void main(String args[]){
    byte i=1;
    while (i<=3){
        System.out.println("Anak ayam "+ i +" turun ");
        i++;
    }
    System.out.println("Anak ayam "+ (i++) +" turun ");
    System.out.println("Anak ayam "+ (++i) +" turun ");
    }
}