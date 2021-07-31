package cretionaldesignpatterns.singleton.billpagh;

import cretionaldesignpatterns.singleton.EagerInitialization.DBConnectionEager;

public class Main {
    public static void main(String[] args) {
        DBConnectionBillPagh conn =  DBConnectionBillPagh.getDbConnectionInstance();
        conn.baglantiYazdir();
    }
}
