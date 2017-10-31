import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
  private String driver;
  private String dbType;

  public JDBC(String driver,String dbtype){
    this.driver = driver;
    this.dbType = dbtype;
  }

  public String getDbType() {
    return dbType;
  }

  public String getDriver() {
    return driver;
  }

  public void setJDBC() throws Exception{
      //try {
        Class.forName(this.driver);
      //} catch (ClassNotFoundException e) {
      //  e.printStackTrace();
      //  System.out.println("ドライバ読み込み失敗");
     // }
    }

  public void connTest(DBset dbset) throws Exception{
    Connection con = null;
    con = DriverManager.getConnection(
            "jdbc:"+this.dbType+"://"+dbset.getHost()+":"+dbset.getPort()+
                "/"+dbset.getDb(),dbset.getUser(),dbset.getPass()
    );
    con.close();
  }
}
