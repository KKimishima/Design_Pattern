// 本を示すクラス
// 本の名前をコンストラクタで習得して、
// getterで習得するだけ
package Kimishima;

public class Book{
  // フィールド
  private String name;
  // コンストラクター
  public Book(String a){
    this.name = a;
  }
  //getter
  public String getName(){return this.name;}
}
