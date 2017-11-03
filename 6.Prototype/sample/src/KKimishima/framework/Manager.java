package framework;

import java.util.HashMap;

/**
 * Produntインターフェイスを利用して<br>
 * インスタンスを複数作製するクラス
 * @author K.Kimishima
 */
public class Manager {
  // 登録を用のインスタン
  private HashMap<String,Product> showcase = new HashMap<>();

  /**
   * registerメソッドは、製品名とインスタンスの対応表をHasMapに登録する
   * @param name 登録する製品名
   * @param product 製品のインスタンス
   */
  public void register(String name,Product product){
    this.showcase.put(name,product);
  }

  /**
   * Productメソッドは、複製するProductインスタンを受け取り複製して返す
   * @param proName 複製するインスタンス名
   * @return 複製したProduc方のインスタンスを返す
   */

  public Product create(String proName){
    Product p = showcase.get(proName);
    return  p.createClone();
  }
}
