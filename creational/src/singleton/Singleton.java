package singleton;

public class Singleton {

 private static Singleton database;

  private Singleton(){

   //connection to database

  }

  public static Singleton getInstance() {

   if (database == null) {
    synchronized (Singleton.class) {
     if (database == null) {
      database = new Singleton();
     }
    }
   }
   return database;
  }


 }

