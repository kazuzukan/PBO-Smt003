/* =====================================================
Nama : Risyad Pangestu
NPM  : 140810170003
Desc : Class Bentuk  
 ===================================================== */


public class Bentuk{
    private String nama;
    private int jmlDim;
    
    public Bentuk(String nama){
        System.out.print("Nama : ");
        this.nama = nama;
    }
    
    public Bentuk(int jmlDim){
        System.out.print("Jumlah Dimensi 1 : ");
        this.jmlDim = jmlDim;
    }
    
    public Bentuk(String nama, int jmlDim){
        System.out.print("Nama : ");
        this.nama = nama;
        System.out.print("Jumlah Dimensi : ");
        this.jmlDim = jmlDim;
    }
    
    public void cetak (){
        System.out.println(this.nama);
        System.out.println(this.jmlDim);
    }
}

