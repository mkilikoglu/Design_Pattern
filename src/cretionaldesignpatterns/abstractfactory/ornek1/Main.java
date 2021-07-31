package cretionaldesignpatterns.abstractfactory.ornek1;

public class Main {
    public static void main(String args[]) {


        Mobilya sandalye = MobilyaFactory.mobilyaGetir(new SandalyeFactory("3 metre kavak", "2m", "10kg", "kirmizi"));
        System.out.println(sandalye.toString());
        Mobilya masa = MobilyaFactory.mobilyaGetir(new SandalyeFactory("5 metre kavak", "0m", "0kg", "beyaz"));
        System.out.println(masa.toString());
    }
}
