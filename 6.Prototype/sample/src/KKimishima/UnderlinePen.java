import framework.Product;

public class UnderlinePen implements Product{
  private char ulchar;
  /**
   * ulcharクラスは、Productの実装を行っているクラス<br>
   * コンソールにアンダーバーを生成するクラス<br>
   * 具体敵にアンダーバーは、文字列下に文字をつける<br>
   * @param ulchar 文字列を囲む文字
   *
   */
  public UnderlinePen(char ulchar){
    this.ulchar = ulchar;
  }

  /**
   * useメソッドは与えられた文字列をulcharでアンダーバーを表示<br>
   * コンソールに文字に表示する
   * @param s 使用する際の文字列
   */
  @Override
  public void use(String s){
    int length = s.getBytes().length;
    System.out.println("\"" + s + "\"");
    //System.out.println("");
    for (int i = 0;i < length;i++){
      System.out.print(ulchar);
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
