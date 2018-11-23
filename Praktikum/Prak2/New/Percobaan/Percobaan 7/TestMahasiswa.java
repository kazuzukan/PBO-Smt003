import sekolah.*;

public class TestMahasiswa{
		public static void main(String[] args)
			{
				System.out.println("Author : 140810170003 Risyad Pangestu");
				Kelas kls = new Kelas(14, "Informatika!");
				kls.setMhs(new Mahasiswa(03, "R i s y a d"));
				kls.cetakMhs();
			}
}