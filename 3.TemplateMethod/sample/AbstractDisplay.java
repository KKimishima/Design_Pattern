// DesPlayメソッドのみを実装したパターン
public abstract class AbstractDisplay {
  public abstract void Open();
  public abstract void Print();
  public abstract void Close();

  // 操作の手順を記述
  public final void  Display(){
    Open();
    for (int i = 0; i < 5; i++){
      Print();
    }
    Close();
  }
}
