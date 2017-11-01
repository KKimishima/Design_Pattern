package KKimishima;

import KKimishima.framework.Creator;
import KKimishima.framework.Product;
import KKimishima.product.ConcreteCreator;

public class Main {
  public static void main(String[] args) {
    Creator cr = new ConcreteCreator();
    Product pd1 = cr.create("test1");
    Product pd2 = cr.create("test2");

    pd1.use();
    pd2.use();

  }
}
