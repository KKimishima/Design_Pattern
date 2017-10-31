package KKimishima.product;

import KKimishima.framework.Creator;
import KKimishima.framework.Product;

import java.sql.Connection;
import java.util.ArrayList;

public class ConcreteCreator extends Creator{
  ArrayList<Product> owners = new  ArrayList<>();
  private int num;

  public ConcreteCreator(){
    this.num = 0;
  }

  @Override
  protected Product CreateProduct(String owner) {
    return new CancereProduct(owner);
  }

  @Override
  protected void setInfo(Product pd){
    this.num++;
  }
  @Override
  protected void registerProduct(Product pd){
    owners.add((Product)getOwners());

  }

  public ArrayList<Product> getOwners() {
    return owners;
  }
}
