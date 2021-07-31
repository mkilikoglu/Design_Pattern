package cretionaldesignpatterns.abstractfactory.ornek1;

public class SandalyeFactory implements MobilyaAbstractFactory{
    private String agacTipi;
    private String kumas;
    private String pamuk;
    private String boya;

    public SandalyeFactory(String agacTipi, String kumas, String pamuk, String boya) {
        this.agacTipi = agacTipi;
        this.kumas = kumas;
        this.pamuk = pamuk;
        this.boya = boya;
    }

    @Override
    public Mobilya mobilyaYap() {
        return new Sandalye(agacTipi,kumas,pamuk,boya);
    }

    @Override
    public String toString() {
        return "SandalyeFactory{" +
                "agacTipi='" + agacTipi + '\'' +
                ", kumas='" + kumas + '\'' +
                ", pamuk='" + pamuk + '\'' +
                ", boya='" + boya + '\'' +
                '}';
    }
}
