package framework;

/**
 複製を可能にするインターフェイスである
 java.lang.Clonebleインターフェイスを継承している
 @author K.Kimishima
*/

public interface Product extends java.lang.Cloneable{
  /**
   * Useメソッドは使うためのメソッド何をするかはサブクラスに任せる
   * @param s 使用する際の文字列
   */
  public abstract void use(String s);

  /**
   * createCloneメソッドは、インスタンスを複製するメソッド
   * @return Product 複製を行う行うObject
   *
   */
  public abstract Product createClone();

}

