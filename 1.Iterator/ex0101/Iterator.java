//イテレイタのAPI
public interface Iterator<E> {
  // 次の要素があるか確認
  public abstract boolean hasNext();
  // 要素を取り取り出して次に進める
  // ジェネリクスを使い決定するまで型を持たない
  public abstract E next();
}
