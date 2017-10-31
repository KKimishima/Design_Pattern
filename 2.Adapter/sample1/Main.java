// メインクラス
public class Main {
  public static void main(String[] args) {
    // 継承クラスを使ったアダプタパターン
    Print ps = new PrintBanner("アダプタテスト");
    ps.printStrong();
    ps.printWeek();

    // 移譲を使ったアダプタパターン
    TransferPrint ps2 = new TransferPrintBanner("移譲を使ったアダプタ");
    ps2.PrintStrong();
    ps2.PrintWeek();
  }
}
