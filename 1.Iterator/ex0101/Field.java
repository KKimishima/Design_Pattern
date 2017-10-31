// 集合に対する要素
public class Field {
  // フィールド
  private String  name;
  private int     price;
  private int     weight;

  public Field(String name,int price,int weight){
    this.name = name;
    this.price= price;
    this.weight= weight;
  }

  //getter
  public String getName() {
    return name;
  }
  public int getPrice() {
    return price;
  }
  public int getWeight() {
    return weight;
  }
}
