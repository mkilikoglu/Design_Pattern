package cretionaldesignpatterns.builder;

public class TotoCorollaOpsiyon {
    private String arkadaYazi;
    private boolean curuiseControl;
    private boolean deriDireksiyonKilif;
    private boolean seritTakip;
    private boolean otomatikVites;
    private boolean cocukKiliti;
    private String plaka;
    private boolean kolcak;


    private TotoCorollaOpsiyon(ToyotaBuilder opsiyonBuilder) {
        this.arkadaYazi = opsiyonBuilder.arkadaYazi;
        this.curuiseControl = opsiyonBuilder.curuiseControl;
        this.deriDireksiyonKilif = opsiyonBuilder.deriDireksiyonKilif;
        this.seritTakip = opsiyonBuilder.seritTakip;
        this.otomatikVites = opsiyonBuilder.otomatikVites;
        this.cocukKiliti = opsiyonBuilder.cocukKiliti;
        this.plaka = opsiyonBuilder.plaka;
        this.kolcak = opsiyonBuilder.kolcak;

    }

    public static class ToyotaBuilder {
        private String arkadaYazi;
        private boolean curuiseControl;
        private boolean deriDireksiyonKilif;
        private boolean seritTakip;
        private boolean otomatikVites;
        private boolean cocukKiliti;
        private final String plaka;
        private boolean kolcak;

        public ToyotaBuilder(String plaka) {
            this.plaka = plaka;
        }

        public ToyotaBuilder opsiyonArkaYazi(String arkadaYazi) {
            this.arkadaYazi = arkadaYazi;
            return this;
        }
        public ToyotaBuilder opsiyonCruiseControl(boolean curuiseControl) {
            this.curuiseControl = curuiseControl;
            return this;
        }
        public ToyotaBuilder opsiyonDeriDireksiyonKilif(boolean deriDireksiyonKilif) {
            this.deriDireksiyonKilif = deriDireksiyonKilif;
            return this;
        }
        public ToyotaBuilder opsiyonSeritTakip(boolean seritTakip) {
            this.seritTakip = seritTakip;
            return this;
        }
        public ToyotaBuilder opsiyonOtomatikVites(boolean otomatikVites) {
            this.otomatikVites = otomatikVites;
            return this;
        }
        public ToyotaBuilder opsiyonCocukKiliti(boolean cocukKiliti) {
            this.cocukKiliti = cocukKiliti;
            return this;
        }
        public ToyotaBuilder opsiyonKolcak(boolean kolcak) {
            this.kolcak = kolcak;
            return this;
        }

        public TotoCorollaOpsiyon toyotaBuild() {
            return new TotoCorollaOpsiyon(this);
        }

    }

    @Override
    public String toString() {
        return "TotoCorollaOpsiyon{" +
                "arkadaYazi='" + arkadaYazi + '\'' +
                ", curuiseControl=" + curuiseControl +
                ", deriDireksiyonKilif=" + deriDireksiyonKilif +
                ", seritTakip=" + seritTakip +
                ", otomatikVites=" + otomatikVites +
                ", cocukKiliti=" + cocukKiliti +
                ", plaka='" + plaka + '\'' +
                ", kolcak=" + kolcak +
                '}';
    }
}
