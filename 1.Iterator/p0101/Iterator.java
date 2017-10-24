 // 要素を順番にスキャンしていくAPI
 // 要素の確認のメソッド
 // 次の要素に進めるメソッドを定義する
public interface Iterator {
    // 要素を確認するメソッド
   // 要素がある場合はtureを返し
   // 要素がないときfalseを返す
   public abstract  boolean hasNext();

   // 要素を次のものに進めるメソッド
   // 次の要素に勧めて進める前のobjectを返す
  public abstract  Object next();
}
