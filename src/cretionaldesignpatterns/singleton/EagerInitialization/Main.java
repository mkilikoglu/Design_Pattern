package cretionaldesignpatterns.singleton.EagerInitialization;

public class Main {
    public static void main(String[] args) {

        for (int i =0;i<10;i++){
          DBConnectionEager conn =  DBConnectionEager.getDbConnectionInstance();
            conn.baglantiYazdir();
        }
    }
}
