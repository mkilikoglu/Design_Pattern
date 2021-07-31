package cretionaldesignpatterns.abstractfactory.ornek1;

public class Sandalye extends Mobilya{
    private String agacTipi;
    private String kumas;
    private String pamuk;
    private String boya;

    public Sandalye(String agacTipi, String kumas, String pamuk, String boya) {
        this.agacTipi = agacTipi;
        this.kumas = kumas;
        this.pamuk = pamuk;
        this.boya = boya;
    }

    @Override
    public String getAgacTipi() {
        return agacTipi;
    }

    @Override
    public String getKumas() {
        return kumas;
    }

    @Override
    public String getPamuk() {
        return pamuk;
    }

    @Override
    public String getBoya() {
        return boya;
    }

    @Override
    public String toString() {
        return "Sandalye{" +
                "agacTipi='" + agacTipi + '\'' +
                ", kumas='" + kumas + '\'' +
                ", pamuk='" + pamuk + '\'' +
                ", boya='" + boya + '\'' +
                '}';
    }
}
