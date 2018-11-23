public class TestLatihan4{
	public static void main(String args[]){ boolean status;
		System.out.println("\nAuthor : 140810170003 Risyad ");
		Truck truck = new Truck(900);
		System.out.println("Muatan maksimal = "+truck.getMuatanMaks()); status = truck.tambahMuatan(500.0);
		System.out.print("Tambah muatan : 500 ");
		 if (status)
			System.out.println("Ok");
		 else
			System.out.println("Gagal");

		status = truck.tambahMuatan(300.0);
		System.out.print("Tambah muatan : 300 ");
		 if (status)
			System.out.println("Ok");
		 else
			System.out.println("Gagal");

		status = truck.tambahMuatan(150.0);
		System.out.print("Tambah muatan : 150 "); 
		if (status)
			System.out.println("Ok");
		else
			System.out.println("Gagal");
		
		status = truck.tambahMuatan(50.0);
		System.out.print("Tambah muatan : 50 "); 
		if (status)
			System.out.println("Ok");
		else
			System.out.println("Gagal");
		System.out.print("Muatan sekarang = " +
		truck.getMuatan());
	}
}