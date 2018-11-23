public class Mobil
    {
        private String merkMobil;
        private String warnaMobil;
        private String tipeMobil;
        private int kapasitasMesin;
        private int banyakMobil;

        public Mobil()
            {
                banyakMobil=0;
            }

        public Mobil(String merkMobil)
            {
                this.merkMobil = merkMobil;
                banyakMobil = 0;
            }

        public Mobil(String merkMobil, int banyakMobil)
            {
                this.banyakMobil = banyakMobil;
                this.merkMobil = merkMobil;
            }

        public Mobil(String merkMobil, String tipeMobil, int banyakMobil)
            {
                this.merkMobil = merkMobil;
                this.tipeMobil = tipeMobil;
                this.banyakMobil = banyakMobil;
            }

        public void setMerkMobil(String merkMobil)
            {
                this.merkMobil = merkMobil;
            }

        public void setWarnaMobil(String warnaMobil)
            {
                this.warnaMobil = warnaMobil;
            }

        public void setTipeMobil(String tipeMobil)
            {
                this.tipeMobil = tipeMobil;
            }

        public void setKapasitasMesin(int kapasitasMesin)
            {
                this.kapasitasMesin = kapasitasMesin;
            }

        public void setBanyakMobil(int banyakMobil)
            {
                this.banyakMobil = banyakMobil;
            }

        public String getMerkMobil()
            {
                return merkMobil;
            }

        public String getWarnaMobil()
            {
                return warnaMobil;
            }

        public String getTipeMobil()
            {
                return tipeMobil;
            }

        public int getKapasitasMesin()
            {
                return kapasitasMesin;
            }

        public int getBanyakMobil()
            {
                return banyakMobil;
            }

        public String infoMobil()
            {
                return "Merk Mobil : " + this.getMerkMobil() +
                "\nWarna Mobil : " + this.getWarnaMobil() +
                "\nTipe Mobil : " + this.getTipeMobil() +
                "\nKapasitas Mesin : " + this.getKapasitasMesin() +
                "\nBanyak Mobil : " +this.getBanyakMobil() + "\n";
            }
    }
