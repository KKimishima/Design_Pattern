// Iteatorの具体的な実装
public class ConcreteIterator implements Iterator {
  // フィールド
  // 収納したObjectを受け取る変数
  private ConcreteAggregate concreteAggregate;
  // 選択されているobjctの位置
  private int index;

  // コンストラクタ
  // Aggregateので実装されたIPAを受け取り収納
  // 現在地の初期化
  public ConcreteIterator(ConcreteAggregate concreteAggregate){
    this.concreteAggregate = concreteAggregate;
    this.index = 0;
  }

  // Iteratorの実装
  @Override
  // 集合の具体的な実装からindex番号を指定して
  // 値を取り出してindex番号を足す
  public Object next(){
    Preson preson = this.concreteAggregate.getPreson(this.index);
    this.index++;
    return preson;
  }

  @Override
  public boolean hasNext(){
    // 配列の数とindex番号を比較
    // 配列の初期化が4の場合
    // 初期値の例. 0 < 4(正しいtrue)
    // 最後の場合. 4 < 4(間違ってるfalse)
    if(this.index < this.concreteAggregate.getLength()){
      return true;
    }else{
      return false;
    }
  }
}
