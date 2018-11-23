import java.util.*;
public class KonversiWaktu{
    int jam_awal, menit_awal, jam_akhir, menit_akhir, durasi_menit, menit_terakhir,jam_terakhir, durasi_jam, total;
    public static void main(String[] args) {
        KonversiWaktu wkt = new KonversiWaktu();
        wkt.inputAwal();
        wkt.hitung();
        wkt.cetak();
    }

    void inputAwal(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Jam awal : ");
        jam_awal = scan.nextInt();
        System.out.print("Masukan menit awal : ");
        menit_awal = scan.nextInt();
        System.out.print("Masukan Jam akhir : ");
        jam_akhir = scan.nextInt();
        System.out.print("Masukan menit akhir : ");
        menit_akhir = scan.nextInt();
    }

    void hitung(){
        if((menit_akhir-menit_awal)<0){
            menit_terakhir=60+menit_akhir;
            durasi_menit=menit_terakhir-menit_awal;
            jam_terakhir=jam_akhir-1;
            durasi_jam=jam_terakhir-jam_awal;
            total=(durasi_jam*60)+durasi_menit;
            }   
        else if ((menit_awal-menit_akhir)<0){
            menit_terakhir = 60+menit_akhir;
            durasi_menit = menit_terakhir-menit_awal;
            jam_terakhir = jam_akhir-1;
            durasi_jam = jam_terakhir-jam_awal;
            total=(durasi_jam*60)+durasi_menit;
        }
    }

    void cetak(){
        System.out.println(" Selish Waktu anda : " + total + " Menit " );
    }

}