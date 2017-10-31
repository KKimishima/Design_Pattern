// メソッドcreateを実装している抽象クラス
// TemplateMethodパターンが使われる
// 抽象メソッドcreateProductで製品を作り
// registerで登録を行う
// 登録と製品を実装はサブクラスに任せる
package Kimishima.framework;

// テンプレートメッソドパターン
public abstract  class Factory {
  // createメソッドでは、Productインスタンスを生産する
  // 製品を作り出し。登録する
  public final Product create(String owner) {
    Product pd = createProduct(owner);
    regesterProduct(pd);
    return pd;
  }

  // 実装しない抽象メソッド
  // 他のクラスから接続できない
    protected abstract Product createProduct(String owner);
    protected abstract void     regesterProduct(Product pd);
}
