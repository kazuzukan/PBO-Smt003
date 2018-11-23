package perbankan;

public class Bank
	{
		private Nasabah[] nasabah;
		private int jumlahNasabah;

		public Bank()
			{
				jumlahNasabah=0;
				nasabah = new Nasabah[4];
			}

		public void tambahNasabah(String namaAwal, String namaAkhir)
			{
				Nasabah nasabahBaru = new Nasabah(namaAwal, namaAkhir);
				nasabah[jumlahNasabah] = nasabahBaru;
				jumlahNasabah++;
			}

		public int getJumlahNasabah()
			{
				return jumlahNasabah;
			}

		public Nasabah getNasabah(int indeks)
			{
				return this.nasabah[indeks];
			}
	}
