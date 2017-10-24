// 実行テストクラス

package Kimishima;
public class Main {
  public static void main(String args[]) {
    // 本棚インスタンスの作製
    BookShelf bf = new BookShelf(4);

    // 本棚インスタンスに本の追加
    bf.append(new Book("1.テスト"));
    bf.append(new Book("2.テスト"));
    bf.append(new Book("3.テスト"));
    bf.append(new Book("4.テスト"));

    // イテレータインスタンスに変数代入
    Iterator it = bf.itetartor();

    while (it.hasNext()) {
      Book book = (Book)it.next();
      System.out.println(book.getName());
    }
  }
}
