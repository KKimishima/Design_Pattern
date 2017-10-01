// 数え上げ、スキャンを行うインターフェス
// 要素を数え上げてを行うもので、ループ変数のような役割を果たす
package Kimishima;

//Aggregateの実装を行っている
public interface Iterator{
  // つぎの要素があるか調べる
  // 要素があれば、trueを返し
  // 要素なければ、falseを返す
  // 上記の場合、ループを終了させる
  boolean hasNext();
  // つぎの要素を習得するメソッド
  // Object型を返す
  // このメソッドが呼び出された場合、
  // 内部状態をつぎの状態に勧めておく
  Object  next();
}
