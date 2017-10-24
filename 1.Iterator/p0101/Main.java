// テストクラス

public class Main {
  public static void main(String[] args) {
    // 具体的な集合のインスタンスを作製
    // 配列の数の初期化を行う
    ConcreteAggregate concreteAggregate = new ConcreteAggregate(4);

    // 要素を追加していく
    concreteAggregate.appendPreson(new Preson("1さん"));
    concreteAggregate.appendPreson(new Preson("2さん"));
    concreteAggregate.appendPreson(new Preson("3さん"));
    concreteAggregate.appendPreson(new Preson("4さん"));

    // 上記の手順で作製してきたデータをiteratorに渡す
    // その際にAggregateのAPIを通るようにしておく
    Iterator iterator = concreteAggregate.iterator();

    while (iterator.hasNext()){
      Preson preson = (Preson) iterator.next();
      System.out.println(preson.getName());
    }
  }
}
