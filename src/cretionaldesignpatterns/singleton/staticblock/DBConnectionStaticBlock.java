package cretionaldesignpatterns.singleton.staticblock;

public class DBConnectionStaticBlock {
    private static DBConnectionStaticBlock CONNECTION_INSTANCE_STATIC_BLOCK;


    static {
        try {
            CONNECTION_INSTANCE_STATIC_BLOCK =new DBConnectionStaticBlock();
        }catch (Exception e){

        }
    }

    private DBConnectionStaticBlock() {
        i++;
        baglanti="STATIC BLOCK DbConnection "+i;
    }
    private static int i;
    private String baglanti;
    public static DBConnectionStaticBlock getDbConnectionInstance(){

        return CONNECTION_INSTANCE_STATIC_BLOCK;
    }
    public void baglantiYazdir(){
        System.out.println(baglanti);
    }


}
