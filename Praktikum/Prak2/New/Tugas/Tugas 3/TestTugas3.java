import java.util.Scanner;

public class TestTugas3{
		public static void main(String[] args){
				System.out.println("\nAuthor : 140810170003 Risyad");
				int pilih, id, jumlah;
				boolean status;
	
				Scanner in = new Scanner(System.in);
				Tabungan Tabungan1 = new Tabungan(1000000);
	
				while (true)
					{
						System.out.println("Saldo : " + Tabungan1.getSaldo());
						System.out.println("1. Ambil uang");
						System.out.println("2. Simpan uang");
						System.out.println("3. Keluar");
						System.out.print("Jawab : ");
						pilih = in.nextInt();
						if(pilih == 3) break;

							System.out.println("\nPilih Mata Uang :");
							System.out.println("1. IDR");
							System.out.println("2. USD");
							System.out.println("3. AUD");
							System.out.print("Jawab : ");
							id = in.nextInt();
							System.out.print("\nMasukkan jumlah : ");
							jumlah = in.nextInt();

							switch(pilih)
								{
									case 1:
										status = Tabungan1.ambilUang(jumlah, id); 
				
										if (status)
											{
												System.out.println("\nBerhasil!");
											}

										else
											{
												System.out.println("\nGagal!");
											}

										break;
									case 2:
										Tabungan1.simpanUang(jumlah, id);
										System.out.println("\nBerhasil menyimpan uang!");
										break;
								}
					}
			}
}