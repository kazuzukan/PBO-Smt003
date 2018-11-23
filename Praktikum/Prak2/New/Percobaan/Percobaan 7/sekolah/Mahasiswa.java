package sekolah;

public class Mahasiswa
	{
		private int npm;
		private String nama;

		public Mahasiswa(int npm, String nama)
			{
				this.npm = npm;
				this.nama = nama;
			}

		public int getNpm()
			{
				return npm;
			}

		public String getNama()
			{
				return nama;
			}
	}