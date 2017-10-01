// 本棚をスキャンするクラス
// BookShelfIteratorをIteratorとして扱うために
// Iteratorインターフェイスを実装している

package Kimishima;

public class BookShelfIterator implements Iterator{
  // フィールド
  //BookShelfフィールドは、BookShelfIteratorスキャンする本棚
  //indexが注目している本を指す
  private BookShelf bookShelf;  
  private int index;
  
  // コンストラクタ
  // 渡されたbookShelfをBookShelfのインスタンスにし
  // indexを0にする
  public BookShelfIterator(BookShelf bookShelf){
    this.bookShelf = bookShelf;
    this.index = 0;
  }
  
  // メソッド
  // 次の本があるか調べて有るなら、ture
  // 無いなら falseを返す
  // indexが本棚の本数より大きいか小さいかで判別
  // bookShelf.getLength(
  @Override
  public boolean hasNext(){
    if(index < bookShelf.getLength()){
      return true;
    }else{
      return false;
    }
  }
  //注目している本を返し、更に次の本を返すメソッド
  //戻り値としてbookよいう変数を返し次のindexに進める
  @Override
  public Object next(){
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
  }
}
