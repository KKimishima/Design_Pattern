package KKimishima.product;
import KKimishima.framework.Product;

public class ConcreteProduct implements Product{
  private String owner;
  private int hasNum;

  public ConcreteProduct(String owner, int hasNum){
    this.owner = owner;
    this.hasNum = hasNum;
    System.out.println("("+this.hasNum+")"+this.owner+"さん登録");
  }

  @Override
  public void use(){
    System.out.println("("+this.hasNum+")"+this.owner+"さん情報表示");
  }

  public String getOwner() {
    return owner;
  }

  public int getHasNum() {
    return hasNum;
  }
}
