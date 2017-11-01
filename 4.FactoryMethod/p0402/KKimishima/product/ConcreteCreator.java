package KKimishima.product;

import KKimishima.framework.Creator;
import KKimishima.framework.Product;
import java.util.HashMap;

public class ConcreteCreator extends Creator{
  private HashMap<Integer,String> owners = new HashMap<>();
  private int num = 0;


  @Override
  protected Product CreateProduct(String owner) {
    return new ConcreteProduct(owner,num++);
  }

  @Override
  protected void registerProduct(Product pd){
    ConcreteProduct i = (ConcreteProduct) pd;
    owners.put(new Integer(i.getHasNum()),i.getOwner());
  }

  public HashMap<Integer,String> getOwners() {
    return owners;
  }

}
