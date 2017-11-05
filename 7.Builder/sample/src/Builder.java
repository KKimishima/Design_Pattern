/**
 * builderクラス<br>
 *   文章を作成するインターフェイス
 */
interface Builder {
  /**
   * makeTiteメソッド<br>
   *   タイトルを構築するメソッド
   * @param tile タイトル文字列
   */
  public abstract void makeTile(String tile);

  /**
   * makeStringメソッド<br>
   *   文字列を構築するメソッド
   * @param str 構築する文字列
   */
  public abstract void makeString(String str);

  /**
   * makeItemsメソッド<br>
   *   箇条書きを構築するメソッド
   * @param items 箇条書きの文字列
   */
  public abstract void makeItems(String[] items);

  /**
   * closeメソッド<br>
   *   文章を完成させるメソッド
   */
  public abstract void close();
}
