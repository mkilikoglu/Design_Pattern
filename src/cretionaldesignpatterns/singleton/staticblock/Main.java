package cretionaldesignpatterns.singleton.staticblock;

public class Main {
    public static void main(String[] args) {

          DBConnectionStaticBlock conn =  DBConnectionStaticBlock.getDbConnectionInstance();
          conn.baglantiYazdir();

    }
}
