// メソッドuseを実装する
// フレームワークが側の肉付けをする
// 認証カードを示すIDCardというクラスを実装する
// フレームワークから分離するためにidcardパッケージに分離する
package Kimishima.idcard;
import  Kimishima.framework.Product;

public class IDCard extends Product{
  private String owner;
  public IDCard(String owner){
    System.out.println(owner + "さんのカード作製します");
    this.owner = owner;
  }
  @Override
  public void use(){
    System.out.println(this.owner+"さんのカードを使用します");
  }

  public String getOwner() {
    return owner;
  }
}
