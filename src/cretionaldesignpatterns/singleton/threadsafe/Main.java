package cretionaldesignpatterns.singleton.threadsafe;

public class Main {
    public static void main(String[] args) {

          DBConnectionThreadSafe conn =  DBConnectionThreadSafe.getDbConnectionInstance();
          conn.baglantiYazdir();

    }
}
