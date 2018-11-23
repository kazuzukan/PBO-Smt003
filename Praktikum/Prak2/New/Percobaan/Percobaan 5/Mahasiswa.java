public class Mahasiswa{
		public int npm;
		public String nama;
	
		public Mahasiswa(int npm, String nama){
			this.npm = npm;
			this.nama = nama;
		}

		public void cetak(){
			System.out.println(this.npm);
			System.out.println(this.nama);
		}
}