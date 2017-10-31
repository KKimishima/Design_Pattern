
public class RecordIterator implements Iterator {
  private int index;
  private Rrecord record;

  public RecordIterator(Rrecord record){
    this.record = record;
    this.index = 0;
  }

  // 実装
  @Override
  public boolean hasNext() {
    // 初期値例 0 < 3 (正しいtrue)
    // 最後の例 3 < 3 (正しく無いfalse)
    if (this.index < record.getlength()) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public Field next(){
    Field field = this.record.getRecord(this.index);
    this.index++;
    return field;
  }
}
