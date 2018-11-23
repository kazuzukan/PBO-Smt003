public class TestTugas2
     {
          public static void main(String[] args)
               {
                    System.out.println("\nAuthor : 140810170003 Risyad Pangestu");
                    Mobil mobil1 = new Mobil();
                    mobil1.setMerkMobil("Toyota");
                    mobil1.setWarnaMobil("Biru");
                    mobil1.setTipeMobil("minibus");
                    mobil1.setKapasitasMesin(2000);
                    mobil1.setBanyakMobil(7);
                    System.out.println(mobil1.infoMobil());

                    Mobil mobil2 = new Mobil("Daihatsu");
                    mobil2.setWarnaMobil("Hitam");
                    mobil2.setTipeMobil("pick up");
                    mobil2.setKapasitasMesin(1500);
                    mobil2.setBanyakMobil(2);
                    System.out.println(mobil2.infoMobil());

                    Mobil mobil3 = new Mobil("Suzuki", 5);
                    mobil3.setWarnaMobil("Silver");
                    mobil3.setTipeMobil("suv");
                    mobil3.setKapasitasMesin(1800);
                    System.out.println(mobil3.infoMobil());        

                    Mobil mobil4 = new Mobil("Honda", "Sedan", 5);
                    mobil4.setWarnaMobil("Merah");
                    mobil4.setKapasitasMesin(1300);
                    System.out.println(mobil4.infoMobil());
               }
     }
