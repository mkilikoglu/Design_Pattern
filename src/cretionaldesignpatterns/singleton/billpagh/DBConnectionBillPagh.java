package cretionaldesignpatterns.singleton.billpagh;

public class DBConnectionBillPagh {



    private DBConnectionBillPagh() {

        baglanti="BillPagh DbConnection";
    }

    private String baglanti;

    public static DBConnectionBillPagh getDbConnectionInstance(){

        return helper.CONNECTION_INSTANCE_BILL_PAGH;
    }
    public void baglantiYazdir(){
        System.out.println(baglanti);
    }

    private static  class helper{
        private static final DBConnectionBillPagh CONNECTION_INSTANCE_BILL_PAGH=new DBConnectionBillPagh();
    }


}
