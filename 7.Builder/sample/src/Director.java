/**
 *   Directorクラス<br>
 *   Buliderクラスで宣言されたメソッドを使って文章を創る<br>
 */
public class Director {
  private Builder builder;
  public Director(Builder builder){
    this.builder = builder;
  }

  /**
   * constructメソッド<br>
   * 作製する文章のフォーマット決めるメソッド
   */
  public void construct(){
    builder.makeTile("テンプレタイトル");
    builder.makeString("テンプレメッセージ1");
    builder.makeItems(new String[]{
        "テンプレアイテム1",
        "テンプレアイテム2",
    });
    builder.makeString("テンプメッセージ2");
    builder.makeItems(new String[]{
        "テンプレアイテム3",
        "テンプレアイテム4",
    });
    builder.close();
  }
}

