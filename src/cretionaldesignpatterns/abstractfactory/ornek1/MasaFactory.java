package cretionaldesignpatterns.abstractfactory.ornek1;

public class MasaFactory implements MobilyaAbstractFactory{
    private String agacTipi;
    private String kumas;
    private String pamuk;
    private String boya;

    public MasaFactory(String agacTipi, String kumas, String pamuk, String boya) {
        this.agacTipi = agacTipi;
        this.kumas = kumas;
        this.pamuk = pamuk;
        this.boya = boya;
    }

    @Override
    public Mobilya mobilyaYap() {
        return new Masa(agacTipi,kumas,pamuk,boya);
    }
}
