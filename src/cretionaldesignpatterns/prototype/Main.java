package cretionaldesignpatterns.prototype;

public class Main   {
    public static void main(String[] args) throws CloneNotSupportedException {
        ToyotaOpsiyon opsiyonYaris=new ToyotaYarisOpsiyon(true,true,true,false,false,false,false,true,true);
        ToyotaYarisOpsiyon opsiyonYaris2 =new ToyotaYarisOpsiyon(false,false,true,false,false,false,false,true,true);
        ToyotaYarisOpsiyon opsiyonYaris3=(ToyotaYarisOpsiyon)opsiyonYaris2.clone();
        System.out.println(opsiyonYaris.toString());
        //System.out.println(opsiyonYaris2.toString());
       // System.out.println(opsiyonYaris2.aracOpsiyonOlustur());
        System.out.println("");
        System.out.println("--------------------------------");
        ToyotaOpsiyon opsiyonCorolla = new ToyotaCorollaOpsiyon(false,false,true,false,false,false,false,true,true);
        System.out.println(opsiyonCorolla.aracOpsiyonOlustur());


    }

    }

