public class TestMahasiswa
	{
		public static void main(String[] args)
			{
				System.out.println("Author : 140810170003 Risyad Pangestu");
				Mahasiswa mhs = new Mahasiswa(03, "Risyad Pangestu");
				mhs.setNrp(03);
				mhs.setNama("Risyad");
				mhs.getNrp();
				mhs.getNama();
				System.out.println(mhs.getNrp());
				System.out.println(mhs.getNama());
			}
	}