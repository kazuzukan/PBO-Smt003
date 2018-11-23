public class Mahasiswa
	{	
		private int npm;
		private String nama;

		public Mahasiswa(){ 
				this(0,"");
			}

		public Mahasiswa(String nama){ 
				this(0,nama);
			}

		public Mahasiswa(int npm, String nama){ 
				this.npm = npm;
				this.nama = nama;
			}

		// Print Constructor
		public void cetak(){
			System.out.print(this.npm + " ");
			System.out.print(this.nama);
			System.out.print("\n");
		}
	}