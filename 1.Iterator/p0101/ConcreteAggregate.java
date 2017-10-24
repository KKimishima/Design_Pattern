import java.util.ArrayList;

// 具体的な集合の定義
// Aggregate(集合のAPI実装)
public class ConcreteAggregate implements Aggregate{
  // フィールド
  // 集合を収納する変数(preson)
  private ArrayList<Object> preson;

  // コンストラクタ
  public ConcreteAggregate(int initSize){
    // 要素の収納
    // ArrayListの初期値をもらってセット
   this.preson = new ArrayList<Object>(initSize);
  }

  // メソッド
  // 取り出すintの番号を受取
  // 収納したobjectを返す
  public Preson getPreson(int index) {
    return (Preson)this.preson.get(index);
  }
  // Objectを収納してする
  public void appendPreson(Preson preson){
    this.preson.add(preson);
  }
  // 収納したobjectの数を返す
  public int getLength(){
    return this.preson.size();
  }

  // Aggregateの実装
  // Itretorのobjectのインスタンスを作り
  // この現在のobject(ConctedAggregate)を返す
  @Override
  public Iterator iterator(){
    return new ConcreteIterator(this);
  }
}
