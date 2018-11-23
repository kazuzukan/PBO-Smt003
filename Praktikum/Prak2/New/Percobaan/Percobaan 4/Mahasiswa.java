public class Mahasiswa
	{
		private int nrp;
		private String nama;

		public Mahasiswa(int nrp, String nama)
			{
				this.nrp = nrp;
				this.nama = nama;
			}

		public int getNrp(){
			return nrp;
		}
		
		public String getNama(){
			return nama;
		}

		public void setNrp(int i){
			nrp = i;
		}

		public void setNama(String j){
			nama = j;
		}
	
	}