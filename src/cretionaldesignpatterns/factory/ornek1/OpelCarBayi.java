package cretionaldesignpatterns.factory.ornek1;

public class OpelCarBayi {
    public static void main(String args[]){
        IOpel yeniOpel = OpelCarFactory.aracUret("corsa","binek","b","1.2","75");
        System.out.println(yeniOpel.toString());

        IOpel yeniOpel2 = OpelCarFactory.aracUret("astra","binek","c","1.6","120");
        System.out.println(yeniOpel2.toString());
    }

}
