public class Truck
	{
		private double muatan;
		private double muatanmaks;

		public Truck(double beratmaks)
			{
				muatanmaks = beratmaks;
				muatan=0;
			}

		public double getMuatan()
			{
				return this.newtsToKilo(this.muatan);
			}

		public double getMuatanMaks()
			{
				return muatanmaks;
			}

		public boolean tambahMuatan(double berat)
			{
				double temp = muatan + berat;
				if (temp > muatanmaks)
					{
	 					return false;
					}

				else
					{
						muatan = muatan + berat;
	 					return true;
					}
			}

		public double newtsToKilo(double berat)
			{
				return 1/9.8*berat;
			}

		public double kiloToNewts(double berat)
			{
				return 9.8*berat;
			}
	}