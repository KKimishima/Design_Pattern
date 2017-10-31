// 集合体を示すインターフェス
// このインターフェスで宣言するメソッドは一つだけである
// 集合体に対応するIteratorを作成するためのもの
// 集合体を数えたり、スキャンを行うときは、このitetartorメソッドを使い
// Iteratorインターフェイスが実装したインスタンスを作成する
package Kimishima;

public interface Aggregate{
  Iterator itetartor();
}
