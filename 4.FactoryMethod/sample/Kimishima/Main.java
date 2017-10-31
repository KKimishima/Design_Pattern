package Kimishima;
import Kimishima.framework.Factory;
import Kimishima.framework.Product;
import Kimishima.idcard.IDCardFactory;

public class Main {
  public static void main(String[] args) {
    Factory fac = new IDCardFactory();
    Product test1 = fac.create("test1");
    Product test2 = fac.create("test2");
    Product test3 = fac.create("test3");
    Product test4 = fac.create("test4");

    test1.use();
    test2.use();
    test3.use();
    test4.use();
  }
}
