
package Kimishima.idcard;
import  Kimishima.framework.Factory;
import Kimishima.framework.Product;

import java.util.ArrayList;

public class IDCardFactory extends Factory{
  private ArrayList<String> owners = new ArrayList<>();

  @Override
  protected Product createProduct(String owner){
    return new IDCard(owner);
  }
  @Override
  protected void regesterProduct(Product pd){
    this.owners.add(((IDCard)pd).getOwner());
  }

  public ArrayList<String> getOwners() {
    return owners;
  }
}

