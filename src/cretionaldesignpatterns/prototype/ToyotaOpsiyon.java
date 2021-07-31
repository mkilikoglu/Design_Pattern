package cretionaldesignpatterns.prototype;

public abstract class ToyotaOpsiyon implements Cloneable {

    private boolean seritTakip;
    private boolean hizSabitleyici;
    private boolean hizSinirlayici;
    private boolean otomatikFar;
    private boolean aux;
    private boolean akilliEkran;
    private boolean cocukKiliti;
    private boolean deriDireksiyon;
    private boolean otomatikKlima;




    public boolean isSeritTakip() {
        return seritTakip;
    }

    public void setSeritTakip(boolean seritTakip) {
        this.seritTakip = seritTakip;
    }

    public boolean isHizSabitleyici() {
        return hizSabitleyici;
    }

    public void setHizSabitleyici(boolean hizSabitleyici) {
        this.hizSabitleyici = hizSabitleyici;
    }

    public boolean isHizSinirlayici() {
        return hizSinirlayici;
    }

    public void setHizSinirlayici(boolean hizSinirlayici) {
        this.hizSinirlayici = hizSinirlayici;
    }

    public boolean isOtomatikFar() {
        return otomatikFar;
    }

    public void setOtomatikFar(boolean otomatikFar) {
        this.otomatikFar = otomatikFar;
    }

    public boolean isAux() {
        return aux;
    }

    public void setAux(boolean aux) {
        this.aux = aux;
    }

    public boolean isAkilliEkran() {
        return akilliEkran;
    }

    public void setAkilliEkran(boolean akilliEkran) {
        this.akilliEkran = akilliEkran;
    }

    public boolean isCocukKiliti() {
        return cocukKiliti;
    }

    public void setCocukKiliti(boolean cocukKiliti) {
        this.cocukKiliti = cocukKiliti;
    }

    public boolean isDeriDireksiyon() {
        return deriDireksiyon;
    }

    public void setDeriDireksiyon(boolean deriDireksiyon) {
        this.deriDireksiyon = deriDireksiyon;
    }

    public boolean isOtomatikKlima() {
        return otomatikKlima;
    }

    public void setOtomatikKlima(boolean otomatikKlima) {
        this.otomatikKlima = otomatikKlima;
    }


    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ToyotaOpsiyon{" +
                "seritTakip=" + seritTakip +
                ", hizSabitleyici=" + hizSabitleyici +
                ", hizSinirlayici=" + hizSinirlayici +
                ", otomatikFar=" + otomatikFar +
                ", aux=" + aux +
                ", akilliEkran=" + akilliEkran +
                ", cocukKiliti=" + cocukKiliti +
                ", deriDireksiyon=" + deriDireksiyon +
                ", otomatikKlima=" + otomatikKlima +
                '}';
    }

    public String aracOpsiyonOlustur(){

    return "Şerit Takip\n"+this.aux +"/"+ isSeritTakip()+"\n"+
            "Hiz Sabitleyici \n"+this.hizSabitleyici +"/"+ isHizSabitleyici()+"\n"+
            "Hiz Sınırlayici \n"+this.hizSinirlayici +"/"+ isHizSinirlayici()+"\n"+
            "Otomatik Far \n"+this.otomatikFar +"/"+ isOtomatikFar()+"\n"+
            "Auxr \n"+this.aux +"/"+ isAux()+"\n"+
            "Akilli Ekran \n"+this.akilliEkran +"/"+ isAkilliEkran()+"\n"+
            "Çocuk Kiliti \n"+this.cocukKiliti +"/"+ isCocukKiliti()+"\n"+
            "Deri Direksiyon \n"+this.deriDireksiyon +"/"+ isDeriDireksiyon()+"\n"+
            "Otomatik Klima \n"+this.otomatikKlima +"/"+ isOtomatikFar();
    }


}
