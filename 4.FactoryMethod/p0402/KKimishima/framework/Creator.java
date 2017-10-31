package KKimishima.framework;

// テンプレートメソッド
public abstract class Creator {
  protected final Product create(String owner){
    Product pd =  CreateProduct(owner);
    setInfo(pd);
    registerProduct(pd);
    return pd;
  }

  protected abstract Product CreateProduct(String owner);
  protected abstract void setInfo(Product pd);
  protected abstract void registerProduct(Product pd);
}
