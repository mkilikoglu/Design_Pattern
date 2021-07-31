package cretionaldesignpatterns.singleton.lazyinitialization;

import cretionaldesignpatterns.singleton.staticblock.DBConnectionStaticBlock;

public class Main {
    public static void main(String[] args) {

        DBConnectionLazy conn =  DBConnectionLazy.getDbConnectionInstance();
        conn.baglantiYazdir();
    }
}
