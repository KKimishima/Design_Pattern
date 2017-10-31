import java.sql.*;
import java.util.ArrayList;

// 検索用
public class Find implements  DAO{
  private JDBC jd;
  private DBset dbs;
  private String tb;
  // コンストラクタ
  public Find(String tb){
    this.tb = tb;
  }

  @Override
  public ArrayList<Field> find(int i){
    this.jd =    new JDBC("org.mariadb.jdbc.Driver","mariadb");
    this.dbs =  new DBset("localhost","db1","vagrant","vagrant");
    ArrayList<Field> fields = new ArrayList<>();
    try{
      this.jd.setJDBC();
    }catch (Exception e){
      e.printStackTrace();
    }

    try{
      this.jd.connTest(this.dbs);
    }catch (Exception e){
      e.printStackTrace();
    }

    Connection con = null;
    try{
      con = DriverManager.getConnection(
          "jdbc:"+this.jd.getDbType()+"://"+this.dbs.getHost()+":"+this.dbs.getPort()+
              "/"+this.dbs.getDb(),this.dbs.getUser(),this.dbs.getPass());

      // SQL の雛形
      PreparedStatement ps = con.prepareStatement(
        "select * from tb1 where PRICE = ?"
      );

      ps.setInt(1,i);
      ResultSet rs = ps.executeQuery();

      //ArrayList<Field> fields  = new ArrayList<>();

      while (rs.next()){
        Field field = new Field(
            rs.getNString("NAME"),rs.getInt("PRICE"),rs.getInt("WEIGHT"));
        fields.add(field);
      }
      rs.close();
      ps.close();
    }catch (SQLException e){
      e.printStackTrace();
    }finally {
      if (con != null){
        try{
          con.close();
        }catch (SQLException e){
          e.printStackTrace();
        }
      }
    }
    return fields;
  }
}
