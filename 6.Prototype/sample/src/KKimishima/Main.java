import framework.Manager;
import framework.Product;

public class Main {
  public static void main(String[] args) {
    // 準備
    Manager manager = new Manager();
    // メッセージボックスObjectのインスタンス
    MessageBox mbox1 = new MessageBox('-');
    MessageBox mbox2 = new MessageBox('*');
    // アンダーバーのObjectのインスタン
    UnderlinePen unl1 = new UnderlinePen('_');
    UnderlinePen unl2 = new UnderlinePen('1');
    // インスタンスの登録
    manager.register("ハイフン",mbox1);
    manager.register("アスタリスク",mbox2);
    manager.register("アンダーバー",unl1);
    manager.register("いち",unl2);

    // 生成
    Product p1 = manager.create("ハイフン");
    p1.use("ハイフンテスト");
    Product p2 = manager.create("アスタリスク");
    p2.use("アスタリスクテスト");
    Product p3 = manager.create("アンダーバー");
    p3.use("アンダーバーテスト");
    Product p4 = manager.create("いち");
    p4.use("いちテスト");
  }
}
