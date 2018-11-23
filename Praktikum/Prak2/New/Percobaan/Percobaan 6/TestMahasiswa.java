public class TestMahasiswa{
		public static void main(String[] args)
			{	
				System.out.println("Author : 140810170003 Risyad Pangestu");
				Mahasiswa mhs2 = new Mahasiswa();
				mhs2.cetak();
				Mahasiswa mhs1 = new Mahasiswa(03,"risyad");
				mhs1.cetak();
				Mahasiswa mhs3 = new Mahasiswa("risyad");
				mhs3.cetak();
			}
	}