// 融合の具体的な実装
public class Rrecord implements Aggregate{
  // フィールド
  private int count;
  private Field[] fields;

  // 最大のフィールド数を指定
  // その数だけインスタンスを作製
  public Rrecord(int maxSize){
    this.fields = new Field[maxSize];
    this.count = 0;
  }

  // メソッド
  // カウントObjectの数を
  public int getlength(){
    return count;
  }
  // 指定の番号Objectを返す
  public Field getRecord(int index) {
    return this.fields[index];
  }
  // Objectを収納する
  public void addFieds(Field field){
    this.fields[this.count] = field;
    this.count++;
  }

  // インターフェイスの実装
  // ここで作製したObjectを引き渡すための実装

  public Iterator<Field> itretator(){
    return new RecordIterator(this);
  }
}
