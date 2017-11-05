public class Director {
  private Builder builder;

  public Director(Builder builder){
    this.builder = builder;
  }
  public void construct(){

    builder.makeTitle("テンプレタイトル");
    builder.makeString("テンプレメッセージ1");
    builder.makeItems(new String[]{
        "アイテム1",
        "アイテム2",
    });
    builder.makeString("テンプレートメッセージ2");
    builder.makeItems(new String[]{
        "アイテム3",
        "アイテム4",
    });
    builder.close();
  }

}
