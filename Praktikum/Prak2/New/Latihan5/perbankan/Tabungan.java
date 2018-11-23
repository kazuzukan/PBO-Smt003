package perbankan;

public class Tabungan
	{
		public int saldo;

		public Tabungan(int saldo)
			{
				this.saldo = saldo;
			}

		public int getSaldo()
			{
				return saldo;
			}

		public void simpanUang(int jumlah)
			{
				saldo = saldo + jumlah;
			}

		public boolean ambilUang(int jumlah)
			{
				int temp = saldo - jumlah;
				if (temp < 0)
					return false;
				else
					{
						saldo = saldo-jumlah;
						return true;
					}
			}
	}