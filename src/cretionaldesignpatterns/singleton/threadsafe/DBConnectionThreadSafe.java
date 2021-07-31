package cretionaldesignpatterns.singleton.threadsafe;

import cretionaldesignpatterns.singleton.lazyinitialization.DBConnectionLazy;

public class DBConnectionThreadSafe {
    private static DBConnectionThreadSafe CONNECTION_INSTANCE_THREAD_SAFE;


    static {
        try {
            CONNECTION_INSTANCE_THREAD_SAFE =new DBConnectionThreadSafe();
        }catch (Exception e){

        }
    }

    private DBConnectionThreadSafe() {

        baglanti="THREADSAFE  DbConnection ";
    }
    private String baglanti;
    public synchronized static DBConnectionThreadSafe getDbConnectionInstance(){
        if(CONNECTION_INSTANCE_THREAD_SAFE ==null)
            CONNECTION_INSTANCE_THREAD_SAFE=new DBConnectionThreadSafe();
        return CONNECTION_INSTANCE_THREAD_SAFE;
    }
    public void baglantiYazdir(){
        System.out.println(baglanti);
    }


}
