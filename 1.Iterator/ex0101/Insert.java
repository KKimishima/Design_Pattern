import sun.tools.java.ClassNotFound;

import java.sql.*;

public class Insert implements InsertTable {
  private JDBC jd;
  private DBset dbs;
  private String tb;

  public Insert(String tb){
    this.tb = tb;
  }

  //setter
  public void setDbs(DBset dbs) {
    this.dbs = dbs;
  }
  public void setJd(JDBC jd) {
    this.jd = jd;
  }
  public void setTb(String tb) {
    this.tb = tb;
  }
  public DBset getDbs() {
    return dbs;
  }

  // getter
  public JDBC getJd() {
    return jd;
  }
  public String getTb() {
    return tb;
  }


  // SQL実行
  @Override
  public boolean insertT(Field field){
    this.dbs  = new DBset("localhost","db1","vagrant","vagrant");
    this.jd   = new JDBC("org.mariadb.jdbc.Driver","mariadb");

    try {
      this.jd.setJDBC();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    try {
      this.jd.connTest(this.dbs);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }

    Connection con = null;
    try{
      con = DriverManager.getConnection(
             "jdbc:"+this.jd.getDbType()+"://"+this.dbs.getHost()+":"+this.dbs.getPort()+
                  "/"+this.dbs.getDb(),this.dbs.getUser(),this.dbs.getPass());

      // SQLの雛形
      PreparedStatement past = con.prepareStatement(
          "insert into "+this.tb+" values(?,?,?);"
      );

      past.setString(1,field.getName());
      past.setInt(2,field.getPrice());
      past.setInt(3,field.getWeight());

      past.executeUpdate();
      past.close();

      return true;
    }catch (SQLException e){
      e.printStackTrace();
      System.out.println("クエリ失敗");
    }finally {
      if(con != null){
        try{
          con.close();
        }catch (SQLException e){
          e.printStackTrace();
          return false;
        }
      }
      return true;
    }
  }
}
