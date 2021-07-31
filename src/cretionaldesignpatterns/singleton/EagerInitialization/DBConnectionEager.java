package cretionaldesignpatterns.singleton.EagerInitialization;

public class DBConnectionEager {
    private static DBConnectionEager CONNECTION_INSTANCE_EAGER =new DBConnectionEager();


    private DBConnectionEager() {
        i++;
        baglanti="EAGER DbConnection"+i;
    }
    private static int i;
    private String baglanti;
    public static DBConnectionEager getDbConnectionInstance(){

        return CONNECTION_INSTANCE_EAGER;
    }
    public void baglantiYazdir(){
        System.out.println(baglanti);
    }


}
