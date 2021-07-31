package cretionaldesignpatterns.builder;

public class Main {
    public static  void main(String args[]){
        TotoCorollaOpsiyon.ToyotaBuilder builder = new TotoCorollaOpsiyon.ToyotaBuilder("006FL4300");//PLAKA final tanimli oldugu icin zorunlu kildik
        builder.opsiyonCocukKiliti(true);
        builder.opsiyonDeriDireksiyonKilif(true);
        builder.opsiyonKolcak(true);
        builder.opsiyonSeritTakip(true);

        TotoCorollaOpsiyon opsiyon = builder.toyotaBuild();
        System.out.println(opsiyon.toString());
    }
}
