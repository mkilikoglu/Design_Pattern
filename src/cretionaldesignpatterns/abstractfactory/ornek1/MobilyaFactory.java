package cretionaldesignpatterns.abstractfactory.ornek1;

public class MobilyaFactory {
    public static Mobilya mobilyaGetir(MobilyaAbstractFactory mobilyaFactory){
        return mobilyaFactory.mobilyaYap();
    }
}
