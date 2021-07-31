package cretionaldesignpatterns.singleton.lazyinitialization;

public class DBConnectionLazy {
    private static DBConnectionLazy CONNECTION_INSTANCE_LAZY;


    private DBConnectionLazy() {

        baglanti="LAZY DbConnection ";
    }
    private String baglanti;
    public static DBConnectionLazy getDbConnectionInstance(){

        if(CONNECTION_INSTANCE_LAZY ==null)
            CONNECTION_INSTANCE_LAZY=new DBConnectionLazy();
        return CONNECTION_INSTANCE_LAZY;
    }
    public void baglantiYazdir(){
        System.out.println(baglanti);
    }


}
