package cretionaldesignpatterns.factory.ornek1;

public class Corsa implements IOpel{
    private String  modelAdi;
    private String tip;
    private String segment;
    private String motorHacmi;
    private String ps;

    public Corsa(String modelAdi, String tip, String segment, String motorHacmi, String ps) {
        this.modelAdi = modelAdi;
        this.tip = tip;
        this.segment = segment;
        this.motorHacmi = motorHacmi;
        this.ps = ps;
    }

    @Override
    public String getModelAdi() {
        return modelAdi;
    }

    @Override
    public String getTip() {
        return tip;
    }

    @Override
    public String getSegment() {
        return segment;
    }

    @Override
    public String getMotorHacmi() {
        return motorHacmi;
    }

    @Override
    public String getPs() {
        return ps;
    }

    @Override
    public void sur() {

    }

    @Override
    public String toString() {
        return "Corsa{" +
                "modelAdi='" + modelAdi + '\'' +
                ", tip='" + tip + '\'' +
                ", segment='" + segment + '\'' +
                ", motorHacmi='" + motorHacmi + '\'' +
                ", ps='" + ps + '\'' +
                '}';
    }
}
