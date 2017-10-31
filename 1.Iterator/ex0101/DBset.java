// データベースの設定を記述するクラス
public class DBset {
  private String host;
  private String db;
  final private String port = "3306";
  private String user;
  private String pass;

  public DBset(String host,String db,String user,String pass){
    this.host = host;
    this.db   = db;
    this.user = user;
    this.pass = pass;
  }

  public String getDb() {
    return db;
  }
  public String getHost() {
    return host;
  }
  public String getPass() {
    return pass;
  }
  public String getUser() {
    return user;
  }
  public String getPort() {
    return port;
  }
}
