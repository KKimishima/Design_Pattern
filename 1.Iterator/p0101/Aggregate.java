// 集合を定義する
// itreatorを作り出すインターフェイスを定義するAPI
// ConcreteAgggateの要素を順番にスキャンするを定義する
public interface Aggregate {
  // itrateatorを作りそのobjct(interator)を返す
  public abstract Iterator iterator();
}
