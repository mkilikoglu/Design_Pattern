package cretionaldesignpatterns.abstractfactory.ornek1;

public class KoltukFactory implements MobilyaAbstractFactory{
    private String agacTipi;
    private String kumas;
    private String pamuk;
    private String boya;

    public KoltukFactory(String agacTipi, String kumas, String pamuk, String boya) {
        this.agacTipi = agacTipi;
        this.kumas = kumas;
        this.pamuk = pamuk;
        this.boya = boya;
    }

    @Override
    public Mobilya mobilyaYap() {
        return new Koltuk(agacTipi,kumas,pamuk,boya);
    }
}
