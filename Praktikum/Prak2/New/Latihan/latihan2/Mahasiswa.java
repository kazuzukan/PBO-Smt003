public class Mahasiswa{
    private int nrp;
    private String nama;

    public Mahasiswa(int i, String n){
        nrp = i;
        nama = n;
    }

    public int getNrp(){
        return nrp;
    }
    
    public String getNama(){
        return nama;
    }
    
}