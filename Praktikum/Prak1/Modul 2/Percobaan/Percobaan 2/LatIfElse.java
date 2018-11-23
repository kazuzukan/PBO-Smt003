import javax.lang.model.util.ElementScanner6;

class LatIfElse{
    public static void main(String args[]){
        char hrfAwal = 'A';
        System.out.print("Sebutkan huruf awal hewan kesukaanmu : ");
        try {
            hrfAwal = (char)System.in.read();
        }
        
        catch (Exception e){
            System.out.println("Error : " + e.toString());
        }

        if(hrfAwal =='a')
            System.out.println("Anjing- Anda seorang yang setia!");
        else if(hrfAwal == 'b')
            System.out.println("Beo- Anda peniru ulung!");
        else if(hrfAwal == 'k')
            System.out.println("Kucing- Anda cute deh!");
        else
            System.out.println("Tebak sendiri ya..!");
    }
}