package KKimishima.product;
import KKimishima.framework.Product;

public class CancereProduct implements Product{
  private String owner;
  private int autoNum;

  public CancereProduct(String owner){
    this.owner = owner;
    System.out.println(owner+"さん登録");
  }

  @Override
  protected  void use(){
    System.out.println(owner + "さんの情報実行");
  }

  @Override
  protected   void showInfo(){
  System.out.println();
  }
}
