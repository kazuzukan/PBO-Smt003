public class Truk{
    
    private double muatan;
    private double muatanmaks;

    public Truk(double beratmaks){
        muatanmaks = beratmaks;
        muatan = 0;
    }

    public double getMuatan(){
        return muatan;
    }

    public double getMuatanMaks(){
        return muatanmaks;
    }

    public void tambahMuatan(double berat){
        double temp;
        temp = muatan + berat;

        if (temp > muatanmaks){
            System.out.println(" kepenuhan! beban selanjutnya tidak di tambahkan");
        }
        else 
            muatan = muatan + berat;
    }

}