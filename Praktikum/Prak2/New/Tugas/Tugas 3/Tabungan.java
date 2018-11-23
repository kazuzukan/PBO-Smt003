public class Tabungan
	{
		private int saldo;

		public Tabungan(int initsaldo)
			{
				saldo = initsaldo;
			}

		public int getSaldo()
			{
				return saldo;
			}

		public void simpanUang(int jumlah, int id)
			{
				if(id == 2)
					jumlah = this.usdToIdr(jumlah);
				else if (id == 3)
					jumlah = this.audToIdr(jumlah);
					saldo = saldo+jumlah;
			}

		public boolean ambilUang(int jumlah, int id)
			{
				if(id == 2)
					jumlah = this.usdToIdr(jumlah);
				else if (id == 3)
					jumlah = this.audToIdr(jumlah);
				int temp = saldo - jumlah;
				
				if (temp < 0)
					return false;
				else
					{
						saldo = saldo-jumlah;
						return true;
					}
			}

		public int audToIdr(int jumlah)
			{
				return jumlah*10000;
			}
	
		public int usdToIdr(int jumlah)
			{
				return jumlah*9000;
			}
	}