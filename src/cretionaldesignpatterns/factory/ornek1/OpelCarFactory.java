package cretionaldesignpatterns.factory.ornek1;

public class OpelCarFactory {

    public static IOpel aracUret(String  modelAdi,
                                 String tip,
                                 String segment,
                                 String motorHacmi,
                                 String ps){
        IOpel opel;
        if("corsa".equalsIgnoreCase(modelAdi)){
            opel = new Corsa(modelAdi, tip, segment, motorHacmi,ps);
        }
        else if("astra".equalsIgnoreCase(modelAdi)){
            opel = new Astra(modelAdi, tip, segment, motorHacmi,ps);
        }
        else if("insignia".equalsIgnoreCase(modelAdi)){
            opel = new Insignia(modelAdi, tip, segment, motorHacmi,ps);
        }
        else{
            throw new RuntimeException();
        }
        return opel;
    }
}
