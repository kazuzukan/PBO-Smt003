public class TestLatihan1
	{
		public static void main(String[] args)
			{
				System.out.println("\nAuthor : 140810170003 Risyad");
				Tabungan tabungan = new Tabungan(5000);
				System.out.println("Saldo awal : " + tabungan.saldo);
				tabungan.ambilUang(2300);
				System.out.println("Jumlah uang yang diambil : 2300");
				System.out.println("Saldo sekarang : " + tabungan.saldo);
			}
	}