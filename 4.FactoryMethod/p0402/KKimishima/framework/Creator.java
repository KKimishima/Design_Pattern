package KKimishima.framework;

// テンプレートメソッド
public abstract class Creator {
  public final Product create(String owner){
    Product pd =  CreateProduct(owner);
    registerProduct(pd);
    return pd;
  }

  protected abstract Product CreateProduct(String owner);
  protected abstract void registerProduct(Product pd);
}
