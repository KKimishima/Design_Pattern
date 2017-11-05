import framework.Product;

public class MessageBox implements Product{
  private char decochar;

  /**
   * Messageクラスは、Productの実装を行っているクラス<br>
   * コンソール嬢にメッセージボックを生成するクラス<br>
   * 具体敵にメッセージボックとは、文字列を文字または記号で囲ったものを指す<br>
   * @param decochar 文字列を囲む文字
   *
   */
  public MessageBox(char decochar){
    this.decochar = decochar;
  }

  /**
   * useメソッドは与えられた文字列をdecocharで囲む<br>
   * コンソールに文字に表示する
   * @param s 使用する際の文字列
   */
  @Override
  public void use(String s){
    int length = s.getBytes().length;
    for (int i = 0;i < length;i++){
      System.out.print(decochar);
    }
    System.out.println("");
    System.out.println(this.decochar + " " + s + " " +this.decochar);
    for (int i = 0;i< length;i++){
      System.out.print(decochar);
    }
    System.out.println("");
  }

  /**
   * createCloneメソッドは、自分自身の複製を行うメソッド
   * @return p 複製差入れたObjectを返す
   */
  @Override
  public Product createClone(){
    Product p = null;
    try{
      p = (Product)clone();
    }catch (CloneNotSupportedException e){
      e.printStackTrace();
    }
    return p;
  }
}
