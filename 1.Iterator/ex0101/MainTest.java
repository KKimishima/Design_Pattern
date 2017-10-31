import java.util.ArrayList;

public class MainTest {
  public static void main(String[] args) {
    // ４間実験的
    Rrecord record = new Rrecord(4);
    // データに挿入
    record.addFieds(new Field("test0", 0, 0));
    record.addFieds(new Field("test1", 1, 1));
    record.addFieds(new Field("test2", 2, 2));
    record.addFieds(new Field("test3", 3, 3));

    // イテレータのAPIのインスタン
    Iterator iterator = record.itretator();

    // テーブル操作用Object
    Insert ins = new Insert("tb1");
    // テーブル検索用Object
    Find fi = new Find("tb1");
    // 検索用途切り替え
    boolean testSw = false;
    if (testSw) {
      while (iterator.hasNext()) {
        Field field = (Field) iterator.next();
        if (!ins.insertT(field)) {
          System.out.println("失敗");
          System.exit(1);
        }
      }
    }else{
        ArrayList<Field> f = fi.find(1);
        System.out.println(f.get(0).getName());
          System.out.println("検索用");
    }
  }
}
