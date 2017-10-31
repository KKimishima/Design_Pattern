import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import org.mariadb.jdbc.Driver;
import static org.junit.jupiter.api.Assertions.*;

class JDBCTest {
  DBset dbset = new DBset("localhost","db1","vagrant","vagrant");
  String a = "org.mariadb.jdbc.Driver";
  String b = "mariadb";
  @Test
  void setJDBC() {
    try{
      Class.forName(a);
    }catch (ClassNotFoundException e){
      e.printStackTrace();
    }
  }

  @Test
  void connTest() {
    Connection con = null;
    try{
      con = DriverManager.getConnection("jdbc:"+b+"://"+dbset.getHost()+":"+dbset.getPort()+"/"+dbset.getDb(),dbset.getUser(),dbset.getPass());
        con.close();
      }catch (java.sql.SQLException e){
        e.printStackTrace();
        System.out.println("DB接続失敗");
      }
  }

}