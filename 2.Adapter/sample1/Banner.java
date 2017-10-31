// 予め提供されているクラス

public class Banner {
  private String str;
  public Banner(String str){
    this.str = str;
  }

  // 文字をかっこで囲むクラス
  public void showWithParen(){
   System.out.println("(" + this.str + ")");
  }
  // 文字をカギ括弧で囲むクラス
  public void showWithAster(){
    System.out.println("*" + this.str + "*");
  }
}
