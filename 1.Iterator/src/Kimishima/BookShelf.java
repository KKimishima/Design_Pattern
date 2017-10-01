// 本棚を示すクラスである
// 集合をとして扱うためのAggregateインターフェスの実装を行っている
//
package Kimishima;

public class BookShelf implements Aggregate{
  // フィールド
  private Book[] books;       // Booksの配列
  private  int last = 0;

  // コンストラクター
  public BookShelf(int max){  // インタンスの数を指定
    this.books = new Book[max];
  }

  // メソッド
  public Book getBookAt(int index){
    return books[index];
  }
  public void append(Book book){
    this.books[last] = book;
    last++;
  }
  public int getLength(){
    return this.last;
  }

  // ここが,Aggregateの実装部分
  // BookShelfIteratorというクラスのインスタンスを作成して返す。
  // 本数を数えるときに、このメソッドが呼び出される
  @Override
  public Iterator itetartor(){
    return new BookShelfIterator(this);
  }
}
